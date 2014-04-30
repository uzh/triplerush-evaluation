package com.signalcollect.triplerush

import com.signalcollect.triplerush.sparql.Sparql
import com.hp.hpl.jena.rdf.model.ModelFactory
import com.hp.hpl.jena.query.QueryFactory
import com.hp.hpl.jena.query.QueryExecutionFactory
import com.signalcollect.triplerush.sparql.SparqlParser
import com.hp.hpl.jena.rdf.model.Resource
import com.hp.hpl.jena.rdf.model.Literal
import com.hp.hpl.jena.datatypes.BaseDatatype
import com.hp.hpl.jena.datatypes.BaseDatatype.TypedValue

trait TestStore {
  def loadNtriples(filename: String)
  def execute(sparql: String): List[Map[String, String]]
}

case class TRAdaptor(tr: TripleRush = new TripleRush) extends TestStore {
  def loadNtriples(filename: String) {
    tr.loadNtriples(filename)
    tr.prepareExecution
  }

  def execute(sparql: String): List[Map[String, String]] = {
    val parsedQuery = Sparql(sparql)(tr)
    parsedQuery match {
      case None => List.empty
      case Some(p) =>
        val selectVariableStrings = p.selectVariableIds.map(x => p.idToVariableName(-x-1))
        p.resultIterator.map {
          result =>
            selectVariableStrings.map(bindingName => (bindingName, result(bindingName))).toMap
        }.toList
    }
  }
  
}

case class JenaAdaptor() extends TestStore {
  val jena = ModelFactory.createDefaultModel
  def loadNtriples(filename: String) {
    jena.read(filename, "N-TRIPLE")
  }

  def execute(sparql: String): List[Map[String, String]] = {
    import collection.JavaConversions._
    val parsedQuery = SparqlParser.parse(sparql)
    val selectVariableStrings = parsedQuery.select.selectVariableNames
    val query = QueryFactory.create(sparql)
    val qe = QueryExecutionFactory.create(query, jena)
    val results = qe.execSelect
    results.map {
      result =>
        selectVariableStrings.map{
          bindingName =>
            val bindingAsString = result.get(bindingName) match {
              case res: Resource => res.toString
              case lit: Literal => lit.getLexicalForm
              case null => "*"
            }
            (bindingName, bindingAsString)
          }.toMap
    }.toList
  }
  
}