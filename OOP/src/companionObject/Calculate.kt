package companionObject

/**
 * companionObject - альтернатива static
 * это объект, который относится к классу, в котором он был объявлен
 * все члены companionObject не могут обращаться к полям класса
 *
 * val и const val
 * различия:
 * - val по дефолту private
 * - у const val нет геттера
 */

class Calculate {

    companion object {

        const val PI = 3.14

        fun square(num: Int) = num * num

        fun lengthOfCircle(radius: Float) = 2 * 3.14 * radius

    }


}