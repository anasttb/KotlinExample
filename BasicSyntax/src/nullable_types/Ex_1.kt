package nullable_types

private var name: String? = null

fun main() {
//    println(name!!.length) // не безопасный метод
    println(name?.length)

    val length = name?.length?: 0 // получим либо длину строки, либо (если строка null) получим 0

}