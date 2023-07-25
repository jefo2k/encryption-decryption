import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    val positiveListSize = IntArray(n) { scanner.nextInt() }.filter { it > 0 }.size
    println(positiveListSize)
}