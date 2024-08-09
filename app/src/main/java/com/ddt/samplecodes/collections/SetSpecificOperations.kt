package com.ddt.samplecodes.collections

fun main() {
    val numbers = setOf("one", "two", "three")

    //union
    println(numbers union setOf("four", "five"))
    println(setOf("four", "five") union numbers)

    //intersect
    println(numbers intersect setOf("two", "one"))

    //subtract
    println(numbers subtract setOf("three", "four"))
    println(numbers subtract setOf("one","three"))
}