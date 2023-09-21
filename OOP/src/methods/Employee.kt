package methods

import java.time.LocalDateTime

class Employee(val name: String, val spec: String, val year: Int) {

    val stage: Int
        get() = LocalDateTime.now().year - year

    fun toWork() {
        println("Работаю...")
    }

}