package functions

fun main() {

}

//пузырьковая сортировка по возрастанию
private fun sort(numbers :MutableList<Int>): List<Int> {
    for (i in 1..< numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

private fun sort(numbers :Array<Int>) :List<Int> = sort(numbers.toMutableList())

private fun sort(vararg numbers :Int) :List<Int> = sort(numbers.toMutableList())

//пузырьковая сортировка по убыванию
private fun sortDown(numbers: MutableList<Int>): List<Int> {
    for (i in numbers.size - 2 downTo 0) {
        for (j in 0..i) {
            if (numbers[j] < numbers[j + 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
    return numbers
}

