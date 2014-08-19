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

class BerlinSparqlEvaluationVirtuoso extends TorqueDeployableAlgorithm {
  import SlurmEvalHelpers._

  /**
   * Helper functions for Virtuoso and iSQL
   */
  
  //How to execute commands: 
  // example: Seq("/usr/bin/rapper", sourceFile.getAbsolutePath, "-e", "-o", "ntriples") #>> targetFile !! (ProcessLogger(println(_)))
  //https://phenoscape.org/wiki/Virtuoso
  
  def virtuoso_start(virtuosoPath: String, minionNumber:Int) = { //configfile: String, stdout='/dev/null', stderr='/dev/null ) = {
    val envPath = s"${virtuosoPath}/env$minionNumber"
    //TODO check that both commands work (cd and virtuoso)! 
    val cmdCd = s"cd ${envPath}/var/lib/virtuoso/db".!! (ProcessLogger(println(_))
    val cmd = s"$envPath/bin/virtuoso-t".!! (ProcessLogger(println(_))  //daemon_start(s"virtuoso-t -f")//reground +configfile $s$configfile", stdout = stdout, stderr = stderr)
    cmd
  }

  def isql_exec(command: String, user: String, password: String, port: Int = 1111, virtuosoPath: String, minionNumber:Int) = {
    val envPath = s"${virtuosoPath}/env$minionNumber"
    val cmd = s"${envPath}/isql $port $user $password EXEC=\"$command;\"".!! (ProcessLogger(println(_))
    cmd
  }

  def virtuoso_ld_dir_all(source: String, graph_iri: String = "http://berlin", ext: String = "*.nt", user: String, password: String, virtuosoPath: String, minionNumber:Int) = {
    isql_exec(s"ld_dir_all('$source', '$ext', '$graph_iri')", user, password, virtuosoPath, minionNumber)
  }
  
  def virtuoso_rdf_loader_run(user: String, password: String, virtuosoPath: String, minionNumber:Int) = {
    isql_exec("rdf_loader_run()", user, password, virtuosoPath, minionNumber)
    isql_exec("checkpoint;", user, password, virtuosoPath, minionNumber)
  }

  def virtuoso_clear_triples(user: String, password: String, virtuosoPath: String, minionNumber:Int) = isql_exec("RDF_GLOBAL_RESET()", user, password, virtuosoPath, minionNumber)

  def virtuoso_clear_load_table(user: String, password: String, virtuosoPath: String, minionNumber:Int) = isql_exec("DELETE FROM DB.DBA.load_list;", user, password, virtuosoPath, minionNumber)
  
  def virtuoso_stop(user: String, password: String, port: Int = 1111, virtuosoPath: String, minionNumber:Int) = isql_exec("SHUTDOWN;", user, password)

  //TODO: Add function for executing query!!!

/*
	Example commands are:
	  cd envPath/env[MinionNumber]/var/lib/virtuoso/db
	  envPath/env[MinionNumber]/bin/virtuoso-t
	  cd envPath/env[MinionNumber]/bin
	  ./isql 1111 dba dbaTR EXEC="ld_dir_all ('dataPath/berlinsparql_666-nt/', '*.nt', 'http://berlin')"
	  ./isql 1111 dba dbaTR EXEC="rdf_loader_run()"
	  ./isql 1111 dba dbaTR EXEC="checkpoint;"
	  ./isql 1111 dba dbaTR EXEC="sparql select * from <http://berlin> where {?s ?p ?o} limit 10;"
	  ./isql 1111 dba dbaTR EXEC="RDF_GLOBAL_RESET()"
	  ./isql 1111 dba dbaTR EXEC="select * FROM DB.DBA.load_list;"
	  ./isql 1111 dba dbaTR EXEC="DELETE FROM DB.DBA.load_list;"
	  ./isql 1111 dba dbaTR EXEC="SHUTDOWN;"
  */
  
  /*
   * Order of execution:
   * virtuoso_start(...)
   * virtuoso_ld_dir_all(...)
   * virtuoso_rdf_loader_run(...)
   * 	repeat:
   *  		execute query with isql_exec
   * virtuoso_clear_triples(...)
   * virtuoso_clear_load_table(...)
   * virtuoso_stop(...)
   */
    
  /**
   * Main thingy
   */
      

  
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

    def buildNodeNameList(nodeNames: String): List[String] = {
      //TODO: Rename entities and clean up code

      if (nodeNames.contains("[")) {
        var nodes: List[String] = List.empty
        val name = nodeNames.split("\\[")(0)
        val intermediateNodeList = nodeNames.split("\\[")(1).split("\\]")(0).split(",")
        for (betweenCommas <- intermediateNodeList) {
          if (betweenCommas.contains("-")) {
            val sizeOfNumber = betweenCommas.split("-")(1).size
            val first = betweenCommas.split("-")(0).replaceFirst("^0+(?!$)", "").toInt
            val last = betweenCommas.split("-")(1).replaceFirst("^0+(?!$)", "").toInt
            val sublist = (first to last).map(x => name + putZeroPrefix(x.toString, sizeOfNumber)).toList
            nodes = sublist ::: nodes
          } else {
            nodes = (name + betweenCommas) :: nodes
          }
        }
        nodes
      } else {
        List(nodeNames)
      }
    }

    def putZeroPrefix(number: String, targetSize: Int): String = {
      if (targetSize < number.size)
        throw new Error("targetSize of the number with prefix should be greater than or equal to the size of the initial number.")
      val prefix = new StringBuilder("0").*(targetSize - number.size)
      prefix + number
    }

    val nodeNames = System.getenv("SLURM_NODELIST") //io.Source.fromFile(nodesFilePath).getLines.toList.distinct
    val nodeNameList = buildNodeNameList(nodeNames)
    val nodeNameListToWrite = nodeNameList.mkString("\n")
    for (i <- 0 to (nodeNameList.size - 1)) {
      val node = nodeNameList(i)
      if (i == 0)
        (s"echo $node" #> new java.io.File("/etc/4s-cluster")).!
      else
        (s"echo $node" #>> new java.io.File("/etc/4s-cluster")).!
    }

    val slurmJobId = System.getenv("SLURM_JOB_ID")
    val userName = System.getenv("USER")
    val workingDir = s"/home/slurm/$userName-$slurmJobId"

    println(s"working directory is: $workingDir")

    val numberOfNodes = nodeNameList.size
    val numberOfSegments = if (numberOfNodes == 2) {
      128
    } else if (numberOfNodes == 4) {
      256
    } else if (numberOfNodes == 8) {
      512
    }

    val dbName = s"bsbm${datasetSize}nn$numberOfNodes"

    //Let's stop cluster if there's one already running
    val clusterStopBeforeBeginning = "4s-cluster-stop $dbName".!
    println(s"Stopped 4s-cluster: $clusterStopBeforeBeginning")

    //val clusterBackendCommand = s"4s-backend-setup --node ${numberOfNodes - 1} --cluster $numberOfNodes --segments $numberOfSegments demo1"
    //val clusterBackend = (clusterBackendCommand).!
    //println(s"Result of clusterBackend: $clusterBackend")
    val clusterCreateCommand = s"4s-cluster-create --segments $numberOfSegments $dbName"
    val clusterCreate = (clusterCreateCommand).!
    println(s"clusterCreate command: $clusterCreate")
    Thread.sleep(60000)
    val clusterStartCommand = s"4s-cluster-start $dbName"
    val clusterStart = (clusterStartCommand).!
    println(s"Result of clusterStart: $clusterStart")
    Thread.sleep(60000)

    val queriesObjectName = s"com.signalcollect.triplerush.evaluation.BerlinSparqlParameterized$datasetSize"
    val ntriplesFileLocation = s"berlinsparql_$datasetSize-nt/dataset_$datasetSize.nt"

    //Load command
    val clusterImportCommand = s"4s-import $dbName -v --format ntriples $ntriplesFileLocation"
    val importStartTime = System.nanoTime()
    val clusterImport = (clusterImportCommand).!
    val importEndTime = System.nanoTime()
    val loadingTime = roundToMillisecondFraction(importEndTime - importStartTime)
    println(s"Finished loading: $clusterImport")
    Thread.sleep(60000)

    var commonResults = parameters
    commonResults += "numberOfNodes" -> numberOfNodes.toString
    commonResults += "jitRepetitions" -> warmupRuns.toString
    commonResults += "numberOfWorkers" -> "-"
    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")

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
              val result = executeEvaluationRun(query, 0, s"${queryId.toString}", commonResults, workingDir, dbName)
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
          val result = executeEvaluationRun(query, queryRun, s"${queryId.toString}", commonResults, workingDir, dbName)
          resultReporter(result)
          println(s"Done running evaluation for query $queryId-$subQueryId. Awaiting idle")
          JvmWarmup.sleepUntilGcInactiveForXSeconds(10, 30)
          println("Idle")
          queryRun += 1
        }
      }
    }

    val clusterStopCommand = s"4s-cluster-stop $dbName"
    val clusterStop = (clusterStopCommand).!
    println(s"Stopped 4s-cluster: $clusterStop")
    Thread.sleep(60000)

    val deleteDbDir = "rm -rf /var/lib/4store/$dbName".!
    println(s"Delete directories: $deleteDbDir")
  }

  def executeEvaluationRun(queryString: String, queryRun: Int, queryDescription: String, commonResults: Map[String, String],
    workingDir: String, dbName: String): Map[String, String] = {
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

    val queryToRun = queryString + " #EOQ"
    val queryFileName = s"$workingDir/4s_query.q"
    (s"echo $queryToRun" #> new java.io.File(queryFileName)).!

    val queryFile = new java.io.File(queryFileName)
    val queryCommand = s"4s-query -P $dbName --soft-limit -1"
    val startTime = System.nanoTime
    val queryRunResult = (queryCommand #< queryFile).!!
    val finishTime = System.nanoTime

    val substrToCheckValidResults = "<result>"
    val numberOfValidResults = substrToCheckValidResults.r.findAllMatchIn(queryRunResult).length

    val substrToCheckCorrectness = "<results>"
    val numberOfResultXmlElements = substrToCheckCorrectness.r.findAllMatchIn(queryRunResult).length

    val numberOfResults = if (numberOfResultXmlElements == 0) {
      -1
    } else {
      numberOfValidResults
    }

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
