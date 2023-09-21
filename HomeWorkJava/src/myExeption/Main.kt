package myExeption

fun main() {
    func()
}

fun func() {
    try {
        throw MyException("djgkdghd")
    }
    catch (ex: MyException) {
        println("Это мое исключение")
    }

}