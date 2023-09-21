package extension_fun

fun main() {
    val a = 5

    println(a.isSimple())

}


//создали функцию, и расширяли ее класс Int
private fun Int.isSimple(): Boolean {
    if (this < 1) {
        return false
    }
    if (this in 1..3) {
        return true
    }
    for (i in 2..< this) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}