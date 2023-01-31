fun main(){
    try {


        println("Введите трехзначное число")
        var x = readLine()!!.toInt()
        var a = x /100!!.toInt()
        var c = x%10!!.toInt()
        var b = x % 100/10!!.toInt()
        when
        {
            (a==b&&b==c) -> println("Цифры одинаковые")
            else -> println("Цифры разные")
        }

    }catch (e:Exception){
        println("Неверный ввод")
    }
}
