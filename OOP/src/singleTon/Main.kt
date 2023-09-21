package singleTon

fun main() {

    val db = DataBase
    db.insertDate("1")
    db.insertDate("2")

    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")

    for (str in db.data) {
        println(str)
    }

}