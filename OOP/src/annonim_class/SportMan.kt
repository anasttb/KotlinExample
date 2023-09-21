package annonim_class

class SportMan {

    fun callWaterBoy(waterboy: Waterboy) {
        waterboy.bringWater()
    }

    inline fun callWaterBoy(bringWater: () -> Unit ) {
        bringWater()
    }

}

fun main() {

    val sportMan = SportMan()

    sportMan.callWaterBoy(object : Waterboy {
        override fun bringWater() {
            println("Несу воду")
        }
    })

    sportMan.callWaterBoy { println("Принести воды!") }

}