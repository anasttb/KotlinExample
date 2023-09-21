fun generatorMatrix(m: Int,n: Int): Array<IntArray> {
    val matrix = Array(m) { IntArray(n) }
    for (i in 0..< m) {
        for (j in 0..< n) {
            matrix[i][j] = (1..4).random()
        }
    }
    return matrix
}

fun printMatrix(array: Array<IntArray>) {
    for (i in array.indices) {
        for (j in 0..< array[i].size) {
            print(String.format("%6d", array[i][j]))
        }
        println()
    }
    println("----------------------------")
}

fun multiplication(array1: Array<IntArray>, array2: Array<IntArray>): Array<IntArray>? {
    /**Умножение матриц возможно при условии:
     * количество столбцов 1-ой матрицы должно быть равно количеству строк 2-ой матрицы*/
    val matrixRes = Array(array1.size) { IntArray(array2[0].size) }
    if (array1[0].size != array2.size) {
        println("Перемножение матриц не возможно")
        return null
    }
    else {
        for (i in matrixRes.indices) {
            for (j in matrixRes[0].indices) {
                for (k in array1[0].indices) {
                    matrixRes[i][j] += array1[i][k] * array2[k][j]
                }
            }
        }
    }
    return matrixRes
}

fun main() {
    //1-я матрица
    val m = 4 //строки
    val n = 5 //столбцы

    //2-я матрица
    val a = 5 //строки
    val b = 4 //столбцы

    val matrixOne = generatorMatrix(m, n)
    val matrixTwo = generatorMatrix(a, b)

    printMatrix(matrixOne)
    printMatrix(matrixTwo)

    val res = multiplication(matrixOne, matrixTwo)
    if (!res.isNullOrEmpty()) {
        printMatrix(res)
    }
}