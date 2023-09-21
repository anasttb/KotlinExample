package annonim_class

fun main() {

    // создание объекта анонимного класса
    // переопределяем метод drive()
    travel(object : Transport("Автобус") {
        override fun drive() {
            println("$name едет...")
        }
    })

}

private fun travel(transport: Transport) {
    transport.drive()
}