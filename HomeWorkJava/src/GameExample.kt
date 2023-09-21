fun main() {
    val options = arrayOf("камень", "ножницы", "бумага")
    var player = ""
    var computer = ""
    var result = ""

    while (true) {
        // Запрос у пользователя его выбора
        println("Выберите ваш вариант: камень, ножницы или бумага?")
        player = readLine()?.toLowerCase() ?: ""

        // Проверяем, что пользователь выбрал корректный вариант
        if (player !in options) {
            println("Некорректный ввод")
            continue
        }

        // Сгенерируем случайный выбор компьютера
        computer = options[(0..2).random()]

        // Определяем победителя
        result = when {
            player == computer -> "Ничья"
            player == "камень" && computer == "ножницы" -> "Победил игрок"
            player == "ножницы" && computer == "бумага" -> "Победил игрок"
            player == "бумага" && computer == "камень" -> "Победил игрок"
            else -> "Победил компьютер"
        }

        // Вывод результата игры
        println("Игрок выбрал $player, компьютер выбрал $computer.\n$result")

        // Запрашиваем у пользователя, хочет ли он продолжить игру
        println("Хотите продолжить игру? (да/нет)")
        val answer = readLine()?.toLowerCase() ?: ""

        // Если пользователь не хочет продолжать, выходим из игры
        if (answer != "да") {
            break
        }
    }
}