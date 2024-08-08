package com.ddt.samplecodes.collections

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers[3])
    println(numbers.get(3))

    println()
    println(numbers.elementAt(3))
    println(numbers.elementAtOrNull(10))
    println(numbers.elementAtOrElse(10) { "Unknown" })

    println()
    println(numbers.first())
    println(numbers.firstOrNull())
    println(numbers.first { it.length > 3 })
    println(numbers.firstOrNull { it.length > 6 })
    println(numbers.firstNotNullOf { it.length == 3 })
    println(numbers.firstNotNullOfOrNull { it.length == 3 })

    println()
    println(numbers.last())
    println(numbers.lastOrNull())
    println(numbers.last { it.startsWith("f") })
    println(numbers.lastOrNull { it.length > 6 })

    println()
    println(numbers.find { it.length == 3 })
    println(numbers.findLast { it.length == 3 })

    println()
    println(numbers.random())
    println(numbers.randomOrNull())

    println()
    println(numbers.contains("four"))
    println("zero" in numbers)
    println("zero" !in numbers)

    println()
    println(numbers.containsAll(listOf("four", "two")))
    println(numbers.containsAll(listOf("one", "zero")))
    println(numbers.isEmpty())
    println(numbers.isNotEmpty())
}