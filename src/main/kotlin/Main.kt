fun main(args: Array<String>) {
    println("Задание 2: ")
    println()
    ProgramTwo_1()
    println()
    ProgramTwo_2()
}

fun ProgramTwo_1() {
    println("1. Дана строка, в которой содержится осмысленное текстовое сообщение." +
            "Слова сообщения разделяются пробелами и знаками препинания." +
            "Вывести только те слова сообщения, в которых содержится заданная подстрока.")
    println()
    print("Введите строку: ")
    val stroka = readLine()
    print("Введите подстроку: ")
    val podstroka = readLine()
    var counter = stroka?.substringBefore(' ')
    if (stroka != null) {
        for (ssdg in stroka) {
            if (counter == podstroka) {
                print("$counter ")
            }
            counter = stroka.substringAfter(' ').substringBefore(' ')
        }
    }
}

fun ProgramTwo_2() {
    println("2. Дана строка, в которой содержится осмысленное текстовое сообщение." +
            "Слова сообщения разделяются пробелами и знаками препинания." +
            "Вывести только те слова сообщения, которые содержат не более чем n букв.")
    println()

}