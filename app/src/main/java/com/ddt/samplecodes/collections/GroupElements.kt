package com.ddt.samplecodes.collections

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")

    // Grouping elements by their first letter, converted to uppercase
    val groupedByFirstLetter = numbers.groupBy { it.first().uppercase() }
    println("Grouped by first letter (uppercase): $groupedByFirstLetter")

    // Grouping elements by their first letter and transforming the values to uppercase
    val groupedAndTransformed = numbers.groupBy(
        keySelector = { it.first() },
        valueTransform = { it.uppercase() }
    )
    println("Grouped by first letter with uppercase transformation: $groupedAndTransformed")

    // Using 'groupingBy' to count the occurrences of each group (first letter)
    val grouping = numbers.groupingBy { it.first() }
    println("Count of elements in each group (first letter): ${grouping.eachCount()}")
}