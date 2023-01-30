fun main() {
    print("Введите первое число")
    var first = readLine()
    var one: Double = first!!.toDouble()
    print("Введите второе число")
    var second = readLine()
    var two: Double = second!!.toDouble()
    if (one > two)
        one++
    else if (two>one)
        two++
    else one = one * one * one
    println("Первое число $one,второе число $two")

}