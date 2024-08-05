package com.ddt.samplecodes.collections

fun main() {
//    filterSampleCodes()
//    partitionSampleCodes()
    testPredicatesSampleCodes()
}

fun filterSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.filter { it.length > 3 })
    println(numbers.filterIndexed { index, s -> (index != 0) && (s.length < 5) })
    println(numbers.filterNot { it.length > 3 })
    val filteredNumbers = mutableListOf<String>()
    println(numbers.filterTo(filteredNumbers) { it.length > 3 })
    println(filteredNumbers)


    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10 })
    println(numbersMap.filterKeys { it.length < 4 })
    println(numbersMap.filterValues { it > 2 })


    val myList = listOf(null, 1, "two", 3.0, "four")
    println(myList.filterIsInstance<String>())
    println(myList.filterNotNull())
}

fun partitionSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")
    val (match, rest) = numbers.partition { it.length > 3 }

    println(match)
    println(rest)
}

fun testPredicatesSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")

    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("a") })
    println(numbers.all { it.endsWith("e") })

    println(emptyList<Int>().all { it > 5 })

    val empty = emptyList<String>()

    println(numbers.any())
    println(empty.any())

    println(numbers.none())
    println(empty.none())
}