package abstarctClass_interfaces_smartCast

abstract class Worker(val name: String, val age: Short) : Comparable<Worker> {

    abstract fun work()

    override fun toString(): String {
        return "Имя: $name, Возраст: $age"
    }

    override fun compareTo(other: Worker): Int {
        var result = this.name.compareTo(other.name)
        if (result == 0) {
            result = this.age.compareTo(other.age)
        }
        return result
    }

}