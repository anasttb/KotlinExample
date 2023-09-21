package extend

class Dog(weight: Float) : Animal("Собака", weight, "Суша") {

    override fun eat() {
        println("Грызу кость")
    }

}