import java.util.InputMismatchException
import java.util.Scanner

fun main() {
    integerDivision()
}

fun integerDivision() {
    val array = mutableListOf<Int>()

    val random = (1..9).random()

    for (i in 0..random) {
        array.add((-10..10).random())
    }

    println("Массив чисел - делителей: ")
    array.forEach { print("$it  ") }
    println()

    var input: Int

    while (true) {
        try {
            println("Введите делимое: ")
            input = Scanner(System.`in`).nextInt()
            break
        }
        catch (ex: InputMismatchException) {
            println("Ошибка ввода!!!")
        }
    }

    println("Результат целочисленного деления числа $input на элементы массива: ")
    for (i in array) {
        try {
            println(input / i)
        }
        catch (ex: ArithmeticException) {
            println("На ноль делить нельзя")
        }
    }

}

