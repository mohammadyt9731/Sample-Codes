package com.ddt.samplecodes.collections

fun main() {
//    sliceSampleCodes()
//    takeAndDropSampleCodes()
//    chunkedSampleCodes()
    windowedSampleCodes()
}

fun sliceSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.slice(1..3))
    println(numbers.slice(0..4))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(0..<2))
    println(numbers.slice(listOf(1, 4)))
    println(numbers.slice(setOf(3, 5, 0)))
}

fun takeAndDropSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.takeWhile { !it.startsWith('f') })
    println(numbers.takeLastWhile { it != "three" })

    println(numbers.drop(1))
    println(numbers.dropLast(5))
    println(numbers.dropWhile { it.length == 3 })
    println(numbers.dropLastWhile { it.contains('i') })
}

fun chunkedSampleCodes() {
    val numbers = (0..13).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3) { it.sum() })
}

fun windowedSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.windowed(3))
    println(numbers.windowed(3, step = 2))
    println(numbers.windowed(3, step = 2, partialWindows = true))
    println(numbers.windowed(3) { it.joinToString() })
}