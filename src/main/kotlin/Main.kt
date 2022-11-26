import kotlin.random.Random

fun main(args: Array<String>) {
    println("Задание 1")
    println()
    ProgramOne_1()
    println()
    ProgramOne_2()
}

fun ProgramOne_1() {
    println("1) Заменить все положительные элементы противоположными им числами")
    print("Введите размерность массива: ")
    val n = readLine()?.toInt()
    val numbers = Array(n!!) { Random.nextInt(-1000, 1000) }
    var i = 0
    numbers.forEach { _ ->
        if (numbers[i] > 0) {
            numbers[i] = -numbers[i]
        }
        print(numbers[i])
        print(" ")
        i++
    }
    println()
}

fun ProgramOne_2() {
    println("2) Заменить все элементы, меньшие заданного числа, этим числом")
    print("Введите размерность массива: ")
    val n = readLine()?.toInt()
    val numbers = Array(n!!) { Random.nextInt(-1000, 1000) }
    print("Введите x: ")
    val x = readLine()?.toInt()
    var i = 0
    numbers.forEach { _ ->
        if (numbers[i] < x!!) {
            numbers[i] = x
        }
        print(numbers[i])
        print(" ")
        i++
    }
}