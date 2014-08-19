package com.signalcollect.triplerush.evaluation

import com.signalcollect.deployment.TorqueDeployableAlgorithm
import java.io.File
import java.lang.management.GarbageCollectorMXBean
import java.lang.management.ManagementFactory
import java.util.Date
import scala.Option.option2Iterable
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.collectionAsScalaIterable
import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import scala.io.Source
import scala.reflect.runtime.universe
import com.signalcollect.GraphBuilder
import com.signalcollect.deployment.TorqueDeployableAlgorithm
import com.signalcollect.triplerush.TripleRush
import com.signalcollect.triplerush.optimizers.Optimizer
import akka.actor.ActorRef
import com.signalcollect.triplerush.TriplePattern
import com.signalcollect.triplerush.evaluation.lubm.FileOperations._
import com.signalcollect.triplerush.optimizers.HeuristicOptimizerCreator
import com.signalcollect.triplerush.sparql.Sparql
import com.signalcollect.triplerush.sparql.VariableEncoding
import com.signalcollect.nodeprovisioning.local.LocalNodeProvisioner

class TimeToFirstAndLastResultEvaluationBSBM extends TorqueDeployableAlgorithm {
  import SlurmEvalHelpers._

  def execute(parameters: Map[String, String], nodeActors: Array[ActorRef]) {

    println("TRIPLERUSH EVAL")
    println(s"Received parameters $parameters")
    val evaluationDescription = parameters("evaluationDescription")
    val spreadsheetUsername = parameters("spreadsheetUsername")
    val spreadsheetPassword = parameters("spreadsheetPassword")
    val spreadsheetName = parameters("spreadsheetName")
    val worksheetName = parameters("worksheetName")
    val optimizerCreatorName = parameters("optimizerCreator")
    val datasetSize = parameters("universities")
    val optimizerCreator = getObject[Function1[TripleRush, Option[Optimizer]]](optimizerCreatorName)
    val warmupRuns = parameters("jitRepetitions").toInt

    //val graphBuilder = new GraphBuilder[Long, Any].withNodeProvisioner(new LocalNodeProvisioner[Long, Any](fixedNumberOfWorkers = Some(numberOfWorkers)))
    //val tr = new TripleRush(graphBuilder, optimizerCreator = optimizerCreator)

    val graphBuilder = new GraphBuilder[Long, Any]().withPreallocatedNodes(nodeActors)
    val tr = new TripleRush(graphBuilder, optimizerCreator = optimizerCreator)

    println("TripleRush has been started.")

    var commonResults = parameters
    commonResults += "numberOfNodes" -> tr.graph.numberOfNodes.toString
    commonResults += "jitRepetitions" -> warmupRuns.toString
    commonResults += "numberOfWorkers" -> tr.graph.numberOfWorkers.toString
    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")
    commonResults += ((s"optimizerName", optimizerCreator.toString()))
    commonResults += s"loadNumber" -> datasetSize.toString
    commonResults += s"dataSet" -> s"LUBM $datasetSize"

    val totalWorkers = tr.graph.getWorkerStatistics.length
    commonResults += s"totalWorkers" -> totalWorkers.toString()

    val queriesObjectName = s"com.signalcollect.triplerush.evaluation.BerlinSparqlParameterized$datasetSize"
    val ntriplesFileLocation = s"berlinsparql_$datasetSize-nt/dataset_$datasetSize.nt"

    val loadingTime = measureTime {
      tr.loadNtriples(ntriplesFileLocation)
      tr.awaitIdle
    }

    println(s"Finished loading")

    val optimizerInitialisationTime = measureTime {
      tr.prepareExecution
    }

    println(s"Finished optimizer initialization")
    val optimizer = optimizerCreator(tr).get
    JvmWarmup.sleepUntilGcInactiveForXSeconds(60, 180)

    commonResults += ((s"optimizerInitialisationTime", optimizerInitialisationTime.toString))
    commonResults += ((s"optimizerName", optimizerCreator.toString()))
    commonResults += (("loadingTime", loadingTime.toString))
    commonResults += s"loadNumber" -> datasetSize.toString
    commonResults += s"dataSet" -> s"berlinsparql $datasetSize"

    val queriesObject = Class.forName(queriesObjectName).newInstance.asInstanceOf[BerlinSparqlQueries]
    val queries = queriesObject.queries

    println(s"Queries Object: $queriesObjectName")
    println(s"Starting warm-up... ")

    //val warmupTime = measureTime(warmup)
    commonResults += s"warmupTime" -> "-"

    def warmupForXMs(patterns: Seq[TriplePattern], selectVariables: Int, timeOut: Int) {
      val warmUpStartTime = System.nanoTime()
      var secondsElapsed = 0d
      while (secondsElapsed < timeOut) {
        val result = executeEvaluationRun(patterns, selectVariables, 0, "0", 0, tr, optimizer, commonResults)
        val timeAfterWarmup = System.nanoTime()
        secondsElapsed = roundToMillisecondFraction(timeAfterWarmup - warmUpStartTime)
      }
      tr.awaitIdle
      JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
    }

    val resultReporter = new GoogleDocsResultHandler(spreadsheetUsername, spreadsheetPassword, spreadsheetName, worksheetName)

    for ((queryId, listOfSubQueryIds) <- queriesObject.queriesWithResults) {

      val listOfQueries = queries(queryId)

      val listOfWarmupSubQueryIds = queriesObject.warmupQueries(queryId)
      for (warmUpSubQueryId <- listOfWarmupSubQueryIds) {
        val warmupQueryString = listOfQueries(warmUpSubQueryId)

        val warmupQueryOption = Sparql(warmupQueryString)(tr)
        val warmupquery = warmupQueryOption.get
        val warmupPatterns = warmupquery.encodedPatternUnions
        val warmupFirstPatternSequence = warmupPatterns(0)
        val warmupSelectVariables = VariableEncoding.requiredVariableBindingsSlots(warmupFirstPatternSequence)
        if (warmupPatterns.size == 1 && warmupFirstPatternSequence.size >= 3) {
          val optimizedWarmupQuery = tr.getQueryPlan(warmupFirstPatternSequence, Some(optimizer))
          val optimizedWarmupQueryPlan = optimizedWarmupQuery.queryPlan
          warmupForXMs(optimizedWarmupQueryPlan, warmupSelectVariables, 15000)
          println(s"Running warmup for query $queryId-$warmUpSubQueryId.")
        }
      }

      var queryRun = 1
      for (subQueryId <- listOfSubQueryIds) {
        if (queryRun <= 11) {
          val queryString = listOfQueries(subQueryId)
          val queryOption = Sparql(queryString)(tr)
          val query = queryOption.get
          val patterns = query.encodedPatternUnions
          val firstPatternSequence = patterns(0)
          val selectVariables = VariableEncoding.requiredVariableBindingsSlots(firstPatternSequence)
          if (patterns.size == 1 && firstPatternSequence.size >= 3) {
            val optimizedQuery = tr.getQueryPlan(firstPatternSequence, Some(optimizer))
            val optimizedQueryPlan = optimizedQuery.queryPlan

            val totalPlanningDuration = roundToMillisecondFraction(optimizedQuery.totalPlanningDuration)
            val statsGatheringTime = roundToMillisecondFraction(optimizedQuery.statsGatheringTime)
            val actualOptimizerTime = roundToMillisecondFraction(optimizedQuery.actualOptimizerTime)
            commonResults += (("totalPlanningDuration", totalPlanningDuration.toString))
            commonResults += (("statsGatheringTime", statsGatheringTime.toString))
            commonResults += (("actualOptimizerTime", actualOptimizerTime.toString))

            for (patternsSlice <- 0 to (optimizedQueryPlan.size - 1)) {
              val querySliceToExecute = optimizedQueryPlan.slice(0, patternsSlice + 1)
              val selectVarStrings = query.selectVariableIds.toArray.map(id => query.idToVariableName((-id) - 1))
              val result = executeEvaluationRun(querySliceToExecute, selectVariables, queryRun, queryId.toString, (patternsSlice + 1), tr, optimizer, commonResults)
              println(s"Running evaluation for query $queryId-$subQueryId queryrun: $queryRun. slice ${patternsSlice + 1}: ${querySliceToExecute.mkString(", ")}. Awaiting idle")
              resultReporter(result)
              tr.awaitIdle
              println("Idle")
              JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
            }
            queryRun += 1
          }
        }
      }
    }

    tr.shutdown
  }

  def executeEvaluationRun(query: Seq[TriplePattern], selectVariables: Int, queryRun: Int, queryDescription: String, slice: Int, tr: TripleRush, optimizer: Optimizer, commonResults: Map[String, String]): Map[String, String] = {
    val gcs = ManagementFactory.getGarbageCollectorMXBeans.toList
    val compilations = ManagementFactory.getCompilationMXBean
    val javaVersion = ManagementFactory.getRuntimeMXBean.getVmVersion
    val jvmLibraryPath = ManagementFactory.getRuntimeMXBean.getLibraryPath
    val jvmArguments = ManagementFactory.getRuntimeMXBean.getInputArguments
    var runResult = commonResults
    runResult += (("javaVmVersion", javaVersion))
    runResult += (("jvmLibraryPath", jvmLibraryPath))
    runResult += (("jvmArguments", jvmArguments.mkString(" ")))
    val date: Date = new Date
    val gcTimeBefore = getGcCollectionTime(gcs)
    val gcCountBefore = getGcCollectionCount(gcs)
    val compileTimeBefore = compilations.getTotalCompilationTime
    runResult += ((s"totalMemoryBefore", bytesToGigabytes(Runtime.getRuntime.totalMemory).toString))
    runResult += ((s"freeMemoryBefore", bytesToGigabytes(Runtime.getRuntime.freeMemory).toString))
    runResult += ((s"usedMemoryBefore", bytesToGigabytes(Runtime.getRuntime.totalMemory - Runtime.getRuntime.freeMemory).toString))
    val isColdRun = (queryRun == 1)
    //runResult += (("isColdRun", isColdRun.toString))

    //val dict = tr.dictionary

    var timeForFirstResult = 0l
    var numberOfResults = 0

    val startTime = System.nanoTime
    val resultIterator = tr.resultIteratorForQuery(query, Some(optimizer), Some(selectVariables))

    while (resultIterator.hasNext) {
      resultIterator.next
      if (numberOfResults == 0) {
        timeForFirstResult = System.nanoTime()
      }
      numberOfResults += 1
    }

    val finishTime = System.nanoTime
    val firstResultExecutionTime = roundToMillisecondFraction(timeForFirstResult - startTime)
    val executionTime = roundToMillisecondFraction(finishTime - startTime)
    val firstAndLastResultDelta = executionTime - firstResultExecutionTime
    println(s"first result: $firstResultExecutionTime, total: $executionTime, numresults: $numberOfResults")

    val gcTimeAfter = getGcCollectionTime(gcs)
    val gcCountAfter = getGcCollectionCount(gcs)
    val gcTimeDuringQuery = gcTimeAfter - gcTimeBefore
    val gcCountDuringQuery = gcCountAfter - gcCountBefore
    val compileTimeAfter = compilations.getTotalCompilationTime
    val compileTimeDuringQuery = compileTimeAfter - compileTimeBefore
    //runResult += ((s"topK", topKEntities.toString))
    runResult += ((s"queryId", queryDescription))
    runResult += ((s"queryRunId", queryRun.toString))
    runResult += ((s"results", numberOfResults.toString))
    runResult += ((s"query", query.mkString(", ")))
    runResult += ((s"executionTime", executionTime.toString))
    runResult += ((s"totalMemory", bytesToGigabytes(Runtime.getRuntime.totalMemory).toString))
    runResult += ((s"freeMemory", bytesToGigabytes(Runtime.getRuntime.freeMemory).toString))
    runResult += ((s"usedMemory", bytesToGigabytes(Runtime.getRuntime.totalMemory - Runtime.getRuntime.freeMemory).toString))
    runResult += ((s"executionHostname", java.net.InetAddress.getLocalHost.getHostName))
    runResult += (("gcTimeAfter", gcTimeAfter.toString))
    runResult += (("gcCountAfter", gcCountAfter.toString))
    runResult += (("gcTimeDuringQuery", gcTimeDuringQuery.toString))
    runResult += (("gcCountDuringQuery", gcCountDuringQuery.toString))
    runResult += (("compileTimeAfter", compileTimeAfter.toString))
    runResult += (("compileTimeDuringQuery", compileTimeDuringQuery.toString))
    runResult += s"date" -> date.toString

    runResult += ((s"slice", slice.toString()))
    runResult += ((s"firstResultExecTime", firstResultExecutionTime.toString()))
    runResult += ((s"firstAndLastResultDelta", firstAndLastResultDelta.toString()))

    def medianOfList(list: List[Long]): Double = {
      val (firstHalf, secondHalf) = list.sorted.splitAt(list.size / 2)
      if (list.size % 2 == 0) {
        (firstHalf.last + secondHalf.head) / 2.0
      } else {
        secondHalf.head
      }
    }

    def statisticsFromList(list: List[Long]): (Long, Long, Double, Double) = {
      val max = list.max
      val min = list.min
      val median = medianOfList(list)
      val listSum = list.sum
      val avg = listSum.toDouble / list.size
      (max, min, median, avg)
    }

    val workerStats = tr.graph.getWorkerStatistics

    val numVerticesList = workerStats.map(_.numberOfVertices)
    val numOutEdgesList = workerStats.map(_.numberOfOutgoingEdges)
    val sgnMsgRcvList = workerStats.map(_.signalMessagesReceived)
    val bulkSgnMsgRcvList = workerStats.map(_.bulkSignalMessagesReceived)
    val msgToWorkersList = workerStats.map(_.messagesSentToWorkers)

    val (maxNumVertices, minNumVertices, medianNumVertices, avgNumVertices) = statisticsFromList(numVerticesList)
    val (maxNumOutEdges, minNumOutEdges, medianNumOutEdges, avgNumOutEdges) = statisticsFromList(numOutEdgesList)
    val (maxSgnMsgRcv, minSgnMsgRcv, medianSgnMsgRcv, avgSgnMsgRcv) = statisticsFromList(sgnMsgRcvList)
    val (maxBulkSgnMsgRcv, minBulkSgnMsgRcv, medianBulkSgnMsgRcv, avgBulkSgnMsgRcv) = statisticsFromList(bulkSgnMsgRcvList)
    val (maxMsgToWorkers, minMsgToWorkers, medianMsgToWorkers, avgMsgToWorkers) = statisticsFromList(msgToWorkersList)

    runResult += ((s"maxNumVertices", maxNumVertices.toString()))
    runResult += ((s"minNumVertices", minNumVertices.toString()))
    runResult += ((s"medianNumVertices", medianNumVertices.toString()))
    runResult += ((s"avgNumVertices", avgNumVertices.toString()))

    runResult += ((s"maxNumOutEdges", maxNumOutEdges.toString()))
    runResult += ((s"minNumOutEdges", minNumOutEdges.toString()))
    runResult += ((s"medianNumOutEdges", medianNumOutEdges.toString()))
    runResult += ((s"avgNumOutEdges", avgNumOutEdges.toString()))

    runResult += ((s"maxSgnMsgRcv", maxSgnMsgRcv.toString()))
    runResult += ((s"minSgnMsgRcv", minSgnMsgRcv.toString()))
    runResult += ((s"medianSgnMsgRcv", medianSgnMsgRcv.toString()))
    runResult += ((s"avgSgnMsgRcv", avgSgnMsgRcv.toString()))

    runResult += ((s"maxBulkSgnMsgRcv", maxBulkSgnMsgRcv.toString()))
    runResult += ((s"minBulkSgnMsgRcv", minBulkSgnMsgRcv.toString()))
    runResult += ((s"medianBulkSgnMsgRcv", medianBulkSgnMsgRcv.toString()))
    runResult += ((s"avgBulkSgnMsgRcv", avgBulkSgnMsgRcv.toString()))

    runResult += ((s"maxMsgToWorkers", maxMsgToWorkers.toString()))
    runResult += ((s"minMsgToWorkers", minMsgToWorkers.toString()))
    runResult += ((s"medianMsgToWorkers", medianMsgToWorkers.toString()))
    runResult += ((s"avgMsgToWorkers", avgMsgToWorkers.toString()))

    runResult
  }

}
