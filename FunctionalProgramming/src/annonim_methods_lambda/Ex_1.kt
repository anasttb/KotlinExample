package annonim_methods_lambda

fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b}
    println(sum(2, 10))

    val square: (Int) -> Int = {a -> a * a}

    //модифицируем метод
    //возможно только если параметр функции всего один
    val square1: (Int) -> Int = {it * it}

    println(square(4))
    println(square1(4))

    val perimeter: (Int, Int) -> Int = { a, b -> (a * 2) + (b * 2) }

    val hello: (String) -> Unit = { it -> println("Привет $it!") }

    val sortDown: (Array<Int>) -> Array<Int> = { it ->
        it.sortDescending()
        it
    }

    val array = sortDown(arrayOf(1, 5, -4, 3, 8, 1, 0))
    println(array.contentToString())
}

