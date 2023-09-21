package annonim_class

//так же как и классы методы объявляем переменную name -> open
//что бы ее можно было переопределять

abstract class Transport(open val name: String) {

    abstract fun drive()

}