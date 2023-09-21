package operator_if

fun main() {
    var money = 220
    val food = if (money > 500) {
        money -= 500
        println("У вас осталось: $money рублей")
        "Пицца"
    } else if (money > 200) {
        money -= 200
        println("У вас осталось: $money рублей")
        "Шаурма"
    } else {
        money -= 30
        println("У вас осталось: $money рублей")
        "Доширак"
    }
    println("Вы можете купить $food")
}