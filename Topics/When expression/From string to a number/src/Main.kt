import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.next()

    when (n) {
        "one" -> println(1)
        "two" -> println(2)
        "three" -> println(3)
        "four" -> println(4)
        "five" -> println(5)
        "six" -> println(6)
        "seven" -> println(7)
        "eight" -> println(8)
        "nine" -> println(9)
        else -> println("Unknown number")
    }
}