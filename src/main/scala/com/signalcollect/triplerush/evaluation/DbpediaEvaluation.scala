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

import java.lang.management.ManagementFactory
import java.util.Date
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.PriorityQueue
import com.signalcollect.GraphBuilder
import com.signalcollect.deployment.TorqueDeployableAlgorithm
import com.signalcollect.triplerush.Dictionary
import com.signalcollect.triplerush.TripleRush
import com.signalcollect.triplerush.optimizers.NoOptimizerCreator
import com.signalcollect.util.IntIntHashMap
import EvalHelpers.bytesToGigabytes
import EvalHelpers.getGcCollectionCount
import EvalHelpers.getGcCollectionTime
import EvalHelpers.measureTime
import EvalHelpers.roundToMillisecondFraction
import akka.actor.ActorRef
import com.signalcollect.triplerush.TriplePattern
import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import com.signalcollect.triplerush.sparql.Sparql
import com.signalcollect.triplerush.sparql.VariableEncoding
import com.signalcollect.triplerush.HashMapDictionary

class DbpediaEvaluation extends TorqueDeployableAlgorithm {

  val dictionary: Dictionary = new HashMapDictionary()
  import EvalHelpers._

  def execute(parameters: Map[String, String], nodeActors: Array[ActorRef]) {
    println("TRIPLERUSH EVAL")
    println(s"Received parameters $parameters")
    val evaluationDescription = parameters("evaluationDescription")
    val ntriples = parameters("ntriples")
    val spreadsheetUsername = parameters("spreadsheetUsername")
    val spreadsheetPassword = parameters("spreadsheetPassword")
    val spreadsheetName = parameters("spreadsheetName")
    val worksheetName = parameters("worksheetName")
    //val splits = parameters("splits")
    //val dictionary = parameters("dictionary")
    //val warmupSeconds = parameters("warmupSeconds").toInt
    val warmupRuns = parameters("warmupRuns").toInt

    var commonResults = parameters
    commonResults += "warmupRuns" -> warmupRuns.toString

    val graphBuilder = GraphBuilder.withPreallocatedNodes(nodeActors)
    val tr = new TripleRush(graphBuilder = graphBuilder, optimizerCreator = NoOptimizerCreator)

    println("TripleRush has been started.")
    commonResults += "numberOfNodes" -> tr.graph.numberOfNodes.toString
    commonResults += "numberOfWorkers" -> tr.graph.numberOfWorkers.toString
    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")

    val loadingTime = measureTime {
      tr.loadNtriples(ntriples)
      tr.prepareExecution
    }

    JvmWarmup.sleepUntilGcInactiveForXSeconds(60)

    commonResults += (("loadingTime", loadingTime.toString))

    val resultReporter = new GoogleDocsResultHandler(spreadsheetUsername, spreadsheetPassword, spreadsheetName, worksheetName)

    for (i <- (0 to warmupRuns)) {
      warmup(DbpediaQueries.warmup1Hops)
      warmup(DbpediaQueries.warmup2Hops)
      warmup(DbpediaQueries.warmup3Hops)
    }

    JvmWarmup.sleepUntilGcInactiveForXSeconds(60)

    evaluate(DbpediaQueries.eval1Hops)
    evaluate(DbpediaQueries.eval2Hops)
    evaluate(DbpediaQueries.eval3Hops)

    def warmup(queries: Traversable[(String, String)]) {
      for ((queryId, sparql) <- queries) {
        println(s"Warming up with query $queryId.")
        val result = executeEvaluationRun(sparql, queryId.toString, tr, commonResults)
        println(s"Done running query $queryId. Awaiting idle")
        tr.awaitIdle
        println("Idle")
      }
    }

    def evaluate(queries: Traversable[(String, String)]) {
      for ((queryId, sparql) <- queries) {
        println(s"Running evaluation for query $queryId.")
        val result = executeEvaluationRun(sparql, queryId.toString, tr, commonResults)
        resultReporter(result)
        println(s"Done running evaluation for query $queryId. Awaiting idle")
        tr.awaitIdle
        JvmWarmup.sleepUntilGcInactiveForXSeconds(10)
        println("Idle")
      }
    }

    tr.shutdown
  }

  def transformResults(tr: TripleRush, query: Sparql, i: Iterator[Array[Int]]): (Int, Map[String, Double]) = {
    val targetId = query.variableNameToId("T")
    val wikilinkId = dictionary("http://dbpedia.org/property/wikilink")
    val targetIndex = VariableEncoding.variableIdToDecodingIndex(targetId)
    val countsMap = new IntIntHashMap
    var numberOfResults = 0
    while (i.hasNext) {
      numberOfResults += 1
      val result = i.next
      val binding = result(targetIndex)
      countsMap.increment(binding)
    }
    //    val countsDividedByIncomingEdges = countsMap.toScalaMap.par.map {
    //      case (id, count) =>
    ////        val incomingEdgeCountFuture = tr.executeCountingQuery(QuerySpecification(Array(TriplePattern(-1, wikilinkId, id))))
    ////        val incomingEdgeCount = Await.result(incomingEdgeCountFuture, 7200.seconds).get // We know it has an incoming edge, because otherwise it would not have been reached.
    ////        val incomingEdgesAdjustedCount = count.toDouble / (incomingEdgeCount.toDouble / numberOfResults)
    ////        println(s"${Dictionary(id)}: $incomingEdgeCount incoming edges, $count paths incomingEdgesAdjustedCount=$incomingEdgesAdjustedCount")
    //        (id, incomingEdgesAdjustedCount)
    //    }.seq
    val topK = 10
    implicit val ordering = Ordering.by((value: (Int, Int)) => value._2)
    val topKQueue = new PriorityQueue[(Int, Int)]()(ordering.reverse)
    countsMap.foreach { (id, count) =>
      val tuple = (id, count)
      if (topKQueue.size < topK) {
        topKQueue += tuple
      } else {
        if (ordering.compare(topKQueue.head, tuple) < 0) {
          topKQueue.dequeue
          topKQueue += tuple
        }
      }
    }
    val topKCountsMap = topKQueue.toMap
    val topKResults = DbpediaQueries.countMapToDistribution(topKCountsMap)
    val topKEntities = topKResults.map(entry => (dictionary.unsafeDecode(entry._1), entry._2))
    (numberOfResults, topKEntities)
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
    val queryOption = Sparql(queryString)(tr)
    val query = queryOption.get
    val resultIterator = query.encodedResults
    val (numberOfResults, topKEntities) = transformResults(tr, query, resultIterator)
    val finishTime = System.nanoTime
    println("Number of results: " + numberOfResults)
    val executionTime = roundToMillisecondFraction(finishTime - startTime)
    val gcTimeAfter = getGcCollectionTime(gcs)
    val gcCountAfter = getGcCollectionCount(gcs)
    val gcTimeDuringQuery = gcTimeAfter - gcTimeBefore
    val gcCountDuringQuery = gcCountAfter - gcCountBefore
    val compileTimeAfter = compilations.getTotalCompilationTime
    val compileTimeDuringQuery = compileTimeAfter - compileTimeBefore
    runResult += ((s"topK", topKEntities.toString))
    runResult += ((s"queryId", queryDescription))
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
