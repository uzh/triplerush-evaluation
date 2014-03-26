package com.signalcollect.triplerush.evaluation

import com.signalcollect.deployment.TorqueExecution
import collection.JavaConversions._

object LocalJenaTestRun extends App {
  val j = new JenaDbpediaEvaluation
  val config = TorqueExecution.readConfig("./jena-deployment.config").get
  val parameterMap = config.getConfig("deployment.algorithm.parameters").entrySet.map {
    entry => (entry.getKey, entry.getValue.unwrapped.toString)
  }.toMap
  j.execute(parameterMap, Array())
}
