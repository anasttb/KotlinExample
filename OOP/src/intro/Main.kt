package intro

fun main() {

    val user = User()

    //идет обращения к гетерам и сеттерам класса User
    //нет нарушения Инкапсуляции
    user.names = null
    user.age = -3

    println("Имя: ${user.names} => Возраст: ${user.age}")

    val dog = Dog()

    dog.age = -5
    dog.weight = -4
    dog.nik = "sHaRiK"

    println("${dog.age}, ${dog.weight}, ${dog.nik}")

}