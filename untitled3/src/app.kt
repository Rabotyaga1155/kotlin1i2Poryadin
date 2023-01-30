fun main() {
    print("Введите число")
    var one = readLine()
    when (one){
        "0" -> print("Ноль")
        "1" -> print("Один")
        "2" -> print("Два")
        "3" -> print("Три")
        "4" -> print("Четыре")
        "5" -> print("Пять")
        "6" -> print("Шесть")
        "7" -> print("Семь")
        "8" -> print("Восемь")
        "9" -> print("Девять")
        else -> print("Ошибка при вводе")
    }
}
