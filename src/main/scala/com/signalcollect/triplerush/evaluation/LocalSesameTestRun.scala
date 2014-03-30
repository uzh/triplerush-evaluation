package com.signalcollect.triplerush.evaluation

import com.signalcollect.deployment.TorqueExecution
import collection.JavaConversions._

object LocalSesameTestRun extends App {
  val j = new SesameDbpediaEvaluation
  val config = TorqueExecution.readConfig("./sesame-deployment.config").get
  val parameterMap = config.getConfig("deployment.algorithm.parameters").entrySet.map {
    entry => (entry.getKey, entry.getValue.unwrapped.toString)
  }.toMap
  j.execute(parameterMap, Array())
}
