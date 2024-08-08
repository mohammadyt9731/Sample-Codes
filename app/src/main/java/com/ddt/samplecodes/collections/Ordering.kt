package com.ddt.samplecodes.collections

fun main() {

    val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }
    println(listOf("aaa", "bb", "c").sortedWith(lengthComparator))
    println(listOf("aaa", "bb", "c").sortedWith(compareBy { it.length }))

    val numbers = listOf("one", "two", "three", "four")

    println("Sorted ascending: ${numbers.sorted()}")
    println("Sorted descending: ${numbers.sortedDescending()}")

    val sortedNumbers = numbers.sortedBy { it.length }
    println("Sorted by length ascending: $sortedNumbers")
    val sortedByLast = numbers.sortedByDescending { it.last() }
    println("Sorted by the last letter descending: $sortedByLast")
    println("Sorted by length ascending: ${numbers.sortedWith(compareBy { it.length })}")

    println(numbers.reversed())
    println(numbers.asReversed())
    val mutableNumbers = mutableListOf("one", "two", "three", "four")
    val reversedNumbers = mutableNumbers.asReversed()
    println(reversedNumbers)
    mutableNumbers.add("five")
    println(reversedNumbers)

    println(numbers.shuffled())
}