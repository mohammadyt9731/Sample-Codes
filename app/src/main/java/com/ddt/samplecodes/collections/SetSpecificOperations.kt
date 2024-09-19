package com.ddt.samplecodes.collections

fun main() {
    val numbers = setOf("one", "two", "three")

    // Perform a union operation, merging two sets
    println(numbers union setOf("four", "five"))
    println(setOf("four", "five") union numbers)

    // Perform an intersection operation, keeping only common elements
    println(numbers intersect setOf("two", "one"))

    // Perform a subtract operation, removing elements from the original set
    println(numbers subtract setOf("three", "four"))
    println(numbers subtract setOf("one", "three"))
}
