package com.ddt.samplecodes.collections

fun main() {
    val numbers = listOf(6, 42, 10, 4)

    println("Count: ${numbers.count()}")
    println("Average: ${numbers.average()}")


    println("Max: ${numbers.max()}")
    println("MaxOrNull: ${numbers.maxOrNull()}")
    println("MaxBy: ${numbers.maxBy { it < 10 }}")
    println("MaxByOrNull: ${numbers.maxByOrNull { it < 10 }}")
    println("MaxWith: ${numbers.maxWith { first: Int, second: Int -> first - second }}")
    println("MaxWithOrNull: ${numbers.maxWithOrNull { first: Int, second: Int -> first - second }}")
    println("MaxOf: ${numbers.maxOf { it < 10 }}")
    println("MaxOfOrNull: ${numbers.maxOfOrNull { it < 10 }}")
    println("MaxOfWith: ${numbers.maxOfWith(compareBy { it < 10 }) { it * 2 }}")
    println("MaxOfWithOrNull: ${numbers.maxOfWithOrNull(compareBy { it < 10 }) { it * 2 }}")

    println("Min: ${numbers.min()}")
    println("MinOrNull: ${numbers.minOrNull()}")
    println("MinBy: ${numbers.minBy { it < 10 }}")
    println("MinByOrNull: ${numbers.minByOrNull { it < 10 }}")
    println("MinWith: ${numbers.minWith { first: Int, second: Int -> first - second }}")
    println("MinWithOrNull: ${numbers.minWithOrNull { first: Int, second: Int -> first - second }}")
    println("MinOf: ${numbers.minOf { it < 10 }}")
    println("MinOfOrNull: ${numbers.minOfOrNull { it < 10 }}")
    println("MinOfWith: ${numbers.minOfWith(compareBy { it < 10 }) { it * 2 }}")
    println("MinOfWithOrNull: ${numbers.minOfWithOrNull(compareBy { it < 10 }) { it * 2 }}")

    println()
    println(numbers.sum())
    println(numbers.sumOf { it * 2 })

    println()
    println(numbers.reduce { sum, element -> sum + element })
    println(numbers.reduceOrNull() { sum, element -> sum + element })
    println(numbers.reduceIndexed { idx, sum, element -> if (idx % 2 == 0) sum + element else sum })
    println(numbers.reduceIndexedOrNull() { idx, sum, element -> if (idx % 2 == 0) sum + element else sum })

    println()
    println(numbers.reduceRight { element, sum -> sum + element * 2 })
    println(numbers.reduceRightOrNull { element, sum -> sum + element * 2 })
    println(numbers.reduceRightIndexed { idx, sum, element -> if (idx % 2 == 0) sum + element else sum })
    println(numbers.reduceRightIndexedOrNull { idx, sum, element -> if (idx % 2 == 0) sum + element else sum })

    println()
    println(numbers.fold(0) { sum, element -> sum + element * 2 })
    println(numbers.foldIndexed(0) { idx, sum, element -> if (idx % 2 == 0) sum + element else sum })

    println()
    println(numbers.foldRight(0) { sum, element -> sum + element * 2 })
    println(numbers.foldRightIndexed(0) { idx, sum, element -> if (idx % 2 == 0) sum + element else sum })

    println()
    println(numbers.runningReduce { sum, item -> sum + item })
    println(numbers.runningReduceIndexed() { index, sum, item -> sum + item * index })
    println(numbers.runningFold(10) { sum, item -> sum + item })
    println(numbers.scan(10) { sum, item -> sum + item })
    println(numbers.runningFoldIndexed(10) { index, sum, item -> sum + item * index })
    println(numbers.scanIndexed(10) { index, sum, item -> sum + item * index })
}