package function_flatMap

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300),
    )

    info(data)

}

private fun info(map: Map<String, List<Int>>) {
    val validData = map
        .filter { it.value.all { it > 0 } }

    val averageInWeek = validData
        .flatMap { it.value }
        .average()

    val averageInMonth = validData
        .map { it.value.sum() }
        .average()

    val max = validData
        .map { it.value.sum() }
        .max()

    val min = validData
        .map { it.value.sum() }
        .min()

    val maxMonth = validData
        .filter { it.value.sum() == max }
        .keys

    val minMonth = validData
        .filter { it.value.sum() == min }
        .keys

    val errorMonth = map
        .filterNot { it.value.all { it > 0 } }
        .keys

    println("Средняя выручка в неделю: $averageInWeek")
    println("Средняя выручка в месяц: $averageInMonth")
    println("Максимальная выручка в месяц: $max")
    println("Была в следующих месяцах: ${maxMonth.joinToString(", ")}")
    println("Минимальная выручка в месяц: $min")
    println("Была в следующих месяцах: ${minMonth.joinToString(", ")}")
    println("Ошибки произошли в следующих месяцах: ${errorMonth.joinToString(", ")}")

}