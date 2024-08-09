package com.ddt.samplecodes.collections

fun main() {
    val numbers = (1..10).toList()

    //Retrieve elements by index
    println(numbers.get(0))
    println(numbers[0])
    println(numbers.getOrNull(10))
    println(numbers.getOrElse(10, { it }))

    //Retrieve list parts
    println()
    println(numbers.subList(3, 6))

    //Find element positions
    //Linear search
    println()
    println(numbers.indexOf(2))
    println(numbers.indexOf(12))

    println(numbers.lastIndexOf(2))
    println(numbers.lastIndexOf(12))

    println(numbers.indexOfFirst { it > 2 })
    println(numbers.indexOfLast { it % 2 == 1 })

    //Binary search in sorted lists
    println()
    val stringNumbers = mutableListOf("one", "two", "three", "four")
    stringNumbers.sort()
    println(stringNumbers)
    println(stringNumbers.binarySearch("two"))
    println(stringNumbers.binarySearch("z"))
    println(stringNumbers.binarySearch("two", 0, 2))

    //Comparator binary search
    println()
    val productList = listOf(
        Product("WebStorm", 49.0),
        Product("AppCode", 99.0),
        Product("DotTrace", 129.0),
        Product("ReSharper", 149.0)
    )

    println(
        productList.binarySearch(
            Product("AppCode", 99.0),
            compareBy<Product> { it.price }.thenBy { it.name })
    )

    val colors = listOf("Blue", "green", "ORANGE", "Red", "yellow")
    println(colors.binarySearch("RED", String.CASE_INSENSITIVE_ORDER))

    //List write operations
    val mutableNumbers = mutableListOf("one", "five", "six")
    mutableNumbers.add(1, "two").also { println(mutableNumbers) }
    mutableNumbers.addAll(2, listOf("three", "four")).also { println(mutableNumbers) }
    mutableNumbers[1] = "two"
    println(mutableNumbers)
    mutableNumbers.fill("ten").also { println(mutableNumbers) }
}

data class Product(val name: String, val price: Double)