fun main() {
    sliceSampleCodes()
//    takeAndDropSampleCodes()
//    chunkedSampleCodes()
//    windowedSampleCodes()
}

fun sliceSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")

    // Extract a slice from index 1 to 3
    println("Slice from index 1 to 3: " + numbers.slice(1..3))

    // Extract a slice from index 0 to 4
    println("Slice from index 0 to 4: " + numbers.slice(0..4))

    // Extract every second element from index 0 to 4
    println("Slice from index 0 to 4 with step 2: " + numbers.slice(0..4 step 2))

    // Extract a slice from index 0 to just before 2
    println("Slice from index 0 until 2: " + numbers.slice(0..<2))

    // Extract elements at specific indices using a list
    println("Slice using a list of indices: " + numbers.slice(listOf(1, 4)))

    // Extract elements at specific indices using a set
    println("Slice using a set of indices: " + numbers.slice(setOf(3, 5, 0)))
}

fun takeAndDropSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")

    // Take the first 3 elements
    println("Take first 3 elements: " + numbers.take(3))

    // Take the last 3 elements
    println("Take last 3 elements: " + numbers.takeLast(3))

    // Take elements while the condition is true
    println("Take while elements don't start with 'f': " + numbers.takeWhile { !it.startsWith('f') })

    // Take last elements while the condition is true
    println("Take last while the element is not 'three': " + numbers.takeLastWhile { it != "three" })

    // Drop the first element
    println("Drop first element: " + numbers.drop(1))

    // Drop the last 5 elements
    println("Drop last 5 elements: " + numbers.dropLast(5))

    // Drop elements while the condition is true
    println("Drop while the element's length is 3: " + numbers.dropWhile { it.length == 3 })

    // Drop last elements while the condition is true
    println("Drop last while the element contains 'i': " + numbers.dropLastWhile { it.contains('i') })
}

fun chunkedSampleCodes() {
    val numbers = (0..13).toList()

    // Split the list into chunks of 3 elements
    println("Chunked into lists of 3: " + numbers.chunked(3))

    // Split into chunks and apply a transformation to each chunk
    println("Chunked into lists of 3 with sum transformation: " + numbers.chunked(3) { it.sum() })
}

fun windowedSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five")

    // Create sliding windows of size 3
    println("Windowed size 3: " + numbers.windowed(3))

    // Create sliding windows of size 3 with a step of 2
    println("Windowed size 3 with step 2: " + numbers.windowed(3, step = 2))

    // Create sliding windows allowing partial windows
    println(
        "Windowed size 3 with step 2 and partial windows: " + numbers.windowed(
            3,
            step = 2,
            partialWindows = true
        )
    )

    // Create sliding windows and join each window to a string
    println("Windowed size 3 with string transformation: " + numbers.windowed(3) { it.joinToString() })
}
