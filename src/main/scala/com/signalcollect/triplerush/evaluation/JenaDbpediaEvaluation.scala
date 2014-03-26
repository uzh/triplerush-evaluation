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
import com.hp.hpl.jena.rdf.model.ModelFactory
import com.hp.hpl.jena.rdf.model.Model
import com.hp.hpl.jena.query.QueryFactory
import com.hp.hpl.jena.query.QueryExecutionFactory
import collection.JavaConversions._
import scala.collection.mutable.PriorityQueue
import com.hp.hpl.jena.query.ResultSet
import com.signalcollect.util.IntValueHashMap
import akka.actor.PoisonPill
import com.signalcollect.configuration.ActorSystemRegistry

class JenaDbpediaEvaluation extends TorqueDeployableAlgorithm {

  import EvalHelpers._

  def execute(parameters: Map[String, String], nodeActors: Array[ActorRef]) {
    println("JENA EVAL")

    // Shut down the actor system.
    ActorSystemRegistry.retrieve("SignalCollect").foreach(_.shutdown)

    println(s"Received parameters $parameters")
    val evaluationDescription = parameters("evaluationDescription")
    val ntriples = parameters("ntriples")
    val spreadsheetUsername = parameters("spreadsheetUsername")
    val spreadsheetPassword = parameters("spreadsheetPassword")
    val spreadsheetName = parameters("spreadsheetName")
    val worksheetName = parameters("worksheetName")
    //val warmupSeconds = parameters("warmupSeconds").toInt
    val warmupRuns = parameters("warmupRuns").toInt

    var commonResults = parameters
    commonResults += "warmupRuns" -> warmupRuns.toString

    commonResults += "java.runtime.version" -> System.getProperty("java.runtime.version")

    val jena = ModelFactory.createDefaultModel

    val loadingTime = measureTime {
      jena.read(ntriples, "N-TRIPLE")
    }

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
        val result = executeEvaluationRun(sparql, queryId.toString, jena, commonResults)
        println(s"Done running query $queryId. Awaiting idle")
      }
    }

    def evaluate(queries: Traversable[(String, String)]) {
      for ((queryId, sparql) <- queries) {
        println(s"Running evaluation for query $queryId.")
        val result = executeEvaluationRun(sparql, queryId.toString, jena, commonResults)
        resultReporter(result)
        println(s"Done running evaluation for query $queryId. Awaiting idle")
        JvmWarmup.sleepUntilGcInactiveForXSeconds(10)
      }
    }

    jena.close

  }

  def transformResults(jena: Model, i: ResultSet): (Int, Map[String, Double]) = {
    val countsMap = new IntValueHashMap[String]
    var numberOfResults = 0
    while (i.hasNext) {
      numberOfResults += 1
      val result = i.next
      val binding = result.get("T").toString
      countsMap.increment(binding)
    }
    val countsDividedByIncomingEdges = countsMap.toScalaMap.par.map {
      case (id, count) =>
        val sparql = s"SELECT (count(?from) as ?count) { ?from <http://dbpedia.org/property/wikilink> <$id> .}"
        val query = QueryFactory.create(sparql)
        val qe = QueryExecutionFactory.create(query, jena)
        val results = qe.execSelect
        val incomingEdgeCount = results.next.getLiteral("count").getLong
        (id, count.toDouble / incomingEdgeCount)
    }.seq

    val topK = 5
    implicit val ordering = Ordering.by((value: (String, Double)) => value._2)
    val topKQueue = new PriorityQueue[(String, Double)]()(ordering.reverse)
    countsDividedByIncomingEdges.foreach { tuple =>
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
    val topKEntities = DbpediaQueries.normalize(topKCountsMap)
    (numberOfResults, topKEntities)
  }

  def countMapToDistribution(counts: Map[String, Int]): Map[String, Double] = {
    val totalCount: Double = counts.values.sum
    if (totalCount == 0) {
      Map.empty
    } else {
      counts.map(c => c._1 -> c._2 / totalCount)
    }
  }

  def executeEvaluationRun(queryString: String, queryDescription: String, jena: Model, commonResults: Map[String, String]): Map[String, String] = {
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
    val (numberOfResults, topKEntities) = transformResults(jena, results)
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
