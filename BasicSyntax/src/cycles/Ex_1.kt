package cycles

import java.util.Random

fun main() {
    val array = arrayOf(1, 5, 4, 7, 8, 23,)
    for (i in array) {
        println(i)
    }
    println("============================================")

    val array1 = arrayOfNulls<Int>(101)
    for (i in array1.indices) {
        array1[i] = (Math.random() * 100).toInt()
    }
    println(array1.joinToString(", "))
    println("============================================")

    for (i in 100 downTo 0 step 2) {
        print("$i ")
    }


}