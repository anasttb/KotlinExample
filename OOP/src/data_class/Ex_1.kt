package data_class

fun main() {
    val add1 = Address("Москва", "Старый Арбат", 124)
    val add2 = add1.copy()

    println(add1)
    println(add2)
    println(add1.hashCode())
    println(add2.hashCode())
    println(add1 == add2)
    println(add1 === add2)

    val (town, _, num) = add1

    println(town)
    println(num)

}