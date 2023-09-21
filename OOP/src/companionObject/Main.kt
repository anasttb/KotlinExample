package companionObject

import kotlin.math.pow

fun main() {

    println(Calculate.square(4))

    println(Calculate.lengthOfCircle(5f))
    println(String.format("%.1f", Calculate.lengthOfCircle(5f)))

    println()

    println(MyRandom.getRandomNum(1, 20))
    println(MyRandom.getTrueOrFalse())
    println(MyRandom.getDayOfWeek())

}