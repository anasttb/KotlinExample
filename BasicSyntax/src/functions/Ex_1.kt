package functions

fun myMethod(str: String): String = str.substring(0, 5.coerceAtMost(str.length))
//substring(0, 5.coerceAtMost(str.length)) - вернет первые 5 символов строки
//если в строке нет 5ти символов - вернет сколько есть

//метод принимает перечень аргументов типа Int и возвращает их сумму
fun sum(vararg numbers: Int): Int {
    var result = 0
    for (i in numbers) {
        result += i
    }
    return result
}

fun main() {
    println(myMethod("тор"))

    println(sum(1, 4, 6, 4, 3,))
}