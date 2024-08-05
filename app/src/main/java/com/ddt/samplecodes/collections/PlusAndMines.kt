package com.ddt.samplecodes.collections

fun main() {
    val numbers = listOf("one", "two", "three", "four")

    var plusList = numbers + "five"
    plusList += listOf("six", "seven")
    val minusList = numbers - listOf("three", "four")
    println(plusList)
    println(minusList)
}