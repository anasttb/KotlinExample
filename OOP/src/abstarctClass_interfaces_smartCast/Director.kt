package abstarctClass_interfaces_smartCast

class Director(name: String, age: Short) : Worker(name, age) {

    override fun work() {
        println("Управляю процессом")
    }

    override fun toString(): String {
        return "Директор: ${super.toString()}"
    }







    //    override fun compareTo(other: Director): Int {
//        var res = this.name.compareTo(other.name)
//        if (res == 0) {
//            res = this.age - other.age
//        }
//        return res
//    }

}