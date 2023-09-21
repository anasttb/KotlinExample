package operator_when

fun main() {
    val time = 13
    val weather = true
    val string = when {
        time in 11..16 && weather -> "Гулять"
        time in 11..16 && !weather -> "Читать книгу"
        else -> "Спать"
    }
    println(string)
}