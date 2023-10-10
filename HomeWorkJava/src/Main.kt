fun main() {

    var num: Int = 123456

    var res = 0

    while (true) {
        res += num % 10
        num /= 10
        if (num == 0) {
            break
        }
    }

    println(res)

}