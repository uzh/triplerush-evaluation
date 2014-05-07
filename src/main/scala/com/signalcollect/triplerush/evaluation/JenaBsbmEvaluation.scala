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

class JenaBsbmEvaluation extends TorqueDeployableAlgorithm {
  import JenaBsbmEvalHelpers._

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

    val queriesObjectName = s"com.signalcollect.triplerush.evaluation.BerlinSparqlParameterized$datasetSize"
    val ntriplesFileLocation = s"berlinsparql_$datasetSize-nt/dataset_$datasetSize.nt"

    val jena = ModelFactory.createDefaultModel

    val loadingTime = measureTime {
      jena.read(ntriplesFileLocation, "N-TRIPLE")
    }

    println(s"Finished loading")

    JvmWarmup.sleepUntilGcInactiveForXSeconds(60, 180)

    commonResults += ((s"optimizerInitialisationTime", "-"))
    commonResults += ((s"optimizerName", "-"))
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
              val result = executeEvaluationRun(query, s"${queryId.toString}-${subQueryId.toString}", 0, jena, commonResults)
              subWarmUpRun += 1
            }
          }
        }
      }
    }

    val warmupTime = measureTime(warmup)
    commonResults += s"warmupTime" -> warmupTime.toString

    val resultReporter = new GoogleDocsResultHandler(spreadsheetUsername, spreadsheetPassword, spreadsheetName, worksheetName)

    for ((queryId, listOfSubQueryIds) <- queriesObject.queriesWithResults) {
      val listOfQueries = queries(queryId)
      var queryRun = 1
      for (subQueryId <- listOfSubQueryIds) {
        if (queryRun <= 11) {
          val query = listOfQueries(subQueryId)
          println(s"Running evaluation for query $queryId-$subQueryId.")
          val result = executeEvaluationRun(query, s"${queryId.toString}", queryRun, jena, commonResults)
          resultReporter(result)
          println(s"Done running evaluation for query $queryId-$subQueryId. Awaiting idle")
          JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
          println("Idle")
          queryRun += 1
        }
      }
    }
    jena.close
  }

}

object JenaBsbmEvalHelpers {

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

  def loadLubm(universities: Int, triplerush: TripleRush, rdfTypePartitioning: Boolean) {
    println(s"Loading LUBM $universities ...")
    val lubmFolderName =
      if (rdfTypePartitioning) {
        println(s"rdfTypePartitioning is true, directory is: lubm$universities-type-filtered-splits")
        s"lubm$universities-type-filtered-splits"
      } else {
        println(s"rdfTypePartitioning is false, directory is: lubm$universities-filtered-splits")
        s"lubm$universities-filtered-splits"
      }
    for (splitId <- 0 until 2880) {
      val splitFile = s"./$lubmFolderName/$splitId.filtered-split"
      triplerush.loadBinary(splitFile, Some(splitId))
      if (splitId % 288 == 279) {
        println(s"Dispatched up to split #$splitId/2880, awaiting idle.")
        triplerush.awaitIdle
        println(s"Continuing graph loading...")
      }
    }
  }

  def loadLubmFromNTriples(universities: Int, triplerush: TripleRush) {
    println(s"Loading LUBM $universities ... from NTriples")
    val lubmFolderName = s"lubm$universities-nt"

    val sourceFiles = filesIn(lubmFolderName).
      filter(_.getName.endsWith(".nt")).
      sorted

    for (src <- sourceFiles) {
      println(s"src: $src")
      val ntFile = s"$src"
      triplerush.loadNtriples(ntFile)
    }
  }

  def getObject[T](o: String): T = {
    val runtimeMirror = universe.runtimeMirror(getClass.getClassLoader)
    val module = runtimeMirror.staticModule(o)
    val obj = runtimeMirror.reflectModule(module).instance
    obj.asInstanceOf[T]
  }

  def getRevision: String = {
    try {
      val gitLogPath = ".git/logs/HEAD"
      val gitLog = new File(gitLogPath)
      val lines = Source.fromFile(gitLogPath).getLines
      val lastLine = lines.toList.last
      val revision = lastLine.split(" ")(1)
      revision
    } catch {
      case t: Throwable => "Unknown revision."
    }
  }

  def bytesToGigabytes(bytes: Long): Double = ((bytes / 1073741824.0) * 10.0).round / 10.0

  def cleanGarbage {
    for (i <- 1 to 10) {
      System.runFinalization
      System.gc
      Thread.sleep(10000)
    }
    Thread.sleep(120000)
  }

  /**
   * Returns the time in milliseconds it takes to execute the code in 'codeBlock'.
   */
  def measureTime(codeBlock: => Unit): Long = {
    val startTime = System.currentTimeMillis
    codeBlock
    val finishTime = System.currentTimeMillis
    finishTime - startTime
  }

  def roundToMillisecondFraction(nanoseconds: Long): Double = {
    ((nanoseconds / 100000.0).round) / 10.0
  }

  /**
   * Go to JVM JIT steady state by executing the queries multiple times.
   */
  def jitSteadyState(queries: List[Seq[TriplePattern]], optimizer: Option[Optimizer], tr: TripleRush, repetitions: Int = 100) {
    for (i <- 1 to repetitions) {
      println(s"running warmup $i/$repetitions")
      for (query <- queries) {
        tr.executeQuery(query, optimizer)
        tr.awaitIdle
      }
    }
    println(s"warmup finished")
  }

  def getGcCollectionTime(gcs: List[GarbageCollectorMXBean]): Long = {
    gcs.map(_.getCollectionTime).sum
  }

  def lastGcId(gcs: List[GarbageCollectorMXBean]): Long = {
    val sunGcs = gcs map (_.asInstanceOf[com.sun.management.GarbageCollectorMXBean])
    val gcIds = sunGcs.
      map(_.getLastGcInfo).
      flatMap(info => if (info != null) Some(info.getId) else None)
    if (gcIds.isEmpty) 0 else gcIds.max
  }

  def freedDuringLastGc(gcs: List[GarbageCollectorMXBean]): Long = {
    val sunGcs = gcs map (_.asInstanceOf[com.sun.management.GarbageCollectorMXBean])
    val usedBeforeLastGc = sunGcs.
      map(_.getLastGcInfo).
      map(_.getMemoryUsageBeforeGc).
      flatMap(_.values).
      map(_.getCommitted).
      sum
    val usedAfterLastGc = sunGcs.
      map(_.getLastGcInfo).
      map(_.getMemoryUsageAfterGc).
      flatMap(_.values).
      map(_.getCommitted).
      sum
    val freedDuringLastGc = usedBeforeLastGc - usedAfterLastGc
    freedDuringLastGc
  }

  def getGcCollectionCount(gcs: List[GarbageCollectorMXBean]): Long = {
    gcs.map(_.getCollectionCount).sum
  }

}