package enum_class

import enum_class.Months.*
import enum_class.Season.*

fun main() {
    val month = DECEMBER

    val season = when(month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }

    //т.к. используем ENUM блок else не нужен

    println(month.description)
    println(season.description)

}