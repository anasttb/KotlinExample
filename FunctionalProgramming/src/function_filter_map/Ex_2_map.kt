package function_filter_map

fun main() {
    val numbers = (0..100).toList()
    val  doubledNumbers = numbers.map { it * 2 }
//    doubledNumbers.forEach { println(it) }

    val employees = numbers.map { "Employee №$it" }
//    employees.forEach { println(it) }

}