package generic

class Dog {

    //для того что бы не инициализировать переменную при создании добавляется
    // ключевое слово lateinit
    // но если переменная так и не будет инициализирована то получим UninitializedPropertyAccessException

    private lateinit var nameDog: String

    fun printName() {
        println(nameDog)
        println(nameDog.length)
    }
}

fun main() {
    Dog().printName()
}