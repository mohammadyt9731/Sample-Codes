fun main() {
    addElements()
//    removeSingleElements()
//    removeMultipleElements()
}

fun addElements() {
    val numbers = mutableListOf(1, 2, 3, 4)

    // Add single elements
    numbers.add(5).also { println(numbers) }
    numbers.add(3, 11).also { println(numbers) }

    // Add multiple elements
    numbers.addAll(arrayOf(7, 8)).also { println(numbers) }
    numbers.addAll(2, setOf(-1, 3)).also { println(numbers) }

    // Using += to add elements
    val stringNumbers = mutableListOf("one", "two")
    stringNumbers += "three"
    println(stringNumbers)
    stringNumbers += listOf("four", "five")
    println(stringNumbers)
}

fun removeSingleElements() {
    val stringNumbers = mutableListOf("one", "two", "three", "four", "five")

    // Remove single elements using -=
    stringNumbers -= "three"
    println(stringNumbers)

    // Remove element by index and value
    stringNumbers.remove("four").also { println(stringNumbers) }
    stringNumbers.removeAt(1).also { println(stringNumbers) }

    // Remove first and last elements
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.removeFirst().also { println(numbers) }
    numbers.removeFirstOrNull().also { println(numbers) }
    numbers.removeLast().also { println(numbers) }
    numbers.removeLastOrNull().also { println(numbers) }
}

fun removeMultipleElements() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Remove all elements that match a condition
    numbers.removeIf { it < 5 }.also { println(numbers) }

    // Remove specific ranges or sets
    numbers.removeAll(5..7).also { println(numbers) }

    // Retain only certain elements
    numbers.retainAll { it > 7 }.also { println(numbers) }

    // Clear all elements
    numbers.clear().also { println(numbers) }
}
