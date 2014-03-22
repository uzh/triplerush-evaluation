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

object DbpediaQueries {

  val oneHopQueries = List("""
SELECT ?T
WHERE {
    	<http://dbpedia.org/resource/Elvis_Presley> <http://dbpedia.org/property/wikilink> ?T
}
""")
  
  val twoHopQueries = List("""
SELECT ?T
WHERE {
    	<http://dbpedia.org/resource/Elvis_Presley> <http://dbpedia.org/property/wikilink> ?A .
    	?B <http://dbpedia.org/property/wikilink> ?T
}
""")

  val threeHopQueries = List("""
SELECT ?T
WHERE {
    	<http://dbpedia.org/resource/Elvis_Presley> <http://dbpedia.org/property/wikilink> ?A .
    	?B <http://dbpedia.org/property/wikilink> ?C .
    ?D <http://dbpedia.org/property/wikilink> ?T
}
""")

}
