package function_flatMap

fun main() {
    val revenueByWeek = listOf(
        listOf(4, 5, 7, 3, 5),
        listOf(5, 3, 2, 8, 5),
        listOf(4, 9, 3, 7, 5),
        listOf(1, 6, 3, 6, 5)
    )

    val total = mutableListOf<Int>()
    revenueByWeek.map {
        for (i in it) {
            total.add(i)
        }
    }
    val average = total.average()

    //другой способ как это сделать

    val total2= revenueByWeek.flatMap { it }
    val average2 = total2.average()


}