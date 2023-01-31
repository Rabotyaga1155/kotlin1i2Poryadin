fun main (){
    try {


        println("Введите число x")
        var x = readLine()!!.toDouble()

        when {
            (x <= 7) -> println(3 * x - 9)
            else -> println(1 / x * x - 4)
        }
    }catch (e:Exception){
        println("Неверный ввод")}

}
