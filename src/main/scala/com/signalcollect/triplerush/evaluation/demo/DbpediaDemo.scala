package com.signalcollect.triplerush.evaluation.demo

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
import akka.actor.ActorRef
import com.signalcollect.triplerush.evaluation.DbpediaQueries
import com.signalcollect.triplerush.evaluation.EvalHelpers
import java.net.InetSocketAddress
import com.sun.net.httpserver.{ HttpExchange, HttpHandler, HttpServer }
import java.util.concurrent.Executors
import java.net.Socket
import java.net.InetAddress
import java.io.PrintStream
import scala.io.BufferedSource
import java.net.URL
import dispatch._
import dispatch.classic.Http
import dispatch.classic.url
import scala.util.matching.Regex
import EvalHelpers._
import com.signalcollect.triplerush.Dictionary
import com.signalcollect.TopKFinder
import com.signalcollect.util.IntIntHashMap
import scala.collection.mutable.PriorityQueue
import scala.collection.parallel.immutable.ParVector
import com.signalcollect.triplerush.optimizers.NoOptimizerCreator
import com.signalcollect.triplerush.TriplePattern
import java.net.URLDecoder
import com.signalcollect.triplerush.sparql.Sparql
import com.signalcollect.triplerush.sparql.VariableEncoding
import com.signalcollect.triplerush.optimizers.ExplorationOptimizerCreator
import com.signalcollect.triplerush.HashMapDictionary

class DbpediaDemo extends TorqueDeployableAlgorithm {
  val dictionary: Dictionary = new HashMapDictionary()
  def loadDbpedia(triplerush: TripleRush) {
    println(s"Loading Dbpedia ...")
    val dbpediaFolderName = "dbpedia-filtered-splits"
    for (splitId <- 0 until 2880) {
      val splitFile = s"./$dbpediaFolderName/$splitId.filtered-split"
      triplerush.loadBinary(splitFile, Some(splitId))
      if (splitId % 288 == 279) {
        println(s"Dispatched up to split #$splitId/2880, awaiting idle.")
        triplerush.awaitIdle
        println(s"Continuing graph loading...")
      }
    }
  }

  def execute(parameters: Map[String, String], nodeActors: Array[ActorRef]) {
    println(s"Received parameters $parameters")

    //loading form filtered splits
    val dictionary = new HashMapDictionary()
    val graphBuilder = new GraphBuilder[Long, Any]().withPreallocatedNodes(nodeActors)
    val tr = new TripleRush(graphBuilder, dictionary = dictionary, optimizerCreator = ExplorationOptimizerCreator)
    //val tr = new TripleRush(graphBuilder, optimizerCreator = NoOptimizerCreator)

    println("TripleRush has been started.")

    dictionary.loadFromFile("dbpedia-binary-old/dictionary.txt")

    println("finished loading dictionary.")

    val loadingTime = measureTime {
      loadDbpedia(tr)
      tr.prepareExecution
    }

    println("finished loading dbpedia.")

    /*
    val graphBuilder = new GraphBuilder[Long, Any]().PreallocatedNodes(nodeActors)
    val tr = new TripleRush(graphBuilder = graphBuilder, optimizerCreator = ExplorationOptimizerCreator)

    println("TripleRush has been started.")

    println(s"Loading Dbpedia ...")
    val loadingTime = measureTime {
      val dbpediaFolderName = "dbpedia-nt"
      val ntFile = s"./$dbpediaFolderName/pagelinks_en.nt"

      tr.loadNtriples(ntFile)
      tr.prepareExecution
    }
    println(s"Done loading Dbpedia.")
	*/
    val optimizerInitStart = System.nanoTime
    val optimizerInitEnd = System.nanoTime

    println("Starting warm-up...")

    val serverPort = 8090
    val spotlightAddress = "http://claudio01.ifi.uzh.ch:2222/rest/annotate"
    //val webServer = new WebServer(serverPort, spotlightAddress)

    val address = new InetSocketAddress(serverPort)
    DbpediaIframeGenerator.setRequestURL(spotlightAddress)
    val server = HttpServer.create(address, 0)
    server.createContext("/", new WorkerStateRequestHandler(tr))
    server.setExecutor(Executors.newCachedThreadPool())
    server.start
    println("Web Server started on localhost:" + address.getPort)
    def shutdown {
      tr.shutdown
      server.stop(0)
    }
  }

  class WorkerStateRequestHandler(tr: TripleRush) extends HttpHandler {
    def handle(exchange: HttpExchange) {
      val requestMethod = exchange.getRequestMethod
      if (requestMethod.equalsIgnoreCase("GET")) {
        val queryResult = DbpediaIframeGenerator.getResult(exchange.getRequestURI().getRawQuery().replaceFirst("q=", ""), tr)
        val responseHeaders = exchange.getResponseHeaders
        responseHeaders.set("Content-Type", "text/html")
        responseHeaders.set("Access-Control-Allow-Origin", "*");
        exchange.sendResponseHeaders(200, queryResult.length())
        val responseBody = exchange.getResponseBody
        responseBody.write(queryResult.getBytes())
        responseBody.close
        exchange.close()
      }
    }
  }
}

object DbpediaIframeGenerator {
  val dictionary: Dictionary = new HashMapDictionary()
  var requestURL = ""
  var queryURL = ""
  def setRequestURL(url: String) {
    requestURL = url
  }

  def getEntitiesForEntities(tr: TripleRush, entities: List[String]): List[(String, Double)] = {
    val twoHopsQueries = entities.par.map { DbpediaQueries.twoHopQueryFromEntity(_) }

    println("total two hop queries: " + twoHopsQueries.size)
    //println(s"two hop queries: ${twoHopsQueries.mkString(" ")}")
    val queries = twoHopsQueries.flatMap { Sparql(_)(tr) }
    //println(s"queries: ${queries.mkString(" ")}")
    val resultIterators = queries.map { _.encodedResults }
    //println(s"resultIterators: ${resultIterators.mkString(" ")}")
    val (numberOfResults, topKEntities) = transformResults(tr, queries.seq.toList, resultIterators.seq.toList)
    println("total entities reached: " + numberOfResults)
    val sortedTopK = topKEntities.toList.sortBy(x => x._2)(Ordering[Double].reverse)
    //println(s"topKEntities: ${topKEntities.mkString(", ")}")
    //topKEntities

    sortedTopK
  }

  def getResult(query: String, tr: TripleRush): String = {
    queryURL = query
    val h = new Http
    val req = url(s"$requestURL?url=$queryURL")
    println(s"request is $queryURL")

    val response = h(req >:+ { (headers, req) =>
      val header = headers
      req.as_str
    })

    val patternToExtractEntities = new Regex("href=\"http://dbpedia.org/resource/([^\"]*)")

    val allEntities = patternToExtractEntities.findAllIn(response).matchData

    val allEntitiesStr = allEntities.map { m => m.group(1) }.toList

    /*val entitiesWithDbpediaLinks = allEntities map {
      m => "<a href = 'http://dbpedia.org/resource/" + m.group(1) + "'>" + m.group(1) + "</a>"
    }*/

    //val tenEntities = allEntitiesStr.slice(0, math.min(10, allEntitiesStr.size))
    println("all entities: " + allEntitiesStr)
    println("number of entities on page: " + allEntitiesStr.size)

    val entitiesForEntities = getEntitiesForEntities(tr, allEntitiesStr)

    println("finished running queries")
    //generateIframe(stringMap.mkString("<br>")+entitiesWithDbpediaLinks.mkString("<br>"))

    var newString = ""
    entitiesForEntities.map { x =>
      val pos = x._1.lastIndexOf("/")
      val entity = URLDecoder.decode(x._1.substring(pos + 1)).replace("_", " ")
      newString += s"<a href='${x._1}'>$entity</a>" + "\n" +
        "<div class='PercentageBar'>" +
        s"<div class='percent' style='width: ${x._2 * 100} %;'>&nbsp;</div>" + "\n" +
        s"<div class='caption'>${"%.2f" format x._2}</div>" + "\n" +
        "</div>" + "\n" +
        "<br>" + "\n"
    }

    generateIframe(newString)
  }

  def generateIframe(dbpediaEntities: String): String = {
    //println("received dbpedia entities" + dbpediaEntities)

    val htmlStr = "<!DOCTYPE html>" + "\n" +
      "<html xmlns=\"http://www.w3.org/1999/xhtml\">" + "\n" +
      "<head>" + "\n" +
      "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />" + "\n" +
      "<meta http-equiv=\"title\" content=\"TripleRush Demo\" />" + "\n" +
      "<meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0\" />" + "\n" +
      "<meta http-equiv=\"description\" content=\"TripleRush Demo\" />" + "\n" +
      "<title>TripleRush Demo</title>" + "\n" +
      "<link href=\"../../../user/bpaudel/style.css\" rel=\"stylesheet\" type=\"text/css\" />" + "\n" +
      "</head>" + "\n" +
      "<body>" + "\n" +
      "<header>" + "\n" +
      "<h2>TripleRush Demo</h2>" + "\n" +
      "<small>Entities Exploration</small>" + "\n" +
      "<br/><br/>" + "\n" +
      "</header>" + "\n" +
      "<div id=\"sub-title\">" + "\n" +
      "<div id=\"col1\" width=\"20%\">" + dbpediaEntities + "</div>" + "\n" +
      "<div id=\"col2\">" + "<iframe src=\"" + queryURL + "\" width=70% height=600 px>" + "</div>" + "\n" +
      "</div>" + "\n" +
      "</body>" + "\n" +
      "</html>"

    htmlStr
  }

  //def executeEvaluationRun(queryString: String, queryDescription: String, tr: TripleRush, commonResults: Map[String, String]): Map[String, String] = {
  def executeEvaluationRun(query: Seq[TriplePattern], tr: TripleRush): Traversable[Array[Int]] = {
    val (queryResultFuture, queryStatsFuture) = tr.executeAdvancedQuery(query)
    val queryResult = Await.result(queryResultFuture, 7200.seconds)
    println(s"query: $query, Number of one results: " + queryResult.size)
    queryResult
  }

  def transformResults(tr: TripleRush, queries: List[Sparql], is: List[Iterator[Array[Int]]]): (Int, Map[String, Double]) = {
    val targetId = queries.head.variableNameToId("T")
    val intermediateId = queries.head.variableNameToId("A")
    val wikilinkId = dictionary("http://dbpedia.org/property/wikilink")
    val targetIndex = VariableEncoding.variableIdToDecodingIndex(targetId)
    val intermediateIndex = VariableEncoding.variableIdToDecodingIndex(intermediateId)
    val countsMap = new IntIntHashMap
    var numberOfResults = 0
    for (i <- is) {
      while (i.hasNext) {
        numberOfResults += 1
        val result = i.next
        val targetBinding = result(targetIndex)
        val intermediateBinding = result(intermediateIndex)
        countsMap.increment(intermediateBinding)
        countsMap.increment(targetBinding)
      }
    }

    //val totalEdgeCount = countsMap.toScalaMap.foldLeft(0)((b, a) => b + a._2)
    //val totalEdgeCount = 7944376
    //val nodesWithIncomingEdgeCountFuture = tr.executeCountingQuery(QuerySpecification(Array(TriplePattern(-1, wikilinkId, -2))))
    //val totalNodes = Await.result(nodesWithIncomingEdgeCountFuture, 7200.seconds).get // We know it has an incoming edge, because otherwise it would not have been reached.
    //val totalNodes = 59864153

    //println(s"got results, totalEdgeCount: $totalEdgeCount, totalNodes: $totalNodes")

    println("total counting queries: " + countsMap.size)

    val countsDividedByIncomingEdges = countsMap.toScalaMap.par.map {
      case (id, count) =>
        val incomingEdgeCountFuture = tr.executeCountingQuery(Array(TriplePattern(-1, wikilinkId, id)))
        //val twoHopsIncomingEdgeCountFuture = tr.executeCountingQuery(QuerySpecification(Array(TriplePattern(-1, wikilinkId, -2), TriplePattern(-2, wikilinkId, id))))

        val incomingEdgeCount = Await.result(incomingEdgeCountFuture, 7200.seconds).get // We know it has an incoming edge, because otherwise it would not have been reached.

        //val twoHopsIncomingEdgeCount = Await.result(twoHopsIncomingEdgeCountFuture, 7200.seconds).get

        val incomingEdgesAdjustedCount = count.toDouble / math.pow(incomingEdgeCount, 1.0 / 3.0)

        //println(s"id: ${dictionary.unsafeDecode(id)}, count: $count, incomingEdgeCount: $incomingEdgeCount, twoHops: $twoHopsIncomingEdgeCount")
        //println(s"id: ${dictionary.unsafeDecode(id)}, count: $count, incomingEdgeCount: $incomingEdgeCount")
        //val incomingEdgesAdjustedCount = (count.toDouble / totalEdgeCount) * math.log(totalNodes / (incomingEdgeCount + 1))
        (id, incomingEdgesAdjustedCount)
    }.seq

    println("got counts")

    val topK = 10
    implicit val ordering = Ordering.by((value: (Int, Double)) => value._2)
    val topKQueue = new PriorityQueue[(Int, Double)]()(ordering.reverse)
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

    println("got topK")
    val topKCountsMap = topKQueue.toMap
    val topKResults = DbpediaQueries.normalize(topKCountsMap)
    val topKEntities = topKResults.map(entry => (dictionary.unsafeDecode(entry._1), entry._2))
    (numberOfResults, topKEntities)
  }

}
