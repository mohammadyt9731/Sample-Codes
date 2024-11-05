package com.ddt.samplecodes.kotlin.collections

fun main() {
    retrieveFromMap()
//    filterAndModifyMap()
//    writeAndRemoveFromMap()
}

fun retrieveFromMap() {
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // Retrieve values by key
    println("Value associated with key 'one': ${numbersMap.get("one")}")
    println("Value associated with key 'one' using indexing: ${numbersMap["one"]}")
    println("Value associated with key 'four' or default (10) if not found: ${numbersMap.getOrDefault("four", 10)}")
    println("Value associated with key 'five' or default using getOrElse: ${numbersMap.getOrElse("five") { 5 }}")
    println("Value associated with key 'five' using indexing: ${numbersMap["five"]}")

    // Access keys and values
    println("All keys in the map: ${numbersMap.keys}")
    println("All values in the map: ${numbersMap.values}")
}

fun filterAndModifyMap() {
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // Filter operations
    numbersMap.filter { (key, value) -> key.endsWith("e") && value > 1 }
        .also { println("Filtered entries where keys end with 'e' and values are greater than 1: $it") }
    numbersMap.filterNot { (key, value) -> key.endsWith("e") && value > 1 }
        .also { println("Filtered entries where keys do NOT end with 'e' or values are NOT greater than 1: $it") }
    numbersMap.filterKeys { it.endsWith("o") }
        .also { println("Filtered entries where keys end with 'o': $it") }
    numbersMap.filterValues { it < 3 }
        .also { println("Filtered entries where values are less than 3: $it") }

    // Plus and minus operations
    println("Adding a new pair 'four' -> 4 to the map: ${numbersMap + Pair("four", 4)}")
    println("Adding multiple pairs: 'five' -> 5, and replacing 'one' -> 11: ${numbersMap + mapOf("five" to 5, "one" to 11)}")
    println("Removing the entry with key 'one': ${numbersMap - "one"}")
    println("Removing entries with keys 'two' and 'four': ${numbersMap - listOf("two", "four")}")
}

fun writeAndRemoveFromMap() {
    val mutableMap = mutableMapOf("one" to 1, "two" to 2)

    // Write operations
    mutableMap.getOrPut("one") { 10 }.also { println("Value for key 'one' (exists already, so no change): $it") }
    mutableMap.getOrPut("ten") { 10 }.also { println("Inserted 'ten' -> 10 using getOrPut: $it") }
    mutableMap.put("three", 3).also { println("Added new entry 'three' -> 3: $mutableMap") }
    mutableMap.put("three", 2).also { println("Updated value for 'three' to 2: $mutableMap") }
    mutableMap["three"] = 3
    mutableMap += mapOf("four" to 4, "five" to 5)
    println("Added entries 'four' -> 4 and 'five' -> 5 using += operator: $mutableMap")

    // Remove operations
    mutableMap.remove("one").also { println("Removed entry with key 'one': $it") }
    mutableMap.remove("three", 4).also { println("Attempted to remove 'three' -> 4 (does not match current value, so no removal): $it") }
    mutableMap.keys.remove("one").also { println("Attempted to remove key 'one' (key not found): $it") }
    mutableMap.values.remove(3).also { println("Removed first occurrence of value 3: $it") }
    mutableMap -= "two"
    println("Removed entry with key 'two' using -=: $mutableMap")
    mutableMap -= "five"
    println("Removed entry with key 'five' using -=: $mutableMap")
}
