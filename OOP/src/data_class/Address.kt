package data_class

class Address(val town: String, val street: String, val num: Short) {

    operator fun component1() = town
    operator fun component2() = street
    operator fun component3() = num

    fun copy(town: String = this.town, street: String = this.street, num: Short = this.num): Address {
        return Address(town, street, num)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (town != other.town) return false
        if (street != other.street) return false
        return num == other.num
    }

    override fun hashCode(): Int {
        var result = town.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + num
        return result
    }

    override fun toString(): String {
        return "Address(town='$town', street='$street', num=$num)"
    }

}

