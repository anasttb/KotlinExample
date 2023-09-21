package function_with_let

var numbers: MutableList<Int>? = mutableListOf()

fun main() {

    numbers?.let {

        with(it) {

            for (i in 0..1000) {
                add((0..100).random())
            }

            filter { it % 2 == 0 }
                .take(10)
                .forEach { println(it) }

        }

    }

}