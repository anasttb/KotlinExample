package methods

fun main() {
    val cat = Cat("Барсик", 13, 3.5f)

    cat.info()
    println(cat.isOld)

    cat.age = 10

    cat.info()
    println(cat.isOld)

    println()

    val employee = Employee("Ivan", "Dev", 2010)
    val employee1 = Employee("Igor", "Teacher", 2015)

    employee.infoEmp()
    employee.toWork()
    println("------------")
    employee1.infoEmp()
    employee1.toWork()

}

fun Employee.infoEmp() {
    println("Имя работника: $name" +
            "\nДолжность: $spec" +
            "\nГод устройства: $year" +
            "\nРабочий стаж: $stage")
}
