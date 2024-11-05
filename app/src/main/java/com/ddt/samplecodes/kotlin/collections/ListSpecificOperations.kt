package com.ddt.samplecodes.kotlin.collections

fun main() {
    retrieveElementsAndParts()
//    findElementPositions()
//    binarySearchAndWriteOperations()
}

fun retrieveElementsAndParts() {
    val numbers = (1..10).toList()

    // Retrieve elements by index
    println("Element at index 0: ${numbers.get(0)}")
    println("Element at index 0 using bracket: ${numbers[0]}")
    println("Element at index 10 (or null): ${numbers.getOrNull(10)}")
    println("Element at index 10 (or default): ${numbers.getOrElse(10) { it }}")

    // Retrieve list parts
    println("Sublist from index 3 to 6: ${numbers.subList(3, 6)}")
}

fun findElementPositions() {
    val numbers = (1..10).toList()

    // Linear search
    println("Index of 2: ${numbers.indexOf(2)}")
    println("Index of 12: ${numbers.indexOf(12)}")
    println("Last index of 2: ${numbers.lastIndexOf(2)}")
    println("Last index of 12: ${numbers.lastIndexOf(12)}")

    // Conditional search
    println("Index of first element > 2: ${numbers.indexOfFirst { it > 2 }}")
    println("Index of last odd element: ${numbers.indexOfLast { it % 2 == 1 }}")
}

fun binarySearchAndWriteOperations() {
    // Binary search in sorted list
    val stringNumbers = mutableListOf("one", "two", "three", "four")
    stringNumbers.sort()
    println("Sorted stringNumbers: $stringNumbers")
    println("Binary search for 'two': ${stringNumbers.binarySearch("two")}")
    println("Binary search for 'z': ${stringNumbers.binarySearch("z")}")
    println("Binary search in range for 'two': ${stringNumbers.binarySearch("two", 0, 2)}")

    // Comparator binary search
    val productList = listOf(
        Product("WebStorm", 49.0),
        Product("AppCode", 99.0),
        Product("DotTrace", 129.0),
        Product("ReSharper", 149.0)
    )
    println(
        "Binary search for AppCode by price: " + productList.binarySearch(
            Product("AppCode", 99.0),
            compareBy<Product> { it.price }.thenBy { it.name })
    )

    val colors = listOf("Blue", "green", "ORANGE", "Red", "yellow")
    println(
        "Binary search for 'RED' with case-insensitive order: ${
            colors.binarySearch(
                "RED",
                String.CASE_INSENSITIVE_ORDER
            )
        }"
    )

    // List write operations
    val mutableNumbers = mutableListOf("one", "five", "six")
    mutableNumbers.add(1, "two").also { println("After adding 'two' at index 1: $mutableNumbers") }
    mutableNumbers.addAll(2, listOf("three", "four"))
        .also { println("After adding 'three', 'four': $mutableNumbers") }
    mutableNumbers[1] = "two"
    println("After setting element at index 1: $mutableNumbers")
    mutableNumbers.fill("ten").also { println("After filling list with 'ten': $mutableNumbers") }
}


data class Product(val name: String, val price: Double)