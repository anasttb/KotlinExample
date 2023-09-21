package default_name_parameters

fun main() {
    printInfo(patronymic = "Иванович", lastname = "Иванов")

    println(volume(b = 2, a = 4))
}

private fun printInfo(lastname: String = "", name: String= "", patronymic: String = "") {
    if (lastname.isNotEmpty()) {
        println("Фамилия: $lastname")
    }
    if (name.isNotEmpty()) {
        println("Имя: $name")
    }
    if (patronymic.isNotEmpty()) {
        println("Отчество: $patronymic")
    }
}

private fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c


/**В параметрах метода после знака равно указываются дефолтные значения на случай
 * если он не были переданы в параметры пи вызове метода
 * так же можем воспользоваться именованными параметрами - т.е.
 * явно передать какой параметр чему равен, в любом порядке*/