package com.signalcollect.triplerush.evaluation.lubm

import java.io.File
import scala.sys.process._

object NTriplesConverterRdfType extends FileTransformationRdfType with Serializable{
  def nameOfTransformation = "nt"
  def sourceFolder = s"./lubm${args(0)}-type"
  
  override def shouldTransformFile(f: File) = f.getName.endsWith(".owl")
  override def extensionTransformer(fileName: String) = fileName.replace(".owl", ".nt")
  // Convert the OWL files to ntriples format.
  def transform(sourceFile: File, targetFile: File) {
    if (!targetFile.exists) {
      Seq("/usr/bin/rapper", sourceFile.getAbsolutePath, "-e", "-o", "ntriples") #>> targetFile !! (ProcessLogger(println(_)))
    }
  }
}