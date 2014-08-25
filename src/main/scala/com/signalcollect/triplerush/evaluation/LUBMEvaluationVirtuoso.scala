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
import akka.actor.PoisonPill
import scala.sys.process._
import java.io.BufferedReader
import java.io.InputStreamReader

import java.sql.SQLException
import java.sql.DriverManager
import java.sql.Connection
import java.io._
import java.util.Properties

class LUBMEvaluationVirtuoso extends TorqueDeployableAlgorithm {
  import SlurmEvalHelpers._

  def execute(parameters: Map[String, String], nodeActors: Array[ActorRef]) {

    println("Virtuoso EVAL")
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

    val virtuosoHost = parameters("hostname")
    val virtuosoUserName = parameters("virtuosoUserName")
    val virtuosoPassword = parameters("virtuosoPassword")

    Class.forName("virtuoso.jdbc4.Driver");
    val jdbcConnection = DriverManager.getConnection(s"jdbc:virtuoso://$virtuosoHost:1111", s"$virtuosoUserName", s"$virtuosoPassword");

    val slurmJobId = System.getenv("SLURM_JOB_ID")
    val userName = System.getenv("USER")
    val workingDir = s"/home/slurm/$userName-$slurmJobId"
    println(s"working directory is: $workingDir")

    val ntriplesDirectory = s"/home/user/bpaudel/lubm$datasetSize-nt/"
    println(s"ntriplesdir: $ntriplesDirectory")

    val queries = LubmQueries.SparqlQueries

    println(s"Starting warm-up and evaluation")

    var commonResults = parameters
    commonResults += "jitRepetitions" -> warmupRuns.toString
    commonResults += "numberOfWorkers" -> "-"
    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")

    commonResults += ((s"optimizerInitialisationTime", "-"))
    commonResults += ((s"optimizerName", "-"))
    commonResults += s"loadNumber" -> datasetSize.toString
    commonResults += s"dataSet" -> s"LUBM $datasetSize"

    val resultReporter = new GoogleDocsResultHandler(spreadsheetUsername, spreadsheetPassword, spreadsheetName, worksheetName)

    JvmWarmup.sleepUntilGcInactiveForXSeconds(60, 180)

    for (queryId <- queries.size to 1 by -1) {
      val query = queries(queryId - 1)
      println(s"Running evaluation for query $queryId.")
      for (queryRun <- 1 to 11) {
        val isColdRun = {
          if (queryRun == 1) {
            true
          } else {
            false
          }
        }
        val result = executeEvaluationRun(query, s"${queryId.toString}", queryRun, isColdRun, commonResults, jdbcConnection)
        resultReporter(result)
        println(s"Done running evaluation for query $queryId, run: $queryRun. Awaiting idle")
        JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
        println("Idle")
      }
    }
  }

  def executeEvaluationRun(queryString: String,
    queryDescription: String,
    queryRun: Int,
    isColdRun: Boolean,
    commonResults: Map[String, String],
    connection: Connection): Map[String, String] = {

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
    runResult += (("isColdRun", isColdRun.toString))

    val query = "SPARQL " + queryString

    val startTime = System.nanoTime
    val statement = connection.createStatement()
    val result = statement.executeQuery(query)
    var numberOfResults = 0
    while (result.next()) {
      numberOfResults += 1
    }
    statement.close();
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
    runResult += ((s"resultLength", "-"))
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
