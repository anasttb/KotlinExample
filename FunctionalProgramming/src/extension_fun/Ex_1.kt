package extension_fun

fun main() {
    val age = 5

    if(age.isValidAge()) {
        println("Valid")
    }
    if(age.isValidAge()) {
        println("Valid too")
    }
    if (age.isValidAge()) {
        println("Valid Too too")
    }

    println(age.isPositive())

    println()

}

private fun isAgeValid(age: Int) = age in 14..90

//расширяем класс Int новым методом который создали сами
//this - обращение к переменной класса для которой создали метод

private fun Int.isValidAge() = this in 12..50

private fun Int.isPositive(): Int {
    return if (this > 0) {
        1
    } else if (this < 0) {
        -1
    } else {
        0
    }
}



