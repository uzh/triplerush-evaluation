/*
 *  @author Philip Stutz
 *  
 *  Copyright 2014 University of Zurich
 *      
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *         http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  
 */

package com.signalcollect.triplerush.evaluation

import com.signalcollect.triplerush.QuerySpecification
import com.signalcollect.triplerush.TriplePattern
import scala.collection.mutable.PriorityQueue

object DbpediaQueries {

  val oneHopQueries = List("""
SELECT ?T
WHERE {
		  <http://dbpedia.org/resource/Elvis_Presley> <http://dbpedia.org/property/wikilink> ?T
}
""")

  val twoHopQueries = List("""
SELECT ?T ?A
WHERE {
		  <http://dbpedia.org/resource/Elvis_Presley> <http://dbpedia.org/property/wikilink> ?A .
		  ?A <http://dbpedia.org/property/wikilink> ?T
}
""")

  val threeHopQueries = List("""
SELECT ?T ?A ?B
WHERE {
		  <http://dbpedia.org/resource/Elvis_Presley> <http://dbpedia.org/property/wikilink> ?A .
		  ?A <http://dbpedia.org/property/wikilink> ?B .
		  ?B <http://dbpedia.org/property/wikilink> ?T
}
""")

  def topKCounts(topK: Int, counts: Map[Int, Int]): Map[Int, Int] = {
    implicit val ordering = Ordering.by((value: (Int, Int)) => value._2)
    val topKQueue = new PriorityQueue[(Int, Int)]()(ordering.reverse)
    for (count <- counts) {
      if (topKQueue.size < topK) {
        topKQueue += count
      } else {
        if (ordering.compare(topKQueue.head, count) < 0) {
          topKQueue.dequeue
          topKQueue += count
        }
      }
    }
    topKQueue.toMap
  }

  /**
   * Returns an empty map if the sum of all values in the map is zero.
   * Otherwise, returns a map with normalized counts.
   */
  def countMapToDistribution(counts: Map[Int, Int]): Map[Int, Double] = {
    val totalCount: Double = counts.values.sum
    if (totalCount == 0) {
      Map.empty
    } else {
      counts.map(c => c._1 -> c._2 / totalCount)
    }
  }
}
