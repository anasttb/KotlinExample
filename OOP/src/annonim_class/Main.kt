package annonim_class

fun main() {

    val machine: Transport = Machine("Машина")
    val bike: Transport = Bike("Bike")

    //т.к machine явно приведен к родительскому типу мы не можем вызвать у него метод startEngine()
//    machine.startEngine() - ошибка

    //еще один смарт-каст
    //если выполнится первое условие то выполнится и второе
    if (machine is Machine && machine.startEngine()) {

    }


    //несмотря на то что мы переопределили переменную name и сделали ее var
    //т.к. machine приведен к классу Transport мы не можем ее изменять
    //редактирование возможно только если переменная будет класса Machine

//    machine.name = "Машина - 2" //ошибка

    if (machine is Machine) {
        machine.name = "Машина - 2"
    }
    println(machine.name)

    //если machine не относится к классу Machine - ты происходит выход из метода
    //код после return не будет выполнен
    if (machine !is Machine) return
    machine.name = "Машина - 3"
    println(machine.name)









}