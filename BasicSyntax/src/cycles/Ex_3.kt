package cycles

fun main() {
    val list = arrayOfNulls<Int>(301)
    for ((index, i) in (300..600).withIndex()) {
        list[index] = i
    }
    println(list.contentToString())
    println()

    for (i in list.size - 1 downTo 0 step 5) {
        print("${list[i]} ")
    }
}