package extend

class Developer(name: String, age: Short, val lang: String) : Worker(name, age) {

    override fun work() {
        println("Пишу код на $lang")
    }
}