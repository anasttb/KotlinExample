package singleTon

object DataBase {

    val name = "main.db"
    val version = 1
    val data  = mutableListOf<String>()

    fun insertDate(str: String) {
        data.add(str)
    }

    /**так как в kotlin есть "глобальные объекты" код ниже не нужен для реализации паттерна сингл тон*/

//    companion object {
//        var db: DataBase? = null
//
//        fun getInstance(): DataBase {
//            if (db == null) {
//                db = DataBase()
//            }
//            return db as DataBase
//        }
//    }

}