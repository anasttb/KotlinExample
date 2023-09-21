package equals_hashCode



class Address(val city: String, val street: String, val numberOfHouse: Int) {


    //переопределяем метод equals
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (hashCode() != other.hashCode()) {
            return false
        }
        other as Address // other кастую к Address
        return (this.city == other.city) and (this.street == other.street) and (this.numberOfHouse == other.numberOfHouse)
    }

    //переопределяем метод hashCode
    override fun hashCode(): Int {
        return city.hashCode() + street.hashCode() + numberOfHouse
    }


    //автоматически сгенерированные методы equals и hashCode

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Address
//
//        if (city != other.city) return false
//        if (street != other.street) return false
//        return numberOfHouse == other.numberOfHouse
//    }
//
//    override fun hashCode(): Int {
//        var result = city.hashCode()
//        result = 31 * result + street.hashCode()
//        result = 31 * result + numberOfHouse
//        return result
//    }


}