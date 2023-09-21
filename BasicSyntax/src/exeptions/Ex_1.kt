package exeptions

fun main() {
    println(sum("10", "gdgfdg"))
}

private fun sum(a: String, b: String): Int {
    return try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    }
    catch (ex: Exception) {
        0
    }
}