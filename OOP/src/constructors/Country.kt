package constructors

//в круглых скобках определяем первичный конструктор

class Country(val countryName: String = "", val population: Long = 0) {

//    //создаем вторичный конструктор, обязательно вызываем первичный : this()
//    // или можем указать значения по умолчанию
//    constructor(): this("", 0) {
//
//    }











    override fun toString(): String {
        return "Country(countryName='$countryName', population=$population)"
    }
}