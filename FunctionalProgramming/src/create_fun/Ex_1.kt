package create_fun

import java.util.*

fun main() {
    val result = modifyString("Hello World") { it.uppercase() }
    println(result)



    val list = mutableListOf<Int>()
    for (i in (0..10)) {
        list.add((0..100).random())
    }
    var res: Int = 0
    modifyList(list) {
        for (i in it) {
            res += i
        }
    }
    println(res)

    //или так
    modifyList(list) { println(it.sum()) }


}

private inline fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

private inline fun modifyList(list: List<Int>, mod: (List<Int>) -> Unit) {
    return mod(list)
}