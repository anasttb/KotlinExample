package function_with_let

fun main() {
    val list = mutableListOf<Int>()

    //
    with(list) {
        for (i in 0..100) {
            add((0..100).random())
        }
        println(sum())
        println(average())
        println(min())
        println(max())
        println(first())
        println(last())
    }


}