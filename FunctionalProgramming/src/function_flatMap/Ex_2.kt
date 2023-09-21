package function_flatMap

fun main() {
    val data = mapOf(
        "file1" to listOf(12, 45, 32, 34, 54),
        "file2" to listOf(23, -32, 12, 34, 24),
        "file3" to listOf(98, 12, 33, 32, 44),
    )

    val average = data
        .filter { it.value.all { it >= 0 } }
        .flatMap { it.value }
        .average()
    println(average)

    val average2 = data
        .filterNot { it.value.any { it < 0 } }
        .flatMap { it.value }
        .average()
    println(average)

}