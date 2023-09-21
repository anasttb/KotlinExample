package equals_hashCode

fun main() {

    val ad1 = Address("Москва", "Садовая", 25)
    val ad2 = Address("Москва", "Садовая", 25)

    if (ad1 == ad2) {
        println("Равны")
    }
    else {
        println("НЕ равны")
    }

    println(ad1.hashCode())
    println(ad2.hashCode())

}