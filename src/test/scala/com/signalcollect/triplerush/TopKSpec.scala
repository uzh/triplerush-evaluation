/*
 *  @author Philip Stutz
 *  @author Bibek Paudel
 *  
 *  Copyright 2013 University of Zurich
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

package com.signalcollect.triplerush

import org.scalatest.FlatSpec
import com.signalcollect.triplerush.evaluation.DbpediaQueries
import org.scalatest.Matchers

class TopKSpec extends FlatSpec with Matchers with TestAnnouncements {

  "topKCounts" should "return the topK items by value from an (Int, Int) map" in {
    val testMap = Map(1 -> 2, 2 -> 1, 3 -> 10)
    val result = DbpediaQueries.topKCounts(2, testMap)
    assert(result === Map(1 -> 2, 3 -> 10))
  }

  "countMapToDistribution" should "return the distribution of an (Int, Int) map" in {
    val testMap = Map(1 -> 2, 2 -> 1, 3 -> 10)
    val result = DbpediaQueries.countMapToDistribution(testMap)
    assert(result(1) === 0.1538 +- 0.001)
    assert(result(2) === 0.0769 +- 0.001)
    assert(result(3) === 0.7692 +- 0.001)
  }
}
