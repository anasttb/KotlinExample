package abstarctClass_interfaces_smartCast

class Seller(name: String, age: Short) : Worker(name, age), Cleaner {

    override fun work() {
        println("Продаю товар")
    }

    override fun clean() {
        println("Продавец прибирается")
    }

    override fun toString(): String {
        return "Продавец: ${super.toString()}"
    }


}