package intro

import java.util.*

class Dog {

    var nik = ""
        get() = field.lowercase().replaceFirstChar { it.titlecase() }

    var age = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    var weight = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}