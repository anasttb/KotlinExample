package intro

class User {

    /**Поля класса в kotlin являются свойствами
     * каждое свойство по умолчанию имеет стандартные Геттеры и Сеттеры
     * поэтому явно их объявлять не нужно, только если нас не устраивает стандартная реализация
     * Что бы описать Геттер сразу после поля класса описываем get или set что нужно*/

    var age: Int = 0
        set(value) {
            if(value >= 0) {
                field = value
            }
        }

    var names: String? = null
        get() {
            return if (field == null) {
                ""
            } else {
                field
            }
        }


}
