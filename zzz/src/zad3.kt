fun main(){
    try {


        println("Введите возраст")
        var vozr = readLine()!!.toInt()
        when (vozr) {
            in 0..2 -> println("Младенец")
            in 3..10 -> println("Ребенок")
            in 11..18 -> println("Подросток")
            in 19..25 -> println("Молодой")
            in 26..55 -> println("Взрослый")
            in 56..100 -> println("Пожилой")
            else -> println("Неверный ввод")
        }
    }catch(e:Exception)
    {
        println("Неверный ввод")
    }


}