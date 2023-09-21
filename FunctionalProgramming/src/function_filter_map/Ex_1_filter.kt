package function_filter_map

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..100) {
        listOfNumbers.add(i)
    }

    val listOfEvenNumbers = listOfNumbers.filter { num: Int -> num % 2 == 0 }
    // т.к. передаваемый параметр один можно записать так: { it % 2 == 0 }

    val listName = listOf("Алексей", "Иван", "Юрий", "Андрей", "Николай")

    val newListName = listName.filter { it.startsWith("А") }
    newListName.forEach { println(it) }

}


