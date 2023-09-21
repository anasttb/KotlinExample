package nullable_types

private val str1: String? = "null"
private val str2: String? = null
private val str3: String? = ""

fun main() {

    val result = (str1?.length?: 0) + (str2?.length?: 0) + (str3?.length?: 0)

    println(result)
}