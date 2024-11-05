fun main() {
    retrieveByPositionSampleCodes()
//    retrieveByConditionSampleCodes()
//    retrieveWithSelectorSampleCodes()
//    randomElementSampleCodes()
//    checkElementExistenceSampleCodes()
}

fun retrieveByPositionSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five")

    // Retrieve element at index 3
    println("Element at index 3: " + numbers[3])

    // Using get method to retrieve the element at index 3
    println("Element at index 3 using get: " + numbers.get(3))

    // Retrieve element safely, returns null if index is out of bounds
    println("Element at index 10 or null: " + numbers.elementAtOrNull(10))

    // Provide a default value if the index is out of bounds
    println("Element at index 10 or else: " + numbers.elementAtOrElse(10) { "Unknown" })
}

fun retrieveByConditionSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five")

    // Retrieve the first element that satisfies a condition
    println("First element: " + numbers.first { it.length > 3 })

    // Return null if no element satisfies the condition
    println("First element or null: " + numbers.firstOrNull { it.length > 6 })

    // Retrieve the last element that satisfies a condition
    println("Last element starting with 'f': " + numbers.last { it.startsWith("f") })

    // Return null if no element satisfies the condition
    println("Last element or null with length > 6: " + numbers.lastOrNull { it.length > 6 })

    // Retrieve the first element with length 3, return the value itself
    println("First element matching condition: " + numbers.firstNotNullOf { it.length == 3 })

    // Return null if no element satisfies the condition in firstNotNullOf
    println("First element matching condition or null: " + numbers.firstNotNullOfOrNull { it.length == 3 })
}

fun retrieveWithSelectorSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five")

    // Retrieve the first element
    println("First element: " + numbers.first())

    // Return null if the list is empty
    println("First element or null: " + numbers.firstOrNull())

    // Retrieve the last element
    println("Last element: " + numbers.last())

    // Return null if the list is empty
    println("Last element or null: " + numbers.lastOrNull())
}

fun randomElementSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five")

    // Retrieve a random element from the list
    println("Random element: " + numbers.random())

    // Return null if the list is empty and random cannot retrieve any element
    println("Random element or null: " + numbers.randomOrNull())
}

fun checkElementExistenceSampleCodes() {
    val numbers = listOf("one", "two", "three", "four", "five")

    // Check if the list contains "four"
    println("List contains 'four': " + numbers.contains("four"))

    // Check if "zero" is in the list
    println("'zero' in list: " + ("zero" in numbers))

    // Check if "zero" is not in the list
    println("'zero' not in list: " + ("zero" !in numbers))

    // Check if the list contains multiple elements
    println("List contains 'four' and 'two': " + numbers.containsAll(listOf("four", "two")))

    // Check if the list contains both "one" and "zero"
    println("List contains 'one' and 'zero': " + numbers.containsAll(listOf("one", "zero")))

    // Check if the list is empty
    println("List is empty: " + numbers.isEmpty())

    // Check if the list is not empty
    println("List is not empty: " + numbers.isNotEmpty())
}
