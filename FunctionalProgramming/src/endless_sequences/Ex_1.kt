package endless_sequences

fun main() {
    val array = (0..1000).toList()
    val  employees = array.map { "Employee - $it" }

    val first30 = employees.take(30) //берет первый 30 эл массива
    val last30 = employees.takeLast(30) //берет первые 30 эл с конца массива


    val drop30 = employees.drop(30) //выбрасывает первые 30 эл
    val dropLast30 = employees.dropLast(30) //выбрасывает первые 30 эл с конца массива
}
