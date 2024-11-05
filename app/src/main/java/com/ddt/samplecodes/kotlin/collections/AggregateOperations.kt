fun main() {
    aggregateBasicOperations()
//    aggregateMinMaxOperations()
//    reduceAndFoldOperations()
//    runningReduceAndFoldOperations()
}

fun aggregateBasicOperations() {
    val numbers = listOf(6, 42, 10, 4)

    // Count: Number of elements
    println("Count: ${numbers.count()}")

    // Average: Mean of elements
    println("Average: ${numbers.average()}")

    // Sum of elements
    println("Sum: ${numbers.sum()}")

    // Sum using a custom operation
    println("Sum of doubled elements: ${numbers.sumOf { it * 2 }}")
}

fun aggregateMinMaxOperations() {
    val numbers = listOf(6, 42, 10, 4)

    // Max and related operations
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

    // Min and related operations
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
}

fun reduceAndFoldOperations() {
    val numbers = listOf(6, 42, 10, 4)

    // Reduce and reduceIndexed
    println("Reduced sum: ${numbers.reduce { sum, element -> sum + element }}")
    println("Reduced with index: ${numbers.reduceIndexed { idx, sum, element -> if (idx % 2 == 0) sum + element else sum }}")

    // ReduceRight and reduceRightIndexed
    println("Reduced right: ${numbers.reduceRight { element, sum -> sum + element * 2 }}")
    println("Reduced right with index: ${numbers.reduceRightIndexed { idx, sum, element -> if (idx % 2 == 0) sum + element else sum }}")

    // Fold and foldIndexed
    println("Folded sum (starting from 0): ${numbers.fold(0) { sum, element -> sum + element * 2 }}")
    println("Folded with index: ${numbers.foldIndexed(0) { idx, sum, element -> if (idx % 2 == 0) sum + element else sum }}")

    // FoldRight and foldRightIndexed
    println("Folded right sum: ${numbers.foldRight(0) { element, sum -> sum + element * 2 }}")
    println("Folded right with index: ${numbers.foldRightIndexed(0) { idx, sum, element -> if (idx % 2 == 0) sum + element else sum }}")
}

fun runningReduceAndFoldOperations() {
    val numbers = listOf(6, 42, 10, 4)

    // Running reduce and reduceIndexed
    println("Running reduce: ${numbers.runningReduce { sum, item -> sum + item }}")
    println("Running reduce with index: ${numbers.runningReduceIndexed { index, sum, item -> sum + item * index }}")

    // Running fold and scan
    println("Running fold (start from 10): ${numbers.runningFold(10) { sum, item -> sum + item }}")
    println("Scan (start from 10): ${numbers.scan(10) { sum, item -> sum + item }}")

    // Running foldIndexed and scanIndexed
    println("Running fold with index: ${numbers.runningFoldIndexed(10) { index, sum, item -> sum + item * index }}")
    println("Scan with index: ${numbers.scanIndexed(10) { index, sum, item -> sum + item * index }}")
}
