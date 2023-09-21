package operator_when

fun main() {
    val temp = readlnOrNull()?.toInt()
    val state = when {
        (temp?: 0) < 0 -> "Твердое"
        (temp?: 0) in 0..100 -> "Жидкое"
        else -> "Газообразное"
    }
    println(state)
}