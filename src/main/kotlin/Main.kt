import kotlin.random.Random

fun main(args: Array<String>) {
    println("Задание 1")
    println()
    ProgramOne_1()
    println()
    //ProgramOne_2()
}

fun ProgramOne_1() {
    println("1) Подсчитать среднее арифметическое нечетных элементов, расположенных выше главной диагонали")
    print("Введите размерность массива: ")
    val x = readLine()?.toInt()
    val y = readLine()?.toInt()
    val numbers = Array(x!!) { Array(y!!) { Random.nextInt(-1000, 1000) } }
    var i = 0
    var n = 0
    var s = 0
    var delitel = 0
    println()
    for (counter in numbers) {
        for (count in counter) {
            if (numbers[i][n] > 0) {
                s += numbers[i][n]
                delitel++
            }
            i++
        }
        n++
    }
    println("Среднее арифметическое = $s")
}