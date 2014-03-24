/*
 *  @author Philip Stutz
 *
 *  Copyright 2014 University of Zurich
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

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
import com.signalcollect.triplerush.QuerySpecification
import com.signalcollect.triplerush.TripleRush
import akka.actor.ActorRef
import com.signalcollect.triplerush.Dictionary
import com.signalcollect.triplerush.JvmWarmup

class JenaDbpediaEvaluation extends TorqueDeployableAlgorithm {

  import EvalHelpers._

  def execute(parameters: Map[String, String], nodeActors: Array[ActorRef]) {
    // Shut down the actors.
    val g = GraphBuilder.withPreallocatedNodes(nodeActors).build
    g.shutdown
    
    println(s"Received parameters $parameters")
    val evaluationDescription = parameters("evaluationDescription")
    val ntriples = parameters("ntriples")
    val spreadsheetUsername = parameters("spreadsheetUsername")
    val spreadsheetPassword = parameters("spreadsheetPassword")
    val spreadsheetName = parameters("spreadsheetName")
    val worksheetName = parameters("worksheetName")
    //val splits = parameters("splits")
    //val dictionary = parameters("dictionary")
    val warmupSeconds = parameters("warmupSeconds").toInt

    var commonResults = parameters
    commonResults += "warmupSeconds" -> warmupSeconds.toString

    val graphBuilder = GraphBuilder.withPreallocatedNodes(nodeActors)
    val tr = new TripleRush(graphBuilder)

    JvmWarmup.warmupWithExistingStore(warmupSeconds, 20, tr)

    println("TripleRush has been started.")
    commonResults += "numberOfNodes" -> tr.graph.numberOfNodes.toString
    commonResults += "numberOfWorkers" -> tr.graph.numberOfWorkers.toString
    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")

    val loadingTime = measureTime {
      tr.loadNtriples(ntriples)
      //      for (splitId <- 0 until 2880) {
      //        val splitFile = s"$splits/$splitId.filtered-split"
      //        tr.loadBinary(splitFile, Some(splitId))
      //        if (splitId % 288 == 279) {
      //          println(s"Dispatched up to split #$splitId/2880, awaiting idle.")
      //          tr.awaitIdle
      //          println(s"Continuing graph loading...")
      //        }
      //      }
      //      Dictionary.loadFromFile(dictionary)
      tr.prepareExecution
    }

    commonResults += (("loadingTime", loadingTime.toString))

    val resultReporter = new GoogleDocsResultHandler(spreadsheetUsername, spreadsheetPassword, spreadsheetName, worksheetName)
    for (queryId <- 1 to DbpediaQueries.twoHopQueries.size) {
      val query = DbpediaQueries.twoHopQueries(queryId - 1)
      println(s"Running evaluation for query $query.")
      val result = executeEvaluationRun(query, queryId.toString, tr, commonResults)
      resultReporter(result)
      println(s"Done running evaluation for query $queryId. Awaiting idle")
      tr.awaitIdle
      println("Idle")
    }

    val twoHopQuery = DbpediaQueries.twoHopQueries.head
    val threeHopResultsFuture = tr.executeCountingQuery(QuerySpecification.fromSparql(DbpediaQueries.threeHopQueries.head).get)
    val result = Await.result(threeHopResultsFuture, 7200.seconds)
    println(s"Number of three-hop Elvis results: $result.")

    tr.shutdown
  }

  def executeEvaluationRun(queryString: String, queryDescription: String, tr: TripleRush, commonResults: Map[String, String]): Map[String, String] = {
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
    val query = QuerySpecification.fromSparql(queryString)
    val (queryResultFuture, queryStatsFuture) = tr.executeAdvancedQuery(query.get)
    val queryResult = Await.result(queryResultFuture, 7200.seconds)
    val queryStats = Await.result(queryStatsFuture, 10.seconds)
    val finishTime = System.nanoTime
    println("Number of one results: " + queryResult.size)
    val executionTime = roundToMillisecondFraction(finishTime - startTime)
    val gcTimeAfter = getGcCollectionTime(gcs)
    val gcCountAfter = getGcCollectionCount(gcs)
    val gcTimeDuringQuery = gcTimeAfter - gcTimeBefore
    val gcCountDuringQuery = gcCountAfter - gcCountBefore
    val compileTimeAfter = compilations.getTotalCompilationTime
    val compileTimeDuringQuery = compileTimeAfter - compileTimeBefore

    val optimizingTime = roundToMillisecondFraction(queryStats("optimizingDuration").asInstanceOf[Long])
    runResult += ((s"queryId", queryDescription))
    runResult += ((s"queryCopyCount", queryStats("queryCopyCount").toString))
    runResult += ((s"query", queryStats("optimizedQuery").toString))
    runResult += ((s"exception", queryStats("exception").toString))
    runResult += ((s"results", queryResult.size.toString))
    runResult += ((s"executionTime", executionTime.toString))
    runResult += ((s"optimizingTime", optimizingTime.toString))
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
