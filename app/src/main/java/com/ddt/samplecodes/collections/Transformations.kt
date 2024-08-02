package com.ddt.samplecodes.collections

fun main() {
//    mapSampleCodes()
//    zipSampleCodes()
//    associateSampleCodes()
//    flattenSampleCodes()
//    stringRepresentationSampleCodes()
}

fun mapSampleCodes() {
    val numbers = listOf(1, 2, 3, 4, null, 5)
    val mutableList = mutableListOf<String>()

    println(numbers.map { it?.times(2) })
    println(numbers.mapNotNull { it?.times(2) })
    numbers.mapTo(mutableList) { "${it?.times(2)} String" }
    println(mutableList)

    println(numbers.mapIndexed { index, i -> "$index: $i" })
    println(numbers.mapIndexedNotNull { index, i -> "$index: $i" })


    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })
}

fun zipSampleCodes() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)
    println(colors.zip(animals) { color, animal ->
        "The ${animal.replaceFirstChar { it.uppercase() }} is $color"
    })
    println(colors.zipWithNext())
    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())
}

fun associateSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associate { it to it.length })
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.length })
    println(
        numbers.associateBy(
            keySelector = { it.first().uppercase() },
            valueTransform = { it.length })
    )
    val newMap = mutableMapOf<String, Int>()
    numbers.associateTo(newMap) { it to it.length }
    println(newMap)
}

fun flattenSampleCodes() {
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets.flatten())
    val numbers = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(1, 2))

    println(numbers.flatMap { it.map { it * 2 } })
    println(numbers.flatMapIndexed { index: Int, ints: List<Int> -> ints.map { it * index } })
}

fun stringRepresentationSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")

    println(numbers)
    println(numbers.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    numbers.joinTo(listString)
    println(listString)
    println(numbers.joinToString { "$it :" })
    println(numbers.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))

    val numbers2 = (1..100).toList()
    println(numbers2.joinToString(limit = 10, truncated = "<...>"))
    println(numbers.joinToString { "Element: ${it.uppercase()}" })
}