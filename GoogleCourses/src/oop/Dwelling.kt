package oop

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    val squareCabin = SquareCabin(6, 50.0)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }

    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: %.2f".format(floorArea()))
        println(roundHut.residents)
        println("Has room? ${hasRoom()}")
        getRoom()
        println(roundHut.residents)
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Carpet Length: %.2f".format(calculateMaxCarpetLength()))
    }

    val roundTower = RoundTower(4, 15.5)
    with(roundTower) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: %.2f".format(floorArea()))
        println("Carpet Length: %.2f".format(calculateMaxCarpetLength()))
    }


}

abstract class Dwelling(var residents: Int) {

    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean = residents < capacity

    abstract fun floorArea(): Double

    fun getRoom() {
        if (hasRoom()) {
            residents++
            println("You get a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }

}

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {

    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6

    override fun floorArea(): Double {
        return length * length
    }
}

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial: String
        get() = "Straw"
    override val capacity: Int
        get() = 4

    override fun floorArea(): Double {
        return PI * radius.pow(2)
    }

    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }
}

class RoundTower(residents: Int, radius: Double, private val floors: Int = 2) : RoundHut(residents, radius) {
    override val buildingMaterial: String
        get() = "Stone"
    override val capacity: Int
        get() = 4 * floors

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}