package endless_sequences

fun main() {
    val array = generateSequence(0) { it + 2 }
    val evenList = array.take(50)
//    evenList.forEach { println(it) }



    val mass = generateSequence {
        (0..100).random()
    }
//    mass.take(10).forEach { println(it) }



    val emp = generateSequence("Сотрудник №1") {
        val num = it.substring(11).toInt()
        "Сотрудник №${num + 1}"
    }
    emp.take(10).forEach { println(it) }

}

/**Ленивая инициализация - инициализация элемента только в тот момент когда он используется где-то в коде */