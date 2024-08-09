package com.ddt.samplecodes.collections

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5).also { println(numbers) }
    numbers.add(3, 11).also { println(numbers) }

    numbers.addAll(arrayOf(7, 8)).also { println(numbers) }
    numbers.addAll(2, setOf(-1, 3)).also { println(numbers) }

    println()
    val stringNumbers = mutableListOf("one", "two")
    stringNumbers += "three"
    println(stringNumbers)
    stringNumbers += listOf("four", "five")
    println(stringNumbers)

    println()
    stringNumbers -= "three"
    println(stringNumbers)
    stringNumbers -= listOf("four", "five")
    println(stringNumbers)

    println()
    numbers.remove(3).also { println(numbers) }
    numbers.removeAt(1).also { println(numbers) }

    println()
    numbers.removeFirst().also { println(numbers) }
    numbers.removeFirstOrNull().also { println(numbers) }
    numbers.removeLast().also { println(numbers) }
    numbers.removeLastOrNull().also { println(numbers) }

    println()
    numbers.addAll(12..18).also { println(numbers) }
    numbers.addAll(12..15).also { println(numbers) }
    numbers.removeIf { it < 12 }.also { println(numbers) }
    numbers.removeIf { it < 12 }.also { println(numbers) }
    numbers.removeAll { it < 14 }.also { println(numbers) }
    numbers.removeAll(15..16).also { println(numbers) }

    println()
    numbers.retainAll { it > 14 }.also { println(numbers) }
    numbers.clear().also { println(numbers) }
}