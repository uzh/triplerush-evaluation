import sbt._
import Keys._

object GraphsBuild extends Build {
  lazy val triplerush = ProjectRef(file("../triplerush"), id = "triplerush")
  lazy val slurmDeployment = ProjectRef(file("../signal-collect-slurm"), id = "signal-collect-slurm")
  val scTriplerush = Project(id = "triplerush-evaluation",
    base = file(".")) dependsOn (triplerush) dependsOn (slurmDeployment)
}
