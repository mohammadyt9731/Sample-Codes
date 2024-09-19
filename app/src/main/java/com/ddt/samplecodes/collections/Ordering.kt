fun main() {
    orderingBySorting()
    orderingByReversingAndShuffling()
}

// Part 1: Ordering by sorting
fun orderingBySorting() {
    val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }

    // Sorting by custom comparator
    println("Sorted by length using Comparator: " + listOf("aaa", "bb", "c").sortedWith(lengthComparator))

    // Sorting using compareBy
    println("Sorted by length using compareBy: " + listOf("aaa", "bb", "c").sortedWith(compareBy { it.length }))

    val numbers = listOf("one", "two", "three", "four")

    // Default sorting
    println("Sorted ascending: ${numbers.sorted()}")
    println("Sorted descending: ${numbers.sortedDescending()}")

    // Sorting by a specific condition
    println("Sorted by length ascending: ${numbers.sortedBy { it.length }}")
    println("Sorted by the last letter descending: ${numbers.sortedByDescending { it.last() }}")
    println("Sorted by length using sortedWith: ${numbers.sortedWith(compareBy { it.length })}")
}

// Part 2: Ordering by reversing and shuffling
fun orderingByReversingAndShuffling() {
    val numbers = listOf("one", "two", "three", "four")

    // Reversing the list
    println("Reversed: ${numbers.reversed()}")
    println("As reversed: ${numbers.asReversed()}")

    // Mutable list and its reversed view
    val mutableNumbers = mutableListOf("one", "two", "three", "four")
    val reversedNumbers = mutableNumbers.asReversed()
    println("Reversed view before adding element: $reversedNumbers")
    mutableNumbers.add("five")  // Adding an element updates the reversed view
    println("Reversed view after adding element: $reversedNumbers")

    // Shuffling the list
    println("Shuffled: ${numbers.shuffled()}")
}