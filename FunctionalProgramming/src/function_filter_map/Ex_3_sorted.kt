package function_filter_map

fun main() {
    val array = arrayOf(8, 4, -5, 19, 0, 23, -54)

    val sortedArray = array.sortedArray()
    println(sortedArray.contentToString())
    val sortDes = array.sortedArray().reversedArray()
    println(sortDes.contentToString())


    val randomCollection = mutableListOf<Int>()
    for (i in 0..99) {
        randomCollection.add((0..100).random())
    }

    val newList = randomCollection
        .filter { (it % 5 == 0) or (it % 3 == 0) }
        .map { it * it }
        .sortedDescending()
        .map { "Элемент - $it" }

    newList.forEach { println(it) }
}