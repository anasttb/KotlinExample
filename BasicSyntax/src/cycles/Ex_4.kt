package cycles

import java.util.*

fun main() {

    val list :MutableList<Int> = LinkedList()
    for (i in (300..600)) {
        list.add(i)
    }

    for (i in list.reversed()) {
        if (i % 5 == 0) {
            print("$i ")
        }
    }
}