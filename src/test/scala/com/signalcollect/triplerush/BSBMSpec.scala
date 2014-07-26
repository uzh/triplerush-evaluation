package com.signalcollect.triplerush

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import com.signalcollect.triplerush.sparql.Sparql
import com.signalcollect.triplerush.evaluation.BerlinSparqlQueries
import com.signalcollect.triplerush.evaluation.BerlinQueriesParameterized7
import com.signalcollect.triplerush.evaluation.BerlinSparqlParameterized100
import com.signalcollect.triplerush.TRAdaptor

class BSBMSpec extends FlatSpec with Matchers {

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

}

// Map(property -> http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/validTo, hasValue -> 2008-05-30T00:00:00, isValueOf -> *), Map(property -> http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/price, hasValue -> 7792.07, isValueOf -> *), Map(property -> http://purl.org/dc/elements/1.1/date, hasValue -> 2008-03-18, isValueOf -> *))
// Map(property -> http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/price, hasValue -> com.hp.hpl.jena.datatypes.BaseDatatype$TypedValue@bc622438, isValueOf -> *), Map(property -> http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/validTo, hasValue -> 2008-05-30T00:00:00, isValueOf -> *), Map(property -> http://purl.org/dc/elements/1.1/date, hasValue -> 2008-03-18, isValueOf -> *))