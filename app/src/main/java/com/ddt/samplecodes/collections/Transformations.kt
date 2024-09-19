fun main() {
//    mapSampleCodes()
     zipSampleCodes()
    // associateSampleCodes()
    // flattenSampleCodes()
    // stringRepresentationSampleCodes()
}

fun mapSampleCodes() {
    val numbers = listOf(1, 2, 3, 4, null, 5)
    val mutableList = mutableListOf<String>()

    // Mapping with potential null values, doubles each number
    println("map: " + numbers.map { it?.times(2) })

    // Mapping without null values
    println("mapNotNull: " + numbers.mapNotNull { it?.times(2) })

    // Mapping to mutable list
    numbers.mapTo(mutableList) { "${it?.times(2)}" }
    println("mapTo: $mutableList")

    // Mapping with index
    println("mapIndexed: " + numbers.mapIndexed { index, i -> "\"$index:$i\"" })

    // Mapping with index without null values
    println("mapIndexedNotNull: " + numbers.mapIndexedNotNull { index, i ->  "\"$index:$i\"" })

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)

    // Mapping keys to uppercase
    println("mapKeys: " + numbersMap.mapKeys { it.key.uppercase() })

    // Mapping values by adding key length
    println("mapValues: " + numbersMap.mapValues { it.value + it.key.length })
}

fun zipSampleCodes() {
    val colors = listOf("red", "brown", "gray")
    val animals = listOf("fox", "bear", "wolf")

    // Zipping two lists
    println("zip: " + (colors zip animals))

    // Zipping with a transformation
    println("zip with transformation: " + colors.zip(animals) { color, animal ->
        "The ${animal.replaceFirstChar { it.uppercase() }} is $color"
    })

    // Zipping elements with next one
    println("zipWithNext: " + colors.zipWithNext())

    val twoAnimals = listOf("fox", "bear")

    // Zipping two lists of different sizes
    println("zip with different sizes: " + colors.zip(twoAnimals))

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

    // Unzipping a list of pairs
    println("unzip: " + numberPairs.unzip())
}

fun associateSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")

    // Associating elements with their lengths
    println("associate: " + numbers.associate { it to it.length })

    // Associating elements with values
    println("associateWith: " + numbers.associateWith { it.length })

    // Associating by key selector
    println("associateBy: " + numbers.associateBy { it.length })

    // Associating by key selector and value transform
    println("associateBy with transformation: " + numbers.associateBy(
        keySelector = { it.first().uppercase() },
        valueTransform = { it.length }
    ))

    val newMap = mutableMapOf<String, Int>()

    // Associating to a mutable map
    numbers.associateTo(newMap) { it to it.length }
    println("associateTo: $newMap")
}

fun flattenSampleCodes() {
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))

    // Flattening a list of sets
    println("flatten: " + numberSets.flatten())

    val numbers = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(1, 2))

    // Flat mapping with a transformation
    println("flatMap: " + numbers.flatMap { it.map { it * 2 } })

    // Flat mapping with an index transformation
    println("flatMapIndexed: " + numbers.flatMapIndexed { index: Int, ints: List<Int> ->
        ints.map { it * index }
    })
}

fun stringRepresentationSampleCodes() {
    val numbers = listOf("one", "two", "three", "four")

    // Simple list print
    println("List: $numbers")

    // Joining to a string
    println("joinToString: " + numbers.joinToString())

    // Joining to a StringBuffer
    val listString = StringBuffer("The list of numbers: ")
    numbers.joinTo(listString)
    println("joinTo with StringBuffer: $listString")

    // Custom joining
    println("joinToString with custom separator: " + numbers.joinToString { "$it :" })
    println(
        "joinToString with prefix and postfix: " + numbers.joinToString(
            separator = " | ",
            prefix = "start: ",
            postfix = ": end"
        )
    )

    val numbers2 = (1..100).toList()

    // Joining with limit and truncation
    println(
        "joinToString with limit and truncated: " + numbers2.joinToString(
            limit = 10,
            truncated = "<...>"
        )
    )

    // Joining with transformation
    println("joinToString with transformation: " + numbers.joinToString { "Element: ${it.uppercase()}" })
}
