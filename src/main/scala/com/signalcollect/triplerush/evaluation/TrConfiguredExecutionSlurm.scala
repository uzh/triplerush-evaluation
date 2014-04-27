package com.signalcollect.triplerush.evaluation

import com.signalcollect.deployment.SlurmExecution

object TrConfiguredExecutionSlurm extends App {
  SlurmExecution.deployToSlurm(args)
}
