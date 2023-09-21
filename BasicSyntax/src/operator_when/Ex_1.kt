package operator_when

fun main() {
    val month = "October"
    val season= when(month) {
        "December", "January", "February" -> {
            "Winter"
        }
        "March", "April ", "May" -> {
            "Spring"
        }
        "June", "July", "August" -> {
            "Summer"
        }
        "September", "October", "November" -> {
            "Autumn"
        }
        else -> {
            "Not Found"
        }
    }
    println(season)
}