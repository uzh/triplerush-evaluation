package com.signalcollect.triplerush

import com.signalcollect.triplerush.PredicateSelectivity
import com.signalcollect.triplerush.TriplePattern
import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.Map
import com.signalcollect.triplerush.optimizers.CleverCardinalityOptimizer
import com.signalcollect.triplerush.optimizers.NoOptimizerCreator
import com.signalcollect.triplerush.optimizers.ExplorationOptimizer
import com.signalcollect.triplerush.optimizers.ExplorationHeuristicsOptimizer
import com.signalcollect.triplerush.optimizers.Optimizer
import com.signalcollect.triplerush.evaluation.BerlinQueriesParameterized7
import com.signalcollect.triplerush.sparql.Sparql

object HeuristicsOptimizerBenchmark extends App {

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

    val stats = new PredicateSelectivity(tr)

    println("press any key")
    readLine()

    //val clever = CleverCardinalityOptimizer
    //val withHeuristic = new ExplorationOptimizer(stats, useHeuristic = true)
    //val withoutHeuristic = new ExplorationOptimizer(stats, useHeuristic = false)

    val heuristicOptimizer = new ExplorationHeuristicsOptimizer(stats)

    val startTime = System.nanoTime()
    val optimizationRuns = 10000
    for (i <- 1 to optimizationRuns) {
      //for (i <- 1 to 10) {
      /*println("Clever Optimizer")
      executionTimeCleverOptimizer = math.min(executionTimeCleverOptimizer, executeQuery(tr, clever))
      println("Without Heuristics")
      executionTimeWithoutHeuristic = math.min(executionTimeWithoutHeuristic, executeQuery(tr, withoutHeuristic))
      println("With Heuristics")
      executionTimeWithHeuristic = math.min(executionTimeWithHeuristic, executeQuery(tr, withHeuristic))
      println("With new Heuristics Optimizer")*/
      executionTimeWithNewHeuristic = math.min(executionTimeWithNewHeuristic, executeQuery(tr, heuristicOptimizer))
    }
    val totalDuration = System.nanoTime() - startTime
    println(s"execution time: ${roundToMillisecondFraction(totalDuration)} ms for $optimizationRuns runs.")
    
  } finally {
    tr.shutdown
  }

  //println(s"Execution time: 0) with new heuristic: $executionTimeWithNewHeuristic, i) with Heuristic: $executionTimeWithHeuristic, ii) without Heuristic: $executionTimeWithoutHeuristic, iii) Clever: $executionTimeCleverOptimizer,  iv) difference heuristic: ${executionTimeWithHeuristic - executionTimeWithoutHeuristic}, v) difference clever: ${executionTimeWithoutHeuristic - executionTimeCleverOptimizer}")

  def executeQuery(tr: TripleRush, optimizer: Optimizer): Double = {
    val queryString = BerlinQueriesParameterized7.queries(2)(1)
    //val queryString = BerlinQueriesParameterized7.queries(5)(3)
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