import AssemblyKeys._ 
assemblySettings

/** Project */
name := "triplerush-evaluation"

version := "1.0-SNAPSHOT"

organization := "com.signalcollect"

scalaVersion := "2.10.3"

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
  "org.scala-lang" % "scala-library" % "2.10.3"  % "compile",
  "com.google.collections" % "google-collections" % "1.0",
    "org.apache.jena" % "apache-jena-libs" % "2.11.1" % "compile",
  "com.sleepycat" % "je" % "5.0.103"
  )
