package com.signalcollect.triplerush.evaluation

import com.signalcollect.deployment.TorqueExecution
import collection.JavaConversions._
import akka.actor.ActorSystem
import com.signalcollect.configuration.AkkaConfig
import akka.event.Logging
import com.signalcollect.configuration.ActorSystemRegistry
import akka.actor.Props
import com.signalcollect.nodeprovisioning.DefaultNodeActor
import com.signalcollect.configuration.GraphConfiguration

object LocalTrTestRun extends App {
  val j = new DbpediaEvaluation
  val config = TorqueExecution.readConfig("./deployment.config").get
  val kryoRegistrations = {
    if (config.hasPath("deployment.akka.kryo-registrations")) {
      config.getList("deployment.akka.kryo-registrations").map(_.unwrapped.toString).toList
    } else {
      List.empty[String]
    }
  }
  val system: ActorSystem = ActorSystem("SignalCollect", akkaConfig(2552, kryoRegistrations))
  ActorSystemRegistry.register(system)
  val nodeController = system.actorOf(Props(classOf[DefaultNodeActor], 0, 1, None), name = "DefaultNodeActor" + 0.toString)
  val parameterMap = config.getConfig("deployment.algorithm.parameters").entrySet.map {
    entry => (entry.getKey, entry.getValue.unwrapped.toString)
  }.toMap
  val nodeActor = Array(nodeController)
  j.execute(parameterMap, nodeActor)

  def akkaConfig(akkaPort: Int, kryoRegistrations: List[String]) = AkkaConfig.get(
    serializeMessages = false,
    loggingLevel = Logging.WarningLevel, //Logging.DebugLevel,
    kryoRegistrations = kryoRegistrations,
    kryoInitializer = GraphConfiguration().kryoInitializer,
    port = akkaPort)
}
