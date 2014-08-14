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

class TimeToFirstAndLastResultEvaluation extends TorqueDeployableAlgorithm {
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

    val numberOfWorkers = parameters("numWorkers").toInt

    val graphBuilder = new GraphBuilder[Long, Any].withNodeProvisioner(new LocalNodeProvisioner[Long, Any](fixedNumberOfWorkers = Some(numberOfWorkers)))

    val tr = new TripleRush(graphBuilder, optimizerCreator = optimizerCreator)
    println("TripleRush has been started.")

    var commonResults = parameters
    commonResults += "numberOfNodes" -> tr.graph.numberOfNodes.toString
    commonResults += "jitRepetitions" -> warmupRuns.toString
    commonResults += "numberOfWorkers" -> tr.graph.numberOfWorkers.toString
    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")
    commonResults += ((s"optimizerName", optimizerCreatorName.toString()))
    commonResults += s"loadNumber" -> datasetSize.toString
    commonResults += s"dataSet" -> s"LUBM $datasetSize"

    commonResults += s"workers" -> numberOfWorkers.toString()

    val lubmQueries = LubmQueries.SparqlQueries
    val lubmNtriplesFileLocation = s"lubm$datasetSize-nt"

    val bsbmQueriesObjectName = s"com.signalcollect.triplerush.evaluation.BerlinSparqlParameterized100"
    val bsbmNtriplesFileLocation = s"berlinsparql_100-nt/dataset_100.nt"

    def loadLubmFromNt(datasetSize: Int) {
      val folderName = s"lubm$datasetSize-nt"

      val sourceFiles = filesIn(folderName).
        filter(_.getName.endsWith(".nt")).
        sorted

      for (src <- sourceFiles) {
        val ntFile = s"$src"
        tr.loadNtriples(ntFile, Some(0))
      }
    }

    val loadingTime = measureTime {
      tr.loadNtriples(bsbmNtriplesFileLocation, Some(0))
      loadLubmFromNt(datasetSize.toInt)
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
    commonResults += (("loadingTime", loadingTime.toString))

    def warmupForXMs(query: Sparql, patterns: Seq[TriplePattern], selectVariables: Int, timeOut: Int) {
      val warmUpStartTime = System.nanoTime()
      var secondsElapsed = 0l
      while (secondsElapsed < timeOut) {
        println(s"Running warmup. Query: ${patterns.mkString(", ")}")
        val result = executeEvaluationRun(query, patterns, selectVariables, 0, "0", 0, tr, optimizer, commonResults)
        val timeAfterWarmup = System.nanoTime()
        secondsElapsed = timeAfterWarmup - warmUpStartTime
      }
      tr.awaitIdle
      JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
    }

    commonResults += s"warmupTime" -> "-"

    JvmWarmup.sleepUntilGcInactiveForXSeconds(60, 180)
    val resultReporter = new GoogleDocsResultHandler(spreadsheetUsername, spreadsheetPassword, spreadsheetName, worksheetName)

    for (queryId <- lubmQueries.size to 1 by -1) {
      val queryString = lubmQueries(queryId - 1)
      val queryOption = Sparql(queryString)(tr)
      val query = queryOption.get
      val patterns = query.encodedPatternUnions
      val firstPatternSequence = patterns(0)
      val selectVariables = VariableEncoding.requiredVariableBindingsSlots(firstPatternSequence)
      if (patterns.size == 1 && firstPatternSequence.size >= 3) {

        val optimizedQuery = tr.getQueryPlan(firstPatternSequence, Some(optimizer))
        val optimizedQueryPlan = optimizedQuery.queryPlan
        warmupForXMs(query, optimizedQueryPlan, selectVariables, 3000)
        println(s"Finished warm-up for query id $queryId. query: ${firstPatternSequence.mkString(", ")}")

        val totalPlanningDuration = roundToMillisecondFraction(optimizedQuery.totalPlanningDuration)
        val statsGatheringTime = roundToMillisecondFraction(optimizedQuery.statsGatheringTime)
        val actualOptimizerTime = roundToMillisecondFraction(optimizedQuery.actualOptimizerTime)
        commonResults += (("totalPlanningDuration", totalPlanningDuration.toString))
        commonResults += (("statsGatheringTime", statsGatheringTime.toString))
        commonResults += (("actualOptimizerTime", actualOptimizerTime.toString))

        for (queryRun <- 1 to 11) {
          println(s"Running evaluation for query $queryId.")
          for (patternsSlice <- 0 to (optimizedQueryPlan.size - 1)) {
            val querySliceToExecute = optimizedQueryPlan.slice(0, patternsSlice + 1)
            val selectVarStrings = query.selectVariableIds.toArray.map(id => query.idToVariableName((-id) - 1))
            val result = executeEvaluationRun(query, querySliceToExecute, selectVariables, queryRun, queryId.toString, (patternsSlice + 1), tr, optimizer, commonResults)
            println(s"Done running evaluation for query $queryId-$queryRun, slice: ${querySliceToExecute.mkString(", ")}. Awaiting idle")
            resultReporter(result)
            tr.awaitIdle
            println("Idle")
          }
          JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
        }
      }

    }

    tr.shutdown
  }

  def lookupVariableBinding(tr: TripleRush, query: Sparql, encodedResult: Array[Int])(variableName: String): String = {
    val id = query.variableNameToId(variableName)
    val index = VariableEncoding.variableIdToDecodingIndex(id)
    val encodedBinding = encodedResult(index)
    tr.dictionary.unsafeDecode(encodedBinding)
  }

  class DecodingIterator(tr: TripleRush, query: Sparql, encodedIterator: Iterator[Array[Int]]) extends Iterator[String => String] {
    def next: String => String = {
      val nextEncoded = encodedIterator.next
      lookupVariableBinding(tr: TripleRush, query, nextEncoded)
    }
    def hasNext = encodedIterator.hasNext
  }

  def executeEvaluationRun(sparqlQuery: Sparql, query: Seq[TriplePattern], selectVariables: Int, queryRun: Int, queryDescription: String, slice: Int, tr: TripleRush, optimizer: Optimizer, commonResults: Map[String, String]): Map[String, String] = {
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
    runResult += (("isColdRun", isColdRun.toString))

    //val dict = tr.dictionary

    var timeForFirstResult = 0l
    var numberOfResults = 0
    var stringLength = 0

    val startTime = System.nanoTime
    val selectVarStrings = sparqlQuery.selectVariableIds.toArray.map(id => sparqlQuery.idToVariableName((-id) - 1))
    val iterator = tr.resultIteratorForQuery(query, Some(optimizer), Some(selectVariables))
    val resultIterator = new DecodingIterator(tr, sparqlQuery, iterator)

    while (resultIterator.hasNext) {
      val res = resultIterator.next
      var arrayIndex = 0
      while (arrayIndex < selectVarStrings.length) {
        stringLength += res(selectVarStrings(arrayIndex)).length
        arrayIndex += 1
      }
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
    runResult += ((s"resultLength", stringLength.toString))
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

    runResult
  }

}
