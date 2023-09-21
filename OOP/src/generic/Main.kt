package generic

fun main() {

    val list = mutableListOf(5, 1, 7, 12, -6, 3, -10, 0)

    val sortList = sortMass(list)
    println(sortList)



}


fun sortMass(mass: MutableList<Int>): List<Int> {
    for (i in 1..<mass.size) {
        for (j in mass.size - 1 downTo i) {
            if (mass[j] < mass[j - 1]) {
                val tamp = mass[j]
                mass[j] = mass[j - 1]
                mass[j - 1] = tamp
            }
        }
    }
    return mass
}
