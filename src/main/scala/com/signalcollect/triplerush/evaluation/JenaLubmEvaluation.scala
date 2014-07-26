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
import org.openrdf.repository.sail.SailRepository
import org.openrdf.query.QueryLanguage
import org.openrdf.sail.memory.MemoryStore
import com.hp.hpl.jena.rdf.model.ModelFactory
import com.hp.hpl.jena.rdf.model.Model
import com.hp.hpl.jena.query.QueryFactory
import com.hp.hpl.jena.query.QueryExecutionFactory
import com.signalcollect.GraphBuilder

class JenaLubmEvaluation extends TorqueDeployableAlgorithm {
  import SlurmEvalHelpers._

  val evaluationDescriptionKey = "evaluationDescription"
  val warmupRunsKey = "jitRepetitions"
  val datasetKey = "dataset"
  val universitiesKey = "universities"
  //val optimizerCreatorKey = "optimizerCreator"
  val spreadsheetUsernameKey = "spreadsheetUsername"
  val spreadsheetPasswordKey = "spreadsheetPassword"
  val spreadsheetNameKey = "spreadsheetName"
  val worksheetNameKey = "worksheetName"

  def execute(parameters: Map[String, String], nodeActors: Array[ActorRef]) {
    new GraphBuilder[Long, Any]().withPreallocatedNodes(nodeActors).build.shutdown
    println("Jena Eval")
    println(s"Received parameters $parameters")
    val evaluationDescription = parameters(evaluationDescriptionKey)
    val warmupRuns = parameters(warmupRunsKey).toInt
    val dataset = parameters(datasetKey)
    val datasetSize = parameters("universities")

    val spreadsheetUsername = parameters(spreadsheetUsernameKey)
    val spreadsheetPassword = parameters(spreadsheetPasswordKey)
    val spreadsheetName = parameters(spreadsheetNameKey)
    val worksheetName = parameters(worksheetNameKey)
    var commonResults = parameters
    commonResults += "numberOfNodes" -> "1"
    commonResults += "numberOfWorkers" -> "-"
    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")

    val ntriplesFileLocation = s"lubm$datasetSize-nt"

    val jena = ModelFactory.createDefaultModel

    val loadingTime = measureTime {
      val sourceFiles = filesIn(ntriplesFileLocation).
        filter(_.getName.endsWith(".nt")).
        sorted

      for (src <- sourceFiles) {
        val ntFile = s"$src"
        jena.read(ntFile, "N-TRIPLE")
      }
    }

    println(s"Finished loading")

    JvmWarmup.sleepUntilGcInactiveForXSeconds(60, 180)

    commonResults += ((s"optimizerInitialisationTime", "-"))
    commonResults += ((s"optimizerName", "-"))
    commonResults += (("loadingTime", loadingTime.toString))
    commonResults += s"loadNumber" -> datasetSize.toString
    commonResults += s"dataSet" -> s"berlinsparql $datasetSize"

    val queries = LubmQueries.SparqlQueries

    println(s"Starting warm-up... total $warmupRuns")

    def warmup {
      if (warmupRuns != 0) {
        for (i <- (1 to warmupRuns / 7)) {
          println(s"Running warmup $i/$warmupRuns")
          for (query <- queries) {
            val result = executeEvaluationRun(query, "0", 0, jena, commonResults)
          }
        }
        println(s"Finished warm-up.")
        JvmWarmup.sleepUntilGcInactiveForXSeconds(60)
      }
    }

    val warmupTime = measureTime(warmup)
    commonResults += s"warmupTime" -> warmupTime.toString

    val resultReporter = new GoogleDocsResultHandler(spreadsheetUsername, spreadsheetPassword, spreadsheetName, worksheetName)

    for (queryId <- queries.size to 1 by -1) {
      val query = queries(queryId - 1)
      for (queryRun <- 1 to 10) {
        println(s"Running evaluation for query $queryId.")
        val result = executeEvaluationRun(query, s"${queryId.toString}", queryRun, jena, commonResults)
        resultReporter(result)
        println(s"Done running evaluation for query $queryId. Awaiting idle")
        println("Idle")

        JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
      }
    }
    jena.close
  }

  def executeEvaluationRun(queryString: String, queryDescription: String, queryRun: Int, jena: Model, commonResults: Map[String, String]): Map[String, String] = {
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

    val startTime = System.nanoTime
    val query = QueryFactory.create(queryString)
    val qe = QueryExecutionFactory.create(query, jena)
    val results = qe.execSelect

    var numberOfResults = 0
    while (results.hasNext) {
      numberOfResults += 1
      val result = results.next
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