package com.signalcollect.triplerush

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import com.signalcollect.triplerush.sparql.Sparql
import com.signalcollect.triplerush.evaluation.BerlinSparqlQueries
import com.signalcollect.triplerush.evaluation.BerlinQueriesParameterized7
import com.signalcollect.triplerush.evaluation.BerlinSparqlParameterized100
import com.signalcollect.triplerush.TRAdaptor
import com.signalcollect.triplerush.optimizers.CleverOptimizerCreator
import com.signalcollect.triplerush.optimizers.ExplorationOptimizerCreator
import com.signalcollect.triplerush.optimizers.ExplorationOptimizerCreatorWithHeuristic
import com.signalcollect.triplerush.optimizers.Optimizer
import com.signalcollect.triplerush.optimizers.NoOptimizerCreator
import com.signalcollect.triplerush.optimizers.CleverCardinalityOptimizer
import com.signalcollect.triplerush.optimizers.ExplorationOptimizer
import com.signalcollect.triplerush.optimizers.ExplorationHeuristicsOptimizer
import com.signalcollect.triplerush.optimizers.HeuristicOptimizerCreator

class BSBMSpec extends FlatSpec with Matchers {

  /*
  "Parser" should "successfully parse BSBM query" in {
    val tr = new TripleRush
    try {
      val trA = TRAdaptor(tr)
      val jena = new JenaAdaptor()

      trA.loadNtriples("./bsbm_7.nt")
      jena.loadNtriples("./bsbm_7.nt")

      for ((queryId, queries) <- BerlinQueriesParameterized7.queries) {
        for (subQueryId <- 1 to 25) {
          //for (q <- queries) {
          val q = queries(subQueryId)
          val trResults = trA.execute(q).toSet
          val jenaResults = jena.execute(q).toSet
          if (trResults != jenaResults) {
            println(trResults)
            println(jenaResults)
            println(s"Result for queryid $queryId: $q exists, tr size: ${trResults.size}, jena size: ${jenaResults.size}")
          }
          assert(trResults === jenaResults)
        }
      }
    } finally {
      tr.shutdown
    }
  }

  /*
  "Parser" should "successfully parse another BSBM query" in {
    val tr = new TripleRush
    try {
      val trA = TRAdaptor(tr)
      trA.loadNtriples("./bsbm_7.nt")

      val queries = BerlinQueriesParameterized7.queries(5)
      val q = queries(1)
      println(q)
      val queryOption = Sparql(q)(tr)
      val query = queryOption.get
      println(s"query: $query")
    } finally {
      tr.shutdown
    }
  }*/

  "Parser" should "properly decode results" in {
    val tr = new TripleRush
    try {
      val trA = TRAdaptor(tr)
      val jena = new JenaAdaptor()
      trA.loadNtriples("./bsbm_7.nt")
      jena.loadNtriples("./bsbm_7.nt")

      for ((queryId, queries) <- BerlinQueriesParameterized7.queries) {
        for (subQueryId <- 1 to 25) {
          val query = queries(subQueryId)
          val trResults = trA.getBindings(query)
          val jenaResults = jena.getBindings(query)

          val trResultCount = trA.execute(query).toSet.size
          val jenaResultCount = jena.execute(query).toSet.size
          //println(s"queryId $queryId, subQueryId: $subQueryId, TRresultCount: $trResultCount, jenaresultcount: $jenaResultCount, trstrlen: $trResults, jenastrlen: $jenaResults")
          assert(trResults === jenaResults)
        }
      }
    } finally {
      tr.shutdown
    }
  }

  "Parser" should "properly calculate result length" in {
    val tr = new TripleRush
    try {
      val trA = TRAdaptor(tr)
      val jena = new JenaAdaptor()
      trA.loadNtriples("./bsbm_7.nt")
      jena.loadNtriples("./bsbm_7.nt")

      for ((queryId, queries) <- BerlinQueriesParameterized7.queries) {
        for (subQueryId <- 1 to 25) {
          val query = queries(subQueryId)
          val trResults = trA.getResultLength(query)
          val jenaResults = jena.getBindings(query)

          val trResultCount = trA.execute(query).toSet.size
          val jenaResultCount = jena.execute(query).toSet.size
          //println(s"queryId $queryId, subQueryId: $subQueryId, TRresultCount: $trResultCount, jenaresultcount: $jenaResultCount, trstrlen: $trResults, jenastrlen: $jenaResults")
          assert(trResults === jenaResults)
        }
      }
    } finally {
      tr.shutdown
    }
  }
*/
  it should "use heuristics to optimize queries" in {
    def roundToMillisecondFraction(nanoseconds: Long): Double = {
      ((nanoseconds / 100000.0).round) / 10.0
    }

    var executionTimeWithNewHeuristic = Double.MaxValue
    var executionTimeWithHeuristic = Double.MaxValue
    var executionTimeWithoutHeuristic = Double.MaxValue
    var executionTimeCleverOptimizer = Double.MaxValue

    val tr = new TripleRush(optimizerCreator = NoOptimizerCreator)
    try {
      tr.loadNtriples("./bsbm_7.nt")
      tr.awaitIdle
      tr.prepareExecution

      /*tr.childIdsForPattern(TriplePattern(0, 0, 0)).foreach{
        encoded => 
        print(s"$encoded -> ${tr.dictionary.decode(encoded)}")
      }*/
      
      val clever = CleverCardinalityOptimizer
      val stats = new PredicateSelectivity(tr)
      val withHeuristic = new ExplorationOptimizer(stats, useHeuristic = true)
      val withoutHeuristic = new ExplorationOptimizer(stats, useHeuristic = false)
      val heuristicOptimizer = new ExplorationHeuristicsOptimizer(stats)

      for (i <- 1 to 10) {
        /*println("Clever Optimizer")
        executionTimeCleverOptimizer = math.min(executionTimeCleverOptimizer, executeQuery(tr, clever))
        println("Without Heuristics")
        executionTimeWithoutHeuristic = math.min(executionTimeWithoutHeuristic, executeQuery(tr, withoutHeuristic))
        println("With Heuristics")
        executionTimeWithHeuristic = math.min(executionTimeWithHeuristic, executeQuery(tr, withHeuristic))
        println("With new Heuristics Optimizer")*/
        executionTimeWithNewHeuristic = math.min(executionTimeWithNewHeuristic, executeQuery(tr, heuristicOptimizer))
      }
    } finally {
      tr.shutdown
    }

    //println(s"Execution time: 0) with new heuristic: $executionTimeWithNewHeuristic, i) with Heuristic: $executionTimeWithHeuristic, ii) without Heuristic: $executionTimeWithoutHeuristic, iii) Clever: $executionTimeCleverOptimizer,  iv) difference heuristic: ${executionTimeWithHeuristic - executionTimeWithoutHeuristic}, v) difference clever: ${executionTimeWithoutHeuristic - executionTimeCleverOptimizer}")

    def executeQuery(tr: TripleRush, optimizer: Optimizer): Double = {
      val queryString = BerlinQueriesParameterized7.queries(2)(1)
      var numberOfResults = 0
      var stringLength = 0
      val startTime = System.nanoTime
      val queryOption = Sparql(queryString)(tr)
      val query = queryOption.get.withOptimizer(optimizer)
      val selectVarStrings = query.selectVariableIds.toArray.map(id => query.idToVariableName((-id) - 1))
      val resultIterator = query.resultIterator

      while (resultIterator.hasNext) {
        val res = resultIterator.next
        var arrayIndex = 0
        while (arrayIndex < selectVarStrings.length) {
          stringLength += res(selectVarStrings(arrayIndex)).length
          arrayIndex += 1
        }
        numberOfResults += 1
      }

      val finishTime = System.nanoTime
      roundToMillisecondFraction(finishTime - startTime)
    }

  }

}

// Map(property -> http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/validTo, hasValue -> 2008-05-30T00:00:00, isValueOf -> *), Map(property -> http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/price, hasValue -> 7792.07, isValueOf -> *), Map(property -> http://purl.org/dc/elements/1.1/date, hasValue -> 2008-03-18, isValueOf -> *))
// Map(property -> http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/price, hasValue -> com.hp.hpl.jena.datatypes.BaseDatatype$TypedValue@bc622438, isValueOf -> *), Map(property -> http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/validTo, hasValue -> 2008-05-30T00:00:00, isValueOf -> *), Map(property -> http://purl.org/dc/elements/1.1/date, hasValue -> 2008-03-18, isValueOf -> *))