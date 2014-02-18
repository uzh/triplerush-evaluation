import sbt._
import Keys._

object GraphsBuild extends Build {
  lazy val triplerush = ProjectRef(file("../triplerush"), id = "triplerush")
  val scTriplerush = Project(id = "triplerush-evaluation",
    base = file(".")) dependsOn (triplerush)
}
