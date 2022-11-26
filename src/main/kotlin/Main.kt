import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Задание 1: ")
    println()
    ProgramOne_1()
    println()
    ProgramOne_2()
    println()
    ProgramOne_3()
    println()
    println()
    println("Задание 2: ")
    println()
    ProgramTwo_1()
    println()
    ProgramTwo_2()
    println()
    ProgramTwo_3()
}

fun ProgramOne_1() {
    print("Введите сумму вклада: ")
    val x = readLine()!!.toDouble()
    print("Введите процент по вкладу: ")
    val y = readLine()!!.toDouble()
    val z = x / 100 * y
    println("Через год начислят $z")
}

fun ProgramOne_2() {
    print("Введите сумму вклада: ")
    val x = readLine()!!.toDouble()
    print("Введите процент по вкладу: ")
    val y = readLine()!!.toDouble()
    val z = x + x / 100 * y
    println("Через год сумма на вкладе $z")
}

fun ProgramOne_3() {
    print("Как тебя зовут? ")
    val x = readLine()
    print("Сколько тебе лет? ")
    val y = readLine()!!.toInt()
    val z = 2022 - y
    println("$x, ты родился в $z году")
}

fun ProgramTwo_1() {
    print("x1 = ")
    val a = readLine()!!.toDouble()
    print("y1 = ")
    val b = readLine()!!.toDouble()
    print("x2 = ")
    val c = readLine()!!.toDouble()
    print("y2 = ")
    val d = readLine()!!.toDouble()
    val x = sqrt((c - a).pow(2) + (d - b).pow(2))
    println("Расстояние между точками $x")
}

fun ProgramTwo_2() {
    print("a = ")
    val a = readLine()!!.toDouble()
    print("b = ")
    val b = readLine()!!.toDouble()
    val c = (a.pow(2) + b.pow(2)) / 2
    println("Среднее арифметическое $c")
}

fun ProgramTwo_3() {
    print("a = ")
    val a = readLine()!!.toDouble()
    print("b = ")
    val b = readLine()!!.toDouble()
    val c = sqrt(abs(a) * abs(b))
    println("Среднее геометрическое $c")
}
