package extension_fun

fun main() {

    val list = listOf<Int>()
    myWith(list) {
        sum()
        average()
    }

    val str = "dkjgkdgnj"
    myWith(str) {
        println(uppercase())
    }

}


//создали параметризованную функцию, которая принимает объект типа T, и функцию, которая расширяет класс T
//если функция принимает в качестве параметра другую функцию то желательно сделать ее inline
inline fun<T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}


////создаем функцию, которая принимает List типа Int и функцию, которая расширяет интерфейс List
//fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
//    list.operation()
//}


////создадим перегруженный метод который принимает строку, и расширяет класс String
//fun myWith(str: String, operation: String.() -> Unit) {
//    str.operation()
//}


////создадим метод которая принимает Any и расширяет Any
//fun myWith(obj: Any, operation: Any.() -> Unit) {
//    obj.operation()
//}