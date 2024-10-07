fun main() {

    print("Введите n: ")
    val n = readln().toInt()
    fun calculate(n: Int): Int {
        return (1..Math.pow(10.0, n.toDouble()).toInt() - 1)
            .filter { it.toString().all { c -> c.toString().toInt() % 2 != 0 } }.sum()
    }
    fun evencount(sum: Int): Int {
        return sum.toString().count { c -> c.toString().toInt() % 2 == 0 }
    }
        val calculate = calculate(n)
        val evenCount = evencount(calculate)
        println("Сумма $n-значных нечетных цифр: $calculate")
        println("Количество четных цифр в сумме: $evenCount")
}