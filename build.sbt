import AssemblyKeys._ 
assemblySettings

/** Project */
name := "triplerush-evaluation"

version := "1.0-SNAPSHOT"

organization := "com.signalcollect"

scalaVersion := "2.11.1"

scalacOptions ++= Seq("-optimize", "-Yinline-warnings", "-feature", "-deprecation")

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true

test in assembly := {}

parallelExecution in Test := false

excludedJars in assembly <<= (fullClasspath in assembly) map { cp => 
  cp filter {_.data.getName == "minlog-1.2.jar"}
}

resolvers +=
  "Oracle Released Java Packages" at "http://download.oracle.com/maven"

/** Dependencies */
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.11.1"  % "compile",
  "com.google.collections" % "google-collections" % "1.0",
  "org.apache.jena" % "apache-jena-libs" % "2.11.1" % "compile",
  "org.openrdf.sesame" % "sesame-runtime" % "2.7.11" % "compile",
  "com.sleepycat" % "je" % "5.0.103",
  "junit" % "junit" % "4.8.2"  % "test",
  "org.specs2" %% "specs2" % "2.3.11"  % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.0" % "test",
  "org.scalatest" %% "scalatest" % "2.2.0" % "test",
  "org.easymock" % "easymock" % "3.2" % "test",
  "net.databinder" %% "dispatch-http" % "0.8.10"
  )
