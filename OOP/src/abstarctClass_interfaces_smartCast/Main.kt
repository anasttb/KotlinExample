package abstarctClass_interfaces_smartCast

import java.util.Collections
import java.util.Comparator

fun main() {
    var worker = listOf(
        Seller("Аркадий", 23),
        Developer("Леонид", 19, "Java"),
        Director("Иван", 45),
        Developer("Андрей", 34, "C#"),
        Seller("Аркадий", 55),
        Developer("Юрий", 37, "Kotlin")
    )

    worker.forEach {
        it.work()
        if (it is Cleaner) {
            it.clean() // Smart Cast - умное приведение типов
        }
    }

    // is - то же самое что instanceOf в Java - проверка принадлежности к классу

    println("------------------------------")

    val cleaner = worker
        .filter { it is Cleaner } //поверяем относится ли элемент к классу Cleaner
        .map { it as Cleaner } //кастуем элемент к классу Cleaner

    cleaner.forEach { it.clean() }




    println("--------------------")





    //пример с Comparator
//    worker = worker.sortedWith { o1, o2 ->
//        var res = o1.name.compareTo(o2.name)
//        if (res == 0) {
//            res = o1.age.compareTo(o2.age)
//        }
//        return@sortedWith res
//    }


//    worker = worker.sorted() // если реализован Comparable


    //пример с Comparator и классом Collections
//    Collections.sort(worker) { o1, o2 ->
//        var res = o1.name.compareTo(o2.name)
//        if (res == 0) {
//            res = o1.age - o2.age
//        }
//        return@sort res
//    }



    worker.forEach { println(it) }
}