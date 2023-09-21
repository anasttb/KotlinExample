package extend

open class Worker(val name: String, val age: Short) {

    open fun work() {
        println("Работаю")
    }

}