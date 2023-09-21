package abstarctClass_interfaces_smartCast

class Developer(name: String, age: Short, val lang: String) : Worker(name, age), Cleaner {

    override fun work() {
        println("Пишу код на $lang")
    }

    override fun clean() {
        println("Программист прибирается")
    }

    override fun toString(): String {
        return "Разработчик: ${super.toString()}, Язык: $lang"
    }
}