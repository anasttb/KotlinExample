package constructors

fun main() {

    val country = Country(countryName = "Dania")

    println(country)

    val book = Book("Преступление и наказание")

    println(book.bookName)
    println(book.price)
    println(book.year)

}