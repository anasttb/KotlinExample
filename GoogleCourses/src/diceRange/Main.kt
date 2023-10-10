package diceRange

fun main() {
    val myFirstDice = Dice()
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(12)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

class Dice(val numSides: Int = 6) {
    fun roll(): Int {
        val range = 1..numSides
        return range.random()
    }
}
