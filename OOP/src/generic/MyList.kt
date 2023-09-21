package generic

interface MyList<T> {

    fun getFromList(index: Int): T

    fun addToList(element: T)

    fun removeElement(element: T)

    fun removeElementAtIndex(index: Int)

    fun sizeList(): Int

}