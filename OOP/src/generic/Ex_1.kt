package generic

fun main() {

    val list: MyList<Int> = MyArrayList.myListOf()

    for (i in 0..100) {
        list.addToList(i)
    }
    for (i in 0..90) {
        list.removeElementAtIndex(0)
    }
    for (i in 0..< list.sizeList()) {
        println(list.getFromList(i))
    }

}