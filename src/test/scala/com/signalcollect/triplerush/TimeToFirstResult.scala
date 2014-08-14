package com.signalcollect.triplerush

import com.signalcollect.triplerush.optimizers.ExplorationHeuristicsOptimizer
import com.signalcollect.triplerush.optimizers.HeuristicOptimizerCreator
import com.signalcollect.triplerush.optimizers.Optimizer
import com.signalcollect.triplerush.evaluation.BerlinQueriesParameterized7
import com.signalcollect.triplerush.sparql.Sparql
import com.signalcollect.triplerush.sparql.VariableEncoding

object TimeToFirstResult extends App {

  def roundToMillisecondFraction(nanoseconds: Long): Double = {
    ((nanoseconds / 100000.0).round) / 10.0
  }

  var executionTimeWithNewHeuristic = Double.MaxValue

  val tr = new TripleRush(optimizerCreator = HeuristicOptimizerCreator)
  try {
    tr.loadNtriples("./bsbm_7.nt")
    tr.awaitIdle
    tr.prepareExecution
    val stats = new PredicateSelectivity(tr)

    val heuristicOptimizer = new ExplorationHeuristicsOptimizer(stats)

    val startTime = System.nanoTime()
    val optimizationRuns = 1
    for (i <- 1 to optimizationRuns) {
      //for (i <- 1 to 10) {
      executionTimeWithNewHeuristic = math.min(executionTimeWithNewHeuristic, executeQuery(tr, heuristicOptimizer))
    }
    val totalDuration = System.nanoTime() - startTime
    println(s"execution time: ${roundToMillisecondFraction(totalDuration)} ms for $optimizationRuns runs.")

  } finally {
    tr.shutdown
  }

  def lookupVariableBinding(tr: TripleRush, query: Sparql, encodedResult: Array[Int])(variableName: String): String = {
    val id = query.variableNameToId(variableName)
    val index = VariableEncoding.variableIdToDecodingIndex(id)
    val encodedBinding = encodedResult(index)
    tr.dictionary.unsafeDecode(encodedBinding)
  }

  class DecodingIterator(tr: TripleRush, query: Sparql, encodedIterator: Iterator[Array[Int]]) extends Iterator[String => String] {
    def next: String => String = {
      val nextEncoded = encodedIterator.next
      lookupVariableBinding(tr: TripleRush, query, nextEncoded)
    }
    def hasNext = encodedIterator.hasNext
  }

  def executeQuery(tr: TripleRush, optimizer: Optimizer): Double = {

    val queryString = BerlinQueriesParameterized7.queries(2)(1)
    val queryOption = Sparql(queryString)(tr)
    val query = queryOption.get
    val patterns = query.encodedPatternUnions
    if (patterns.size == 1) {
      println(s"Patterns: ${patterns.mkString(", ")}")
      val triplePatternSequence = patterns(0)
      val selectVariables = VariableEncoding.requiredVariableBindingsSlots(triplePatternSequence)

      for (patternsSlice <- 0 to (triplePatternSequence.size - 1)) {

        val querySliceToExecute = triplePatternSequence.slice(0, patternsSlice + 1)
        val optimizedQuerySlice = tr.getQueryPlan(querySliceToExecute, Some(optimizer))

        println(s"Executing slice: ${querySliceToExecute.mkString(", ")}")
        val startTime = System.nanoTime
        var timeForFirstResult = 0l
        var numberOfResults = 0
        var stringLength = 0

        val selectVarStrings = query.selectVariableIds.toArray.map(id => query.idToVariableName((-id) - 1))
        val iterator = tr.resultIteratorForQuery(optimizedQuerySlice.queryPlan, Some(optimizer), Some(selectVariables))
        val resultIterator = new DecodingIterator(tr, query, iterator)

        while (resultIterator.hasNext) {
          val res = resultIterator.next
          var arrayIndex = 0
          while (arrayIndex < selectVarStrings.length) {
            stringLength += res(selectVarStrings(arrayIndex)).length
            arrayIndex += 1
          }
          if (numberOfResults == 0) {
            timeForFirstResult = System.nanoTime()
          }
          numberOfResults += 1
        }

        val finishTime = System.nanoTime
        val firstResultExecutionTime = roundToMillisecondFraction(timeForFirstResult - startTime)
        val executionTime = roundToMillisecondFraction(finishTime - startTime)
        println(s"first result: $firstResultExecutionTime, total: $executionTime, numresults: $numberOfResults")
      }

    }
    0
  }

}