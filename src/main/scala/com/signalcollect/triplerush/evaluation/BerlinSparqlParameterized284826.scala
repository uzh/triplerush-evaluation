package com.signalcollect.triplerush.evaluation

class BerlinSparqlParameterized284826 extends BerlinSparqlQueries {

  def warmupQueries = Map(
    1 -> List(1, 2),
    2 -> List(1, 2),
    3 -> List(1, 2),
    4 -> List(1, 2),
    5 -> List(1, 2),
    6 -> List(1, 2),
    7 -> List(1, 2),
    8 -> List(1, 2),
    10 -> List(2, 3),
    11 -> List(1, 2))

  def queriesWithResults = Map(
    10 -> List(4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    11 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    1 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    2 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    3 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    4 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    5 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    6 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    7 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    8 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)
    )

  def queries = Map(1 ->
    List("""
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1446> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature34439> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature892> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1203> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature28577> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature636> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1003> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature28> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature416> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1164> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6752> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature27692> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1465> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10385> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature61> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1302> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature729> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature53> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1528> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature994> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature36425> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType845> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature19658> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2874> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType776> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature17995> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature18010> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1606> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature38235> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12112> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1282> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8171> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8187> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1649> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature86> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature39291> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType764> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature17719> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1939> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType2008> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature16942> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature16945> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1091> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature521> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature518> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1884> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature15430> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1411> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1439> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10093> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature885> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1021> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature24135> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature24137> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1940> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature46165> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature106> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1552> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature36937> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature36931> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1949> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1494> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1494> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1416> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature60> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature849> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1137> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature27027> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature565> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1327> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8735> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature756> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType832> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature19333> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType747> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature17349> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1013> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature23941> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature4918> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType764> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature17736> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1953> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1906> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature45348> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature45353> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1338> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature763> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8882> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType2008> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1551> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1537> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1368> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9214> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9209> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1983> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1522> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1522> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1317> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8600> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8597> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1655> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature39432> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature92> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1224> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature647> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature651> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1103> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature531> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature37> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType769> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1988> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature156> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1740> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature13779> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature41412> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1133> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6363> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature47> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1774> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature14211> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature14208> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1472> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10473> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature921> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1136> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature26989> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature569> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1801> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature42853> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature14486> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1031> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature447> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature31> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1523> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature995> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11038> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType928> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature21765> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature22> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType768> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1991> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2011> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1187> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6996> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature628> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1230> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature44> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature7544> . 
    ?product bsbm:productPropertyNumeric1 ?value1 . 
	}
ORDER BY ?label
LIMIT 10
"""),
    2 -> List("""
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
"""),
    3 -> List("""
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1446> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature892> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1267> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8000> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType959> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature14> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1339> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature31880> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1302> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature725> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1425> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature33933> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1083> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature505> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1661> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature79> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1282> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8187> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1685> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature40122> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1876> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature44686> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1972> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature110> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1884> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1411> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType956> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature381> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType850> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature19773> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1085> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature25731> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1949> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1494> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType908> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature3666> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType993> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature23430> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1767> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1260> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType747> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1649> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1132> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1353> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9024> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1762> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature41944> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType2008> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1537> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1528> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11131> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType826> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2668> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1476> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature64> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1224> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature41> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType803> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature18649> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1600> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12047> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1974> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature16492> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1774> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature14208> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1004> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature35> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType984> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature23192> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType956> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature377> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1523> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature981> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType981> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature396> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1823> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1353> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1570> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1031> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1076> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature29> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1196> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature39> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1570> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature37355> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1282> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8188> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1446> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature888> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1629> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1106> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType2007> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1551> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1779> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1276> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1369> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9230> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT ?product ?label
WHERE {
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1265> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature54> .
	?product bsbm:productPropertyNumeric1 ?p1 .
	?product bsbm:productPropertyNumeric3 ?p3 .
}
ORDER BY ?label
LIMIT 10

"""),
    4 -> List("""
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1446> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature892> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature34422> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1446> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature892> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10180> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1659> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature86> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1133> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1659> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature86> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature90> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1164> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature27692> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature27686> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1164> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature27692> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6760> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1936> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature46071> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature16051> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1936> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature46071> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature46069> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1528> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature69> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11133> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1528> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature69> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature70> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1083> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature505> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature499> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1083> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature505> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature5761> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1606> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12112> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12115> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1606> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12112> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1069> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1721> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature13548> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature13547> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1721> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature13548> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature13554> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType764> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature17720> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1939> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType764> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature17720> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature162> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType777> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature18018> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature166> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType777> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature18018> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2084> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1884> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1411> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1418> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1884> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1411> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature111> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType773> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature17930> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature157> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType773> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature17930> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2046> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1940> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature106> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1479> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1940> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature106> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature46162> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1063> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature5526> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature5507> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1063> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature5526> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature25193> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1416> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature849> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature33706> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1416> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature849> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature847> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType993> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature23430> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature415> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType993> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature23430> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature33> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType832> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature252> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType832> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2740> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType928> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature352> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature21766> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType928> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature352> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature353> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType764> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1953> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1953> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType764> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1953> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature3> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType869> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature288> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature3175> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType869> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature288> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature20272> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType2008> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1537> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature47789> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType2008> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1537> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature16926> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1545> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature36806> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11318> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1545> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature36806> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1012> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1317> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8597> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8601> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1317> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8597> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature752> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1555> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature37006> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11457> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1555> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature37006> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11466> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1103> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature37> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature525> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1103> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature37> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature26224> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1600> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12047> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature38105> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1600> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12047> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12050> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1133> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6352> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6352> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1133> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6352> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature568> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1431> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature34068> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature34076> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1431> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature34068> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10000> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1136> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature569> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature568> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1136> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature569> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6410> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1327> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8720> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature31592> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1327> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8720> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature31594> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1523> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature981> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature69> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1523> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature981> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11038> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1159> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6680> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature578> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1159> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6680> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature580> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1187> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature628> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature628> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1187> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature628> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature28205> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1928> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1450> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature15964> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1928> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1450> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature45866> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType852> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature19826> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature267> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType852> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature19826> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2968> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1570> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature37355> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1034> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1570> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature37355> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11644> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1448> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature62> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature884> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1448> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature62> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature34478> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType905> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature3618> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature13> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType905> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature3618> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature21174> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1892> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature15525> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature15536> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1892> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature15525> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature45019> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1299> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8390> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8395> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1299> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8390> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8405> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1369> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9230> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9207> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1369> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9230> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature792> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1720> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature40957> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature40959> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1720> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature40957> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature40940> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType755> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1839> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType755> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature139> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1326> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8720> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature31574> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1326> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8720> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8735> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType874> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature3248> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType874> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature12> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature3264> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1447> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature890> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10186> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1447> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature890> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10191> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType908> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature21266> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature21255> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType908> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature21266> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature3677> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1328> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8765> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8737> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1328> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8765> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature767> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1579> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature69> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature74> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1579> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature69> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature74> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label ?propertyTextual
WHERE {
    { 
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1456> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature901> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature34692> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType1456> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature901> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature62> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric2 ?p2 .
    } 
}
ORDER BY ?label
LIMIT 10
"""),
    5 -> List("""
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT DISTINCT ?product ?productLabel
WHERE { 
	?product rdfs:label ?productLabel .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> bsbm:productPropertyNumeric2 ?origProperty2 .
	?product bsbm:productPropertyNumeric2 ?simProperty2 .
}
ORDER BY ?productLabel
LIMIT 5
"""),
    6 -> List("""
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>

SELECT ?product ?label
WHERE {
	?product rdfs:label ?label .
    ?product rdf:type bsbm:Product .
}

"""),
    7 -> List("""
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> rdfs:label ?productLabel .
}
"""),
    8 -> List("""
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> .
	?review dc:title ?title .
	?review rev:text ?text .
	?review bsbm:reviewDate ?reviewDate .
	?review rev:reviewer ?reviewer .
	?reviewer foaf:name ?reviewerName .
}
"""),
    10 -> List("""
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1122/Product55547> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer486/Product23902> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2515/Product127209> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer849/Product42227> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5349/Product270932> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3905/Product197342> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5241/Product265304> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3539/Product178692> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2669/Product135010> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2109/Product106031> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3699/Product186776> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1885/Product94605> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5601/Product283789> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4961/Product251081> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3185/Product161165> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1831/Product91858> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5134/Product260042> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer389/Product19104> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2207/Product111161> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2498/Product126351> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer705/Product34751> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer549/Product27056> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2222/Product111967> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4462/Product225537> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3557/Product179615> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer771/Product38298> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4377/Product221362> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4815/Product243576> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4635/Product234608> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3037/Product153627> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3703/Product186928> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2571/Product129981> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3408/Product172319> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4639/Product234826> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1988/Product99984> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4329/Product218900> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4622/Product233849> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4530/Product229135> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4413/Product223312> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3760/Product189879> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2236/Product112739> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5602/Product283854> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2413/Product121862> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4895/Product247682> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3921/Product198242> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4778/Product241672> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2745/Product138875> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2130/Product107128> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1800/Product90213> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
""", """
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> 
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT DISTINCT ?offer ?price
WHERE {
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1103/Product54644> .
	?offer bsbm:vendor ?vendor .
    ?offer dc:publisher ?vendor .
	?vendor bsbm:country <http://downlode.org/rdf/iso-3166/countries#US> .
	?offer bsbm:deliveryDays ?deliveryDays .
	?offer bsbm:price ?price .
    ?offer bsbm:validTo ?date .
}
"""),
    11 -> List("""
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1183/Offer2334155> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1183/Offer2334155> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2755/Offer5435596> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2755/Offer5435596> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2658/Offer5254077> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2658/Offer5254077> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1032/Offer2036009> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1032/Offer2036009> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1576/Offer3119192> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1576/Offer3119192> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1398/Offer2760776> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1398/Offer2760776> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor713/Offer1404608> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor713/Offer1404608> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor670/Offer1317996> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor670/Offer1317996> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1085/Offer2128792> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1085/Offer2128792> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor774/Offer1530161> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor774/Offer1530161> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor387/Offer756428> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor387/Offer756428> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1780/Offer3512517> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1780/Offer3512517> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2168/Offer4271353> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2168/Offer4271353> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1423/Offer2814515> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1423/Offer2814515> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1815/Offer3579077> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1815/Offer3579077> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2214/Offer4364248> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2214/Offer4364248> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor422/Offer829694> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor422/Offer829694> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1453/Offer2867364> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1453/Offer2867364> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2080/Offer4098725> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2080/Offer4098725> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2089/Offer4113915> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2089/Offer4113915> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1461/Offer2883011> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1461/Offer2883011> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1314/Offer2590490> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1314/Offer2590490> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1356/Offer2675401> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1356/Offer2675401> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1556/Offer3073797> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1556/Offer3073797> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1106/Offer2173397> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1106/Offer2173397> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor882/Offer1747254> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor882/Offer1747254> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor258/Offer506188> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor258/Offer506188> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2569/Offer5085618> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2569/Offer5085618> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor264/Offer519434> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor264/Offer519434> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor797/Offer1577757> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor797/Offer1577757> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor673/Offer1326232> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor673/Offer1326232> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor501/Offer984459> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor501/Offer984459> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1677/Offer3305405> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1677/Offer3305405> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2287/Offer4507216> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2287/Offer4507216> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor916/Offer1808940> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor916/Offer1808940> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2279/Offer4491290> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2279/Offer4491290> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor264/Offer518675> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor264/Offer518675> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1994/Offer3931873> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1994/Offer3931873> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1702/Offer3356398> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1702/Offer3356398> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1541/Offer3038139> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1541/Offer3038139> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor349/Offer682391> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor349/Offer682391> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor143/Offer283854> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor143/Offer283854> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1220/Offer2400470> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1220/Offer2400470> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2721/Offer5374550> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2721/Offer5374550> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor970/Offer1907198> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor970/Offer1907198> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2568/Offer5083714> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2568/Offer5083714> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor216/Offer423701> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor216/Offer423701> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1213/Offer2385736> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1213/Offer2385736> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1489/Offer2938473> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1489/Offer2938473> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1327/Offer2618078> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1327/Offer2618078> }
}
"""))

}
