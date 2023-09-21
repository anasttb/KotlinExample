package function_zip

fun main() {
    val name = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..100) {
        name.add("Имя$i")
        phones.add(79_000_000_000 + (1..1_000_000_000).random())
    }

    val users = name.zip(phones)
    for (i in users) {
        println(i.first + " - " + i.second)
    }
}