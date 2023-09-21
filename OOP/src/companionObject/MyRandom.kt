package companionObject

class MyRandom {

    companion object {

        private const val MONDAY = "Понедельник"
        private const val TUESDAY = "Вторник"
        private const val WEDNESDAY = "Среда"
        private const val THURSDAY = "Четверг"
        private const val FRIDAY = "Пятница"
        private const val SATURDAY = "Суббота"
        private const val SUNDAY = "Воскресенье"

        fun getRandomNum(from: Int, to: Int): Int = (from..to).random()

        fun getTrueOrFalse(): Boolean = getRandomNum(0, 1) > 1

        fun getDayOfWeek(): String {
            return when (getRandomNum(1, 7)) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                else -> SUNDAY
            }
        }

    }

}