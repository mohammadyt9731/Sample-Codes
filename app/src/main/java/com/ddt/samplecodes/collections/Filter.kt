package com.ddt.samplecodes.collections

fun main() {
    filterByPredicateSampleCodes()
//    partitionSampleCodes()
//    testPredicatesSampleCodes()
}

fun filterByPredicateSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")

    // Filter strings with length greater than 3
    println("Filtered (length > 3): " + numbers.filter { it.length > 3 })

    // Filter with index consideration, excluding first element, and length less than 5
    println("Filtered with index (not first, length < 5): " + numbers.filterIndexed { index, s -> (index != 0) && (s.length < 5) })

    // Filter out strings with length greater than 3
    println("Filtered out (length > 3): " + numbers.filterNot { it.length > 3 })

    // Filter to a mutable list with strings having length greater than 3
    val filteredNumbers = mutableListOf<String>()
    numbers.filterTo(filteredNumbers) { it.length > 3 }
    println("Filtered to mutable list (length > 3): $filteredNumbers")

    // Working with maps: Filtering by keys and values
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)

    // Filter map where keys end with '1' and values are greater than 10
    println("Filtered map (key ends with '1', value > 10): " + numbersMap.filter { (key, value) ->
        key.endsWith(
            "1"
        ) && value > 10
    })

    // Filter map by keys with length less than 4
    println("Filtered map by keys (length < 4): " + numbersMap.filterKeys { it.length < 4 })

    // Filter map by values greater than 2
    println("Filtered map by values (value > 2): " + numbersMap.filterValues { it > 2 })

    // Filtering by type or null check
    val mixedList = listOf(null, 1, "two", 3.0, "four")

    // Filter only instances of String
    println("Filtered instances of String: " + mixedList.filterIsInstance<String>())

    // Filter out null values
    println("Filtered non-null values: " + mixedList.filterNotNull())
}

fun partitionSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")

    // Partition into two lists based on length > 3
    val (match, rest) = numbers.partition { it.length > 3 }

    println("Partition matching (length > 3): $match")
    println("Partition rest (length <= 3): $rest")
}

fun testPredicatesSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")

    // Check if any element ends with 'e'
    println("Any ends with 'e': " + numbers.any { it.endsWith("e") })

    // Check if no elements end with 'a'
    println("None ends with 'a': " + numbers.none { it.endsWith("a") })

    // Check if all elements end with 'e'
    println("All ends with 'e': " + numbers.all { it.endsWith("e") })

    // Check an empty list with all predicate
    println("All elements > 5 in empty list: " + emptyList<Int>().all { it > 5 })

    // Check if any element exists in a non-empty and an empty list
    val empty = emptyList<String>()
    println("Any element in non-empty list: " + numbers.any())
    println("Any element in empty list: " + empty.any())

    // Check if no elements exist in a non-empty and an empty list
    println("None element in non-empty list: " + numbers.none())
    println("None element in empty list: " + empty.none())
}