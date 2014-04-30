package com.signalcollect.triplerush.evaluation

class BerlinSparqlParameterized666 extends BerlinSparqlQueries {

  def warmupQueries = Map(
    4 -> List(1, 2),
    5 -> List(1, 2),
    6 -> List(1, 2),
    7 -> List(1, 2),
    8 -> List(1, 2),
    10 -> List(1, 2),
    11 -> List(1, 2),
    1 -> List(1, 2),
    2 -> List(1, 2),
    3 -> List(1, 2))

  def queriesWithResults = Map(
    10 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    11 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    1 -> List(3, 4, 5, 6, 7, 8, 9, 11, 12, 16, 17, 19, 20, 21, 22, 25),
    2 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    3 -> List(3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    4 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 17, 18, 21, 22, 23, 24),
    5 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    6 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    7 -> List(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
    8 -> List(3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25)
    )

  def queries = Map(
    1 -> List("""
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>

SELECT DISTINCT ?product ?label
WHERE { 
    ?product rdfs:label ?label .
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature833> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature651> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature671> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType23> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1048> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType8> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature294> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature297> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType21> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature963> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature73> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature845> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature59> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1880> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1854> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType9> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature352> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature346> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1872> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1838> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature836> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature43> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType30> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1512> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1504> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType45> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2389> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature200> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2113> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2082> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType20> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature906> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature917> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType47> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature204> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature212> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature193> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2101> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType11> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature449> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature429> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType9> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature350> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature358> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType16> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature681> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature738> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature8> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature477> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType9> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature27> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature333> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1843> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1838> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType29> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature97> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature91> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType27> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature116> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1326> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType44> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2313> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature214> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType23> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1066> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1048> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType33> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1687> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature160> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType24> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature128> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature83> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType46> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature191> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature220> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType38> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature146> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature160> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType20> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature66> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature66> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType52> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature273> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature277> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType11> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature29> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType33> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1689> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature147> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType35> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1822> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature180> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType20> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature923> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature41> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType27> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature137> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1335> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType45> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2367> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature197> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType24> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1144> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1127> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType25> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1199> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature115> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType10> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature375> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature405> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature494> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature18> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType28> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature104> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature99> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2739> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2725> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType51> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature272> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature266> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature633> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature9> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType44> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2309> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature217> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType44> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2324> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2331> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType31> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1575> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature80> . 
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType26> .
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1279> . 
    ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature101> . 
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
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
}
""", """
PREFIX bsbm-inst: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?label ?comment ?producer ?productFeature ?propertyTextual1 ?propertyTextual2 ?propertyTextual3
 ?propertyNumeric1 ?propertyNumeric2 
WHERE {
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> rdfs:label ?label .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> rdfs:comment ?comment .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:producer ?p .
    ?p rdfs:label ?producer .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> dc:publisher ?p . 
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productFeature ?f .
    ?f rdfs:label ?productFeature .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productPropertyTextual1 ?propertyTextual1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productPropertyTextual2 ?propertyTextual2 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productPropertyTextual3 ?propertyTextual3 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productPropertyNumeric1 ?propertyNumeric1 .
    <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productPropertyNumeric2 ?propertyNumeric2 .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature61> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature620> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType27> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature96> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType23> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1063> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature59> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType13> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature507> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType23> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature38> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType9> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature346> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType30> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1504> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType17> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType48> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2502> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType16> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature66> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2101> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2102> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType30> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature102> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType41> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2164> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType9> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature333> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType24> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature103> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType29> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature108> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType35> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1835> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType23> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1048> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType45> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature201> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature236> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType30> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1506> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType20> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature908> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType20> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature68> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType54> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature271> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType16> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature76> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType20> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature653> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType44> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature190> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature50> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType10> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature411> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature209> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1872> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType8> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature292> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature633> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType33> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1677> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType43> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2250> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType14> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature614> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType48> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature282> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature223> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType14> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature582> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType30> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature104> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature57> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType9> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature354> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType51> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature240> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature655> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature246> .
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
    ?product a <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType13> .
	?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature555> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature61> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature57> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature61> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature842> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType39> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2068> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature151> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType39> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2068> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2034> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType8> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature28> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature303> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType8> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature28> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature317> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature474> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature474> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature474> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature476> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1854> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1838> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1854> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature164> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType23> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature38> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature53> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType23> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature38> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature52> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature43> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature848> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType18> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature43> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature56> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType21> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature47> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature995> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType21> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature47> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature980> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2082> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature193> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2082> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature203> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2742> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature276> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2742> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2723> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2101> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature216> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType40> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2101> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2089> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType33> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature157> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature179> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType33> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature157> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1676> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType16> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature738> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature701> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType16> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature738> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature61> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType35> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature159> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1829> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType35> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature159> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature163> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1838> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1882> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1838> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature172> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType29> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature108> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature90> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType29> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature108> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1465> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType44> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature214> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature200> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType44> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature214> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2344> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature484> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature496> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature484> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature483> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType24> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1133> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature133> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType24> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1133> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1157> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType49> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature258> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2560> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType49> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature258> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature231> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType20> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature908> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature905> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType20> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature908> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature65> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType21> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature997> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature75> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType21> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature997> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature945> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType33> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature147> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1674> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType33> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature147> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature169> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType31> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1578> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature130> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType31> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1578> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature119> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType27> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1319> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature99> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType27> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1319> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature112> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType44> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature190> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature213> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType44> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature190> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature221> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType25> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature115> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1186> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType25> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature115> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature118> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType35> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1799> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1826> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType35> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1799> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1802> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType28> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature136> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1379> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType28> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature136> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature80> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType27> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1352> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1363> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType27> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1352> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature124> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature633> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature672> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature633> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature26> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType19> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature891> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature48> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType19> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature891> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature878> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType31> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature80> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1580> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType31> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature80> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1558> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1881> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature165> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1881> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature181> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType48> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature255> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2521> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType48> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature255> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2510> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType14> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature582> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature26> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType14> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature582> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature23> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType52> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2686> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2691> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType52> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2686> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2694> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature229> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature254> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature229> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2709> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType32> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature152> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1617> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType32> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature152> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1635> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature655> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType15> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature679> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature246> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2699> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType53> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature246> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature284> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1853> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1849> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType36> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1853> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature143> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType31> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1558> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature136> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType31> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1558> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1556> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType42> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature200> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2222> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType42> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature200> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2201> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType54> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2764> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature284> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType54> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2764> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2793> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType35> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1831> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1787> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType35> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1831> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature146> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType24> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1168> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1103> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType24> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1168> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature1115> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature493> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature10> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature11> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType39> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature156> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature166> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType39> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature156> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature2064> .
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
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature19> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature492> .
       ?product bsbm:productPropertyTextual1 ?propertyTextual .
	   ?product bsbm:productPropertyNumeric1 ?p1 .
    } UNION {
       ?product rdfs:label ?label .
       ?product rdf:type <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductType12> .
       ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature19> .
	   ?product bsbm:productFeature <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/ProductFeature6> .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productFeature ?prodFeature .
	?product bsbm:productFeature ?prodFeature .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productPropertyNumeric1 ?origProperty1 .
	?product bsbm:productPropertyNumeric1 ?simProperty1 .
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> bsbm:productPropertyNumeric2 ?origProperty2 .
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
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> rdfs:label ?productLabel .
}
""", """
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>

SELECT ?productLabel 
WHERE { 
	<http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> rdfs:label ?productLabel .
}
"""),
    8 -> List("""
PREFIX bsbm: <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/vocabulary/>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX rev: <http://purl.org/stuff/rev#>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?title ?text ?reviewDate ?reviewer ?reviewerName 
WHERE { 
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> .
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
	?review bsbm:reviewFor <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product47> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product370> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product225> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product536> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product650> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product14> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product204> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product34> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product581> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product296> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product295> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product221> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product437> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product172> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product302> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product456> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product383> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product33> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product341> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product638> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product301> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product429> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product239> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product336> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product472> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product486> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product176> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer1/Product3> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer6/Product226> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer12/Product555> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product491> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer9/Product394> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer7/Product306> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product452> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product83> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product475> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product202> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer11/Product513> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer13/Product629> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer3/Product138> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer5/Product206> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer4/Product152> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer14/Product662> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product358> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product347> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer8/Product346> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer2/Product81> .
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
	?offer bsbm:product <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromProducer10/Product476> .
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
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer12035> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer12035> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1036> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1036> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1557> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1557> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer2489> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer2489> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor6/Offer11192> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor6/Offer11192> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer7976> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer7976> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer6008> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer6008> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8196> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8196> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer2032> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer2032> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer7241> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer7241> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1628> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1628> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer9357> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer9357> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8953> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8953> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer12875> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer12875> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer437> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer437> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4168> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4168> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8294> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8294> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer12444> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer12444> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer5045> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer5045> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor6/Offer11355> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor6/Offer11355> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer10331> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer10331> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1970> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1970> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer6961> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer6961> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer5757> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer5757> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer2237> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer2237> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer2334> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer2334> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4468> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4468> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1818> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1818> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8834> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8834> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer5997> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer5997> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer7552> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer7552> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer3219> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer3219> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer6485> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer6485> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer5056> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor3/Offer5056> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer6300> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer6300> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer2450> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer2450> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8075> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8075> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer2473> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer2473> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4198> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4198> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1179> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer1179> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer11951> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer11951> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4134> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4134> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer2870> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer2870> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer2150> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor1/Offer2150> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor6/Offer11318> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor6/Offer11318> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4354> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor2/Offer4354> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer6341> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor4/Offer6341> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer10336> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer10336> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8073> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor5/Offer8073> }
}
""", """
SELECT ?property ?hasValue ?isValueOf
WHERE {
  { <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer11798> ?property ?hasValue }
  UNION
  { ?isValueOf ?property <http://www4.wiwiss.fu-berlin.de/bizer/bsbm/v01/instances/dataFromVendor7/Offer11798> }
}
"""))

}
