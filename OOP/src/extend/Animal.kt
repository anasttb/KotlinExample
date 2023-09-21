package extend

open class Animal(val name: String, var weight: Float, val habitat: String) {

    open fun eat() {
        println("Кушаю еду")
    }

    open fun run() {
        println("Бегу")
    }

    override fun toString(): String {
        return "Animal(name='$name', weight=$weight, habitat='$habitat')"
    }

}