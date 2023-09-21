package generic

class MyClassList<T> : MyList<T> {

    var array = arrayOfNulls<Any>(10)
    var sizeArray = 0

    override fun getFromList(index: Int): T {
        if (index in 0..<sizeArray) {
            array[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun addToList(element: T) {
        if (sizeArray >= array.size) {
            array = array.copyOf(array.size * 2)
        }
        array[sizeArray] = element
        sizeArray++
    }

    override fun removeElement(element: T) {
        for ((i, el) in array.withIndex()) {
            if (el == element) {
                removeElementAtIndex(i)
                return
            }
        }
    }

    override fun removeElementAtIndex(index: Int) {
        if (index in 0..<sizeArray) {
            for (i in index..<sizeArray - 1) {
                array[i] = array[i + 1]
            }
            sizeArray--
        }
        else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun sizeList(): Int {
        return sizeArray
    }
}