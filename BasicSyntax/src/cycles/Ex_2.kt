package cycles

fun main() {
    val array = arrayOfNulls<Int>(101)
    for (i in array.indices) {
        array[i] = (Math.random() * 100).toInt()
    }
    println(array.contentToString())

    //получаем доступ не только к самой переменной, но и к индексу этой переменной
    for ((index, i) in array.withIndex()) {
        array[index] = i?.times(2)
    }
    println(array.contentToString())

}