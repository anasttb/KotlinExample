package extend

fun main() {
    val dog = Dog(12.5f)
    println(dog)

    val worker = listOf(
        Worker("Василий", 23),
        Developer("Иван", 23, "Java"),
        Worker("Игорь", 45),
        Worker("Андрей", 34),
        Worker("Анатолий", 55),
        Developer("Юрий", 37, "Kotlin")
    )

    worker.forEach { it.work() }
}