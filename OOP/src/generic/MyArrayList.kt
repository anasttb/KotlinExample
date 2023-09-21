package generic

class MyArrayList<T> : MyList<T> {

    private var array = arrayOfNulls<Any>(10)
    private var size = 0

    companion object {
        fun <T> myListOf(vararg elements: T): MyArrayList<T> {
            val list = MyArrayList<T>()
            for (el in elements) {
                list.addToList(el)
            }
            return list
        }
    }

    override fun getFromList(index: Int): T {
        if (index in 0..<size) {
            array[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun addToList(string: T) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }
        array[size] = string
        size++
    }

    override fun removeElement(element: T) {
        for ((index, string) in array.withIndex()) {
            if (string == element) {
                removeElementAtIndex(index)
                return
            }
        }
    }

    override fun removeElementAtIndex(index: Int) {
        if (index in 0..<size) {
            for (i in index..<size - 1) {
                array[i] = array[i + 1]
            }
            size--
        }
        else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun sizeList(): Int {
        return size
    }
}