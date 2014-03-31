package com.signalcollect.triplerush.evaluation.demo

import com.signalcollect.triplerush.TripleRush
import com.signalcollect.triplerush.optimizers.NoOptimizerCreator
import com.signalcollect.triplerush.QuerySpecification
import com.signalcollect.triplerush.TriplePattern
import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import com.signalcollect.triplerush.Dictionary

object LocalDbpediaDemo extends App {

  def loadDbpediaFromNt(triplerush: TripleRush) {
    println(s"Loading Dbpedia ...")
    triplerush.loadNtriples("./dbpedia_10000.nt")
    println(s"Done loading Dbpedia.")
  }

  val tr = new TripleRush(optimizerCreator = NoOptimizerCreator)
  tr.prepareExecution
    
  val entities = List("11th_Marine_Expeditionary_Unit", "1250", "11th_century", "12-hour_clock")
  loadDbpediaFromNt(tr)
  
  val entitiesForEntities = DbpediaIframeGenerator.getEntitiesForEntities(tr, entities)
  tr.shutdown
  //println(entitiesForEntities.mkString("\n"))
}