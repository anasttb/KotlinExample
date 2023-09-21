package collections

fun main() {

    val array = arrayOf(1, 2, 5, 10, 34, 78)
    println(array[5])
    array[4] = 10
    println(array[4])

    val array2 = arrayOfNulls<Int>(10)
    println(array2.contentToString())
    array2[3] = 67
    println(array2.contentToString())

}