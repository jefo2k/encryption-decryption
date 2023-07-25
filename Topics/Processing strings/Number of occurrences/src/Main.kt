import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val str = scanner.nextLine()
    val subStr = scanner.nextLine()
    var subStrInStrOccurrencies = 0

    for (i in 0..(str.length - subStr.length)) {
        if (str.substring(i, i + subStr.length) == subStr) subStrInStrOccurrencies++
    }

    println(subStrInStrOccurrencies)
}