fun main() {
    addElements()
//    removeSingleElements()
//    removeMultipleElements()
}

fun addElements() {
    val numbers = mutableListOf(1, 2, 3, 4)

    // Add single elements
    numbers.add(5).also { println("Added 5 to the list: $numbers") }
    numbers.add(3, 11).also { println("Inserted 11 at index 3: $numbers") }

    // Add multiple elements
    numbers.addAll(arrayOf(7, 8)).also { println("Added elements 7 and 8: $numbers") }
    numbers.addAll(2, setOf(-1, 3)).also { println("Inserted elements -1 and 3 at index 2: $numbers") }

    // Using += to add elements
    val stringNumbers = mutableListOf("one", "two")
    stringNumbers += "three"
    println("Added 'three' to stringNumbers using +=: $stringNumbers")
    stringNumbers += listOf("four", "five")
    println("Added 'four' and 'five' to stringNumbers using +=: $stringNumbers")
}

fun removeSingleElements() {
    val stringNumbers = mutableListOf("one", "two", "three", "four", "five")

    // Remove single elements using -=
    stringNumbers -= "three"
    println("Removed 'three' using -= : $stringNumbers")

    // Remove element by index and value
    stringNumbers.remove("four").also { println("Removed 'four' by value: $stringNumbers") }
    stringNumbers.removeAt(1).also { println("Removed element at index 1: $stringNumbers") }

    // Remove first and last elements
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.removeFirst().also { println("Removed the first element: $numbers") }
    numbers.removeFirstOrNull().also { println("Removed the first element (or null if empty): $numbers") }
    numbers.removeLast().also { println("Removed the last element: $numbers") }
    numbers.removeLastOrNull().also { println("Removed the last element (or null if empty): $numbers") }
}

fun removeMultipleElements() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Remove all elements that match a condition
    numbers.removeIf { it < 5 }.also { println("Removed elements less than 5: $numbers") }

    // Remove specific ranges or sets
    numbers.removeAll(5..7).also { println("Removed elements in range 5 to 7: $numbers") }

    // Retain only certain elements
    numbers.retainAll { it > 7 }.also { println("Retained only elements greater than 7: $numbers") }

    // Clear all elements
    numbers.clear().also { println("Cleared all elements: $numbers") }
}

