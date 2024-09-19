package com.ddt.samplecodes.collections

fun main() {
    retrieveFromMap()
//    filterAndModifyMap()
//    writeAndRemoveFromMap()
}

fun retrieveFromMap() {
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // Retrieve values by key
    println(numbersMap.get("one"))
    println(numbersMap["one"])
    println(numbersMap.getOrDefault("four", 10))
    println(numbersMap.getOrElse("five") { 5 })
    println(numbersMap["five"])

    // Access keys and values
    println(numbersMap.keys)
    println(numbersMap.values)
}

fun filterAndModifyMap() {
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // Filter operations
    numbersMap.filter { (key, value) -> key.endsWith("e") && value > 1 }.also { println(it) }
    numbersMap.filterNot { (key, value) -> key.endsWith("e") && value > 1 }.also { println(it) }
    numbersMap.filterKeys { it.endsWith("o") }.also { println(it) }
    numbersMap.filterValues { it < 3 }.also { println(it) }

    // Plus and minus operations
    println(numbersMap + Pair("four", 4))
    println(numbersMap + mapOf("five" to 5, "one" to 11))
    println(numbersMap - "one")
    println(numbersMap - listOf("two", "four"))
}

fun writeAndRemoveFromMap() {
    val mutableMap = mutableMapOf("one" to 1, "two" to 2)

    // Write operations
    mutableMap.getOrPut("one") { 10 }.also { println(it) }
    mutableMap.getOrPut("ten") { 10 }.also { println(it) }
    mutableMap.put("three", 3).also { println(mutableMap) }
    mutableMap.put("three", 2).also { println(mutableMap) }
    mutableMap["three"] = 3
    mutableMap += mapOf("four" to 4, "five" to 5)
    println(mutableMap)

    // Remove operations
    mutableMap.remove("one").also { println(it) }
    mutableMap.remove("three", 4).also { println(it) }
    mutableMap.keys.remove("one").also { println(it) }
    mutableMap.values.remove(3).also { println(it) }
    mutableMap -= "two"
    println(mutableMap)
    mutableMap -= "five"
    println(mutableMap)
}

