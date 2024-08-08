package com.ddt.samplecodes.collections

fun main() {
    var numbers = listOf("one", "two", "three", "four", "five")
    val groupedByFirstLetter = numbers.groupBy { it.first().uppercase() }
    println(groupedByFirstLetter)


    val groupedAndTransformed =
        numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.uppercase() })
    println(groupedAndTransformed)

    val grouping = numbers.groupingBy { it.first() }
    println(grouping.eachCount())
}