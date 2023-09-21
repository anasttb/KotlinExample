package function_zip

fun main() {
    val user = mutableListOf<String>()
    for (i in 0..100) {
        user.add("Фамилия$i Имя$i")
    }

    val lastName = user.map { it.substringBefore(" ") }
    val name = user.map { it.substringAfter(" ") }

    val res = lastName.zip(name)
//    res.forEach { println(it.first + " " + it.second) }

    //еще вариант как это сделать
    val result = user.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }
}