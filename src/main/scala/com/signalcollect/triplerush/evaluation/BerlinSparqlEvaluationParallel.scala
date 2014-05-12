package com.signalcollect.triplerush.evaluation

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
import com.signalcollect.triplerush.sparql.Sparql
import com.signalcollect.triplerush.Dictionary

class BerlinSparqlEvaluationParallel extends TorqueDeployableAlgorithm {
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

    val graphBuilder = GraphBuilder.withPreallocatedNodes(nodeActors)
    val tr = new TripleRush(graphBuilder)
    println("TripleRush has been started.")

    var commonResults = parameters
    commonResults += "numberOfNodes" -> tr.graph.numberOfNodes.toString
    commonResults += "jitRepetitions" -> warmupRuns.toString
    commonResults += "numberOfWorkers" -> tr.graph.numberOfWorkers.toString
    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")

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

    JvmWarmup.sleepUntilGcInactiveForXSeconds(60, 180)

    commonResults += ((s"optimizerInitialisationTime", optimizerInitialisationTime.toString))
    commonResults += ((s"optimizerName", "ExplorationOptimizer"))
    commonResults += (("loadingTime", loadingTime.toString))
    commonResults += s"loadNumber" -> datasetSize.toString
    commonResults += s"dataSet" -> s"berlinsparql $datasetSize"

    val queriesObject = Class.forName(queriesObjectName).newInstance.asInstanceOf[BerlinSparqlQueries]
    val queries = queriesObject.queries

    println(s"Queries Object: $queriesObjectName")
    println(s"Starting warm-up... total $warmupRuns")

    def warmup {
      var subWarmUpRun = 1
      if (warmupRuns != 0) {
        for (i <- 1 to (warmupRuns / 20)) {
          for ((queryId, listOfSubQueryIds) <- queriesObject.warmupQueries) {
            val listOfQueries = queries(queryId)
            for (subQueryId <- listOfSubQueryIds) {
              val query = listOfQueries(subQueryId)
              println(s"Running warmup $subWarmUpRun for query $queryId-$subQueryId.")
              val result = executeEvaluationRun(query, 0, s"${queryId.toString}-${subQueryId.toString}", tr, commonResults)
              subWarmUpRun += 1
            }
          }
        }
      }
    }

    val warmupTime = measureTime(warmup)
    commonResults += s"warmupTime" -> warmupTime.toString

    println(s"Finished warm-up.")
    JvmWarmup.sleepUntilGcInactiveForXSeconds(60, 180)
    val resultReporter = new GoogleDocsResultHandler(spreadsheetUsername, spreadsheetPassword, spreadsheetName, worksheetName)

    for ((queryId, listOfSubQueryIds) <- queriesObject.queriesWithResults) {
      val listOfQueries = queries(queryId)
      var queryRun = 1
      for (subQueryId <- listOfSubQueryIds) {
        if (queryRun <= 11) {
          val query = listOfQueries(subQueryId)
          println(s"Running evaluation for query $queryId-$subQueryId.")
          val result = executeEvaluationRun(query, queryRun, s"${queryId.toString}", tr, commonResults)
          resultReporter(result)
          println(s"Done running evaluation for query $queryId-$subQueryId. Awaiting idle")
          JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
          println("Idle")
          queryRun += 1
        }
      }
    }

    tr.shutdown
  }

    def executeEvaluationRun(queryString: String, queryRun: Int, queryDescription: String, tr: TripleRush, commonResults: Map[String, String]): Map[String, String] = {
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

      val startTime = System.nanoTime
      val queryOption = Sparql(queryString)(tr)
      val query = queryOption.get
      val resultIterator = query.resultIterator

      var numberOfResults = 0
      while (resultIterator.hasNext) {
        val res = resultIterator.next
        numberOfResults += 1
      }

      val finishTime = System.nanoTime
      val executionTime = roundToMillisecondFraction(finishTime - startTime)
      val gcTimeAfter = getGcCollectionTime(gcs)
      val gcCountAfter = getGcCollectionCount(gcs)
      val gcTimeDuringQuery = gcTimeAfter - gcTimeBefore
      val gcCountDuringQuery = gcCountAfter - gcCountBefore
      val compileTimeAfter = compilations.getTotalCompilationTime
      val compileTimeDuringQuery = compileTimeAfter - compileTimeBefore
      runResult += ((s"queryId", queryDescription))
      runResult += ((s"queryRunId", queryRun.toString))
      runResult += ((s"results", numberOfResults.toString))
      runResult += ((s"query", queryString))
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
      runResult
  }
  }
