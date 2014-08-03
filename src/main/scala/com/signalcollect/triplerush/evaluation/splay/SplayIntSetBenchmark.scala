package com.signalcollect.triplerush.evaluation.splay

import scala.util.Random
import com.signalcollect.triplerush.util.MemoryEfficientSplayIntSet
import java.util.function.Consumer
import com.signalcollect.util.SplayIntSet
import com.signalcollect.util.IntHashSet

final class SplayIntSet10PNF0DOT0 extends SplayIntSet {
  def overheadFraction = 0.0f
  def maxNodeIntSetSize = 10
}

final class SplayIntSet50PNF0DOT1 extends SplayIntSet {
  def overheadFraction = 0.1f
  def maxNodeIntSetSize = 50
}

object SplayIntSetBenchmark extends App {

  val runs = 10
  val maxSize = 5000000
  val numberOfAccesses = maxSize
  val randomRange = math.max(10 * maxSize, Int.MaxValue)
  //  val numberOfRandomNumbers = 10000000
  //  val randomInts = new Array[Int](numberOfRandomNumbers)
  //  var i = 0
  //  val r = new Random(0)
  //  print("Initializing random numbers ...")
  //  while (i < randomInts.length) {
  //    randomInts(i) = r.nextInt(randomRange) & Int.MaxValue
  //    i += 1
  //  }
  //  println(" Done.")

  val bestTime = (1 to runs).map(x => intHashSetInsertBenchmark).min
  //  val bestTime = (1 to runs).map(x => javaIntSetInsertBenchmark).min
  //val bestTime = (1 to runs).map(x => splayTraverseAllBenchmark).min
  //val bestTime = (1 to runs).map(x => javaIntSetTraverseAllBenchmark).min
  //val bestTime = (1 to runs).map(x => splayContainsBenchmark).min
  //  val bestTime = (1 to runs).map(x => splayInsertBenchmark).min

  println(s"Best time: $bestTime milliseconds")

  def splayInsertBenchmark: Double = {
    val startTime = System.nanoTime
    val splayIntSet = new SplayIntSet10PNF0DOT0
    var i = 0
    val r = new Random(0)
    while (i < maxSize) {
      splayIntSet.insert(r.nextInt(randomRange))
      i += 1
      if (i % 1000000 == 0) {
        val timeSoFar = ((System.nanoTime - startTime) / 1e5).round / 10.0
        println(s"$i ints loaded in $timeSoFar milliseconds.")
      }
    }
    val finishTime = System.nanoTime
    val totalTimeInMs = ((finishTime - startTime) / 1e5).round / 10.0
    totalTimeInMs
  }

  def intHashSetInsertBenchmark: Double = {
    val startTime = System.nanoTime
    val intHashSet = new IntHashSet()
    var i = 0
    val r = new Random(0)
    while (i < maxSize) {
      val nextInt = r.nextInt(randomRange)
      if (nextInt != 0) {
        intHashSet.add(nextInt)
      }
      i += 1
      if (i % 1000000 == 0) {
        val timeSoFar = ((System.nanoTime - startTime) / 1e5).round / 10.0
        println(s"$i ints loaded in $timeSoFar milliseconds.")
      }
    }
    val finishTime = System.nanoTime
    val totalTimeInMs = ((finishTime - startTime) / 1e5).round / 10.0
    totalTimeInMs
  }

  def javaIntSetInsertBenchmark: Double = {
    val startTime = System.nanoTime
    val intSet = new java.util.HashSet[Int]
    var i = 0
    val r = new Random(0)
    while (i < maxSize) {
      intSet.add(r.nextInt(randomRange))
      i += 1
      if (i % 1000000 == 0) {
        val timeSoFar = ((System.nanoTime - startTime) / 1e5).round / 10.0
        println(s"$i ints loaded in $timeSoFar milliseconds.")
      }
    }
    val finishTime = System.nanoTime
    val totalTimeInMs = ((finishTime - startTime) / 1e5).round / 10.0
    totalTimeInMs
  }

  def splayTraverseAllBenchmark: Double = {
    val splayIntSet = new MemoryEfficientSplayIntSet
    var i = 0
    val r = new Random(0)
    while (i < maxSize) {
      splayIntSet.insert(r.nextInt(randomRange))
      i += 1
    }
    val startTime = System.nanoTime
    var sum: Long = 0
    splayIntSet.foreach(sum += _)
    val finishTime = System.nanoTime
    val totalTimeInMs = ((finishTime - startTime) / 1e5).round / 10.0
    println(sum)
    totalTimeInMs
  }

  def javaIntSetTraverseAllBenchmark: Double = {
    val intSet = new java.util.HashSet[Int]
    var i = 0
    val r = new Random(0)
    while (i < maxSize) {
      intSet.add(r.nextInt(randomRange))
      i += 1
    }
    val startTime = System.nanoTime
    var sum: Long = 0
    intSet.forEach(new Consumer[Int] {
      def accept(i: Int) {
        sum += i
      }
    })
    val finishTime = System.nanoTime
    val totalTimeInMs = ((finishTime - startTime) / 1e5).round / 10.0
    println(sum)
    totalTimeInMs
  }

  def splayContainsBenchmark: Double = {
    val splayIntSet = new MemoryEfficientSplayIntSet
    var i = 0
    val r = new Random(0)
    while (i < maxSize) {
      splayIntSet.insert(r.nextInt(randomRange))
      i += 1
    }
    i = 0
    val startTime = System.nanoTime
    var sum = 0
    while (i < numberOfAccesses) {
      if (splayIntSet.contains(r.nextInt(randomRange))) {
        sum += 1
      }
      i += 1
    }
    val finishTime = System.nanoTime
    val totalTimeInMs = ((finishTime - startTime) / 1e5).round / 10.0
    println(sum)
    totalTimeInMs
  }

  def javaIntSetContainsBenchmark: Double = {
    val intSet = new java.util.HashSet[Int]
    var i = 0
    val r = new Random(0)
    while (i < maxSize) {
      intSet.add(r.nextInt(randomRange))
      i += 1
    }
    i = 0
    val startTime = System.nanoTime
    var sum = 0
    while (i < numberOfAccesses) {
      if (intSet.contains(r.nextInt(randomRange))) {
        sum += 1
      }
      i += 1
    }
    val finishTime = System.nanoTime
    val totalTimeInMs = ((finishTime - startTime) / 1e5).round / 10.0
    println(sum)
    totalTimeInMs
  }

}
