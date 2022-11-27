fun main(args: Array<String>) {
    println("Задание 1: ")
    println()
    ProgramOne_1()
    println()
    ProgramOne_2()
}

fun ProgramOne_1() {
    println("1) Разработать программу, которая для заданной строки s " +
            "подсчитывает общее число вхождений символов х и у")
    println()
    print("Введите строку: ")
    val s = readLine()
    print("Введите первый символ: ")
    val x = readLine()!![0]
    print("Введите второй символ: ")
    val y = readLine()!![0]
    var counterx = 0
    var countery = 0
    var n = 0
    s!!.forEach { _ ->
        val char = s[n]
        if (char == x) counterx++
        if (char == y) countery++
        n++
    }
    println("Кол-во символов '$x': $counterx; Кол-во символов '$y': $countery")
}

fun ProgramOne_2() {
    println("2) Разработать программу, которая для заданной строки s " +
            "определяет, какой из двух заданных символов встречается чаще в строке")
    println()
    print("Введите строку: ")
    val s = readLine()
    print("Введите первый символ: ")
    val x = readLine()!![0]
    print("Введите второй символ: ")
    val y = readLine()!![0]
    var counterX = 0
    var counterY = 0
    var n = 0
    s!!.forEach { _ ->
        val char = s[n]
        if (char == x) counterX++
        if (char == y) counterY++
        n++
    }
    if (counterX > counterY) {
        println("Символ '$x' употребляется чаще ($counterX > $counterY)")
    }
    else {
        println("Символ '$y' употребляется чаще ($counterY > $counterX)")
    }
}