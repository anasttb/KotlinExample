package function_with_let

var name: String? = null

fun main() {
    //если переменная == null то let не будет выполнен
    name?.let {
        if(it.length > 5) {
            println("ksjgns")
        }
    }
}