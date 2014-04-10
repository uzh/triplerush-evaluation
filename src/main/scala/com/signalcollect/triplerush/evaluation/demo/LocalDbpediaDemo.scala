package com.signalcollect.triplerush.evaluation.demo

import com.signalcollect.triplerush.TripleRush
import com.signalcollect.triplerush.optimizers.NoOptimizerCreator
import com.signalcollect.triplerush.optimizers.PredicateSelectivityEdgeCountsOptimizerCreator
import com.signalcollect.triplerush.optimizers.ExplorationOptimizerCreator
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

  //val tr = new TripleRush(optimizerCreator = NoOptimizerCreator)
  val tr = new TripleRush(optimizerCreator = ExplorationOptimizerCreator)
  //val tr = new TripleRush()

  val entities = List("11th_Marine_Expeditionary_Unit", "1250", "11th_century", "12-hour_clock", "1250", "1215-1217_French_invasion_of_England")
  loadDbpediaFromNt(tr)

  tr.prepareExecution

  val timeBefore = System.currentTimeMillis()
  val entitiesForEntities = DbpediaIframeGenerator.getEntitiesForEntities(tr, entities)
  tr.shutdown
  val timeAfter = System.currentTimeMillis()
  //println(entitiesForEntities.mkString("\n"))
  println("total time: " + (timeAfter - timeBefore))
}
