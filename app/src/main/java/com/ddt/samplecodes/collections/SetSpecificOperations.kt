package com.ddt.samplecodes.collections

fun main() {
    val numbers = setOf("one", "two", "three")

    // Perform a union operation, merging two sets
    println("Union of $numbers and setOf('four', 'five'): ${numbers union setOf("four", "five")}")
    println("Union of setOf('four', 'five') and $numbers: ${setOf("four", "five") union numbers}")

    // Perform an intersection operation, keeping only common elements
    println("Intersection of $numbers and setOf('two', 'one'): ${numbers intersect setOf("two", "one")}")

    // Perform a subtract operation, removing elements from the original set
    println("Subtracting setOf('three', 'four') from $numbers: ${numbers subtract setOf("three", "four")}")
    println("Subtracting setOf('one', 'three') from $numbers: ${numbers subtract setOf("one", "three")}")
}

