package com.signalcollect.triplerush.evaluation.lubm

import java.io.DataOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.HashMap
import collection.JavaConversions._
import scala.io.Source
import org.semanticweb.yars.nx.parser.NxParser
import java.io.OutputStreamWriter
import com.signalcollect.triplerush.evaluation.QueryEncoding
import com.sleepycat.je.EnvironmentConfig
import com.sleepycat.je.DatabaseConfig
import com.sleepycat.je.Environment
import com.sleepycat.bind.serial.StoredClassCatalog
import com.sleepycat.bind.serial.SerialBinding
import com.sleepycat.collections.StoredMap

object DictionaryEncoderWithBaseBDB extends KrakenExecutable with Serializable {
  run(BaseEncoderBDB.encode(args(0)) _)
}

case object BaseEncoderBDB extends Serializable {

  def encode(sourceFolderBaseName: String)() {
    import FileOperations._

    val sourceFolderName = s"./${sourceFolderBaseName}-nt"
    val targetFolderName = sourceFolderName.replace("nt", "binary")
    createFolder(targetFolderName)
    val source = new File(sourceFolderName)
    val target = new File(targetFolderName)
    val dictionaryLocation = new File(s"$targetFolderName/dictionary")

    if (!dictionaryLocation.exists) {
      dictionaryLocation.mkdir
    }

    val dictionaryName = "dictionary"
    val classCatalogName = "dictionary_catalog"

    val CLASS_CATALOG = classCatalogName
    val environmentConfig = new EnvironmentConfig()
    environmentConfig.setTransactional(false)
    environmentConfig.setAllowCreate(true)

    val environment = new Environment(dictionaryLocation, environmentConfig);
    val databaseConfig = new DatabaseConfig();
    databaseConfig.setTransactional(false);
    databaseConfig.setAllowCreate(true);
    val catalogDatabase = environment.openDatabase(null, CLASS_CATALOG, databaseConfig);
    val catalog = new StoredClassCatalog(catalogDatabase);
    val keyBinding = new SerialBinding(catalog, classOf[java.lang.String]);
    val valueBinding = new SerialBinding(catalog, classOf[java.lang.Integer]);
    val dictionary = new StoredMap(catalogDatabase, keyBinding, valueBinding, true);
    val databaseCache = environment.openDatabase(null, dictionaryName, databaseConfig)

    var maxId = 0

    for (entry <- QueryEncoding.m) {
      dictionary.put(entry._1, entry._2)
      maxId = entry._2
    }

    var nextId = maxId + 1
    val dictionaryPath = s"$targetFolderName/dictionary.txt"

    def register(entry: String): Int = {
      val id = dictionary.get(entry)
      if (id != null) {
        id
      } else {
        val idForEntry = nextId
        dictionary.put(entry, idForEntry)
        nextId += 1
        idForEntry
      }
    }

    def encodeFile(source: File, target: File) {
      val is = new FileInputStream(source)
      val binaryOs = new FileOutputStream(target)
      val binaryDos = new DataOutputStream(binaryOs)
      val nxp = new NxParser(is)
      while (nxp.hasNext) {
        val triple = nxp.next
        val subjectString = triple(0).toString
        if (!subjectString.startsWith("file:///Users")) {
          val predicateString = triple(1).toString
          val objectString = triple(2).toString
          val sId = register(subjectString)
          val pId = register(predicateString)
          val oId = register(objectString)
          binaryDos.writeInt(sId)
          binaryDos.writeInt(pId)
          binaryDos.writeInt(oId)
        }
      }
      binaryDos.close
      binaryOs.close
      is.close
    }

    println("Encoding files ...")

    val sourceFiles = filesIn(sourceFolderName).
      filter(_.getName.endsWith(".nt")).
      sorted

    for (src <- sourceFiles) {
      val trg = new File(targetFolderName + "/" + src.getName.replace(".nt", ".binary"))
      println(s"Encoding file $src.")
      encodeFile(src, trg)
    }

    println(s"${sourceFiles.length} files have been encoded, dictionary contains ${nextId} entries.")

    //println("Writing dictionary.")
    //val dictionaryOs = new FileOutputStream(dictionaryPath)
    //val writer = new OutputStreamWriter(dictionaryOs, "UTF8")
    //for (entry <- dictionary) {
    //writer.write(s"${entry._1} -> ${entry._2}\n")
    //}
    //writer.close
    //dictionaryOs.close

    databaseCache.close();
    catalog.close();
    environment.close();
  }
}