package data_class

/**
 * Data - класс
 *
 * при создании класса автоматически переопределяется методы:
 *
 *      - toString
 *      - hashCode
 *      - equals
 *
 * еще одно отличие data класса - деструкторы (деструктивный оператор)
 *
 * используем деструктор для получения свойств объекта класса
 *
 * если какая-либо переменная не нужна, можно использовать знак "_"
 *
 * так же можно сделать и у обычного класса (не data), но тогда надо самостоятельно
 * определить деструктивные операторы для каждого поля класса в теле класса
 *
 *      operator fun component1() = name
 *      operator fun component2() = lastName
 *      operator fun component3() = id
 *
 * так же у data - класса автоматически переопределен метод copy()
 *
 *      val st1 = Student("Иван", "Иванов", "12345")
 *      val st2 = st1.copy()
 *
 * в таком случае st2 будет равен st1 но ссылаться они будут на разные объекты
 *
 * эта запись эквивалентна:
 *
 *      val st1 = Student("Иван", "Иванов", "12345")
 *      val st2 = Student("Иван", "Иванов", "12345")
 *
 * так же можем при копировании объекта изменить конкретные его свойства
 *
 *      val st1 = Student("Иван", "Иванов", "12345")
 *      val st2 = Student("Иван", "Иванов", "12345")
 *      val st3 = st1.copy(name = "Николай")
 *
 * так же в обычном классе (не data) можем создать метод copy()
 *
 *      fun copy(name: String = this.name, lastName: String = this.lastName,
 *      id: String = this.id): Student {
 *         return Student(name, lastName, id)
 *      }
 *
 */

fun main() {
    val st1 = Student("Иван", "Иванов", "12345")
    val st2 = Student("Иван", "Иванов", "12345")
    val st3 = st1.copy(name = "Николай")

    println(st1)
    println(st2)
    println(st3)

    println(st1.hashCode())
    println(st2.hashCode())
    println(st3.hashCode())

    println(st1 == st2) //сравниваем сами объекты
    println(st1 === st2) //сравниваем ссылки

    println(st1 == st3)
    println(st1 === st3)

    println()

    //деструктивный оператор
    //если переменная не нужны ставлю _
    val (name, _, id) = st1

    println(name)
    println(id)


}

