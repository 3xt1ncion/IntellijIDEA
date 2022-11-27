fun main(args: Array<String>) {
    println("Вариант 1")
    println()
    print("Введите начальное значение: ")
    val startValue = readLine()?.toInt()
    if (startValue != null) {
        val counter = CounterRead(startValue)
        println(counter.readValue())
        print("Введите инкремент: ")
        val inc = readLine()?.toInt()
        counter.incValue(inc!!)
        print("Введите декремент: ")
        val dec = readLine()?.toInt()
        counter.decValue(dec!!)
    }
    else {
        val counter = CounterDefault()
        println(counter.readValue())
        counter.incValue()
        counter.decValue()
    }

}
class CounterDefault {
    var value = 0
        set (value) {
            if ( (value < -10) and (value > 10) )
                field = value
        }
    fun incValue() {
        value++
        println("Значение счетчика изменено на $value")
    }

    fun decValue() {
        value--
        println("Значение счетчика изменено на $value")
    }

    fun readValue(): String {
        return "Значение счетчика равно $value"
    }
}
class CounterRead(_value: Int) {
    var value: Int = _value
        set (value) {
            if ( (value < -10) and (value > 10) )
                field = value
        }
    fun incValue(inc: Int) {
        value += inc
        println("Значение счетчика изменено на $value")
    }

    fun decValue(dec: Int) {
        value -= dec
        println("Значение счетчика изменено на $value")
    }

    fun readValue(): String {
        return "Значение счетчика равно $value"
    }
}