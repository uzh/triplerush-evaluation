package com.signalcollect.triplerush.evaluation.lubm

import scala.sys.process._
import java.io.File

object LubmGeneratorRdfType extends KrakenExecutableRdfType {
  run(GeneratorType.generate(args(0).toInt) _)
}

object GeneratorType {
  def generate (universities: Int)() {
    import FileOperations._

    // Generate raw LUBM files.
    s"java -cp uba.jar edu.lehigh.swat.bench.uba.Generator -univ $universities -onto http://swat.cse.lehigh.edu/onto/univ-bench.owl" !! (ProcessLogger(println(_)))

    // Create new directory and move files there.
    val targetFolder = createFolder(s"./lubm$universities-type")
    println("Moving OWL files ...")
    for (owlFile <- filesIn("./").filter(_.getName.endsWith("owl"))) {
      println(s"Moving file ${owlFile.getName} ...")
      move(owlFile, targetFolder)
    }
    move(new File("./log.txt"), targetFolder)
    println("All LUBM files have been copied.")
  }
}
