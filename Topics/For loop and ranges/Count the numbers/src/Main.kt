import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val a = scanner.nextLine().toInt()
    val b = scanner.nextLine().toInt()
    val n = scanner.nextLine().toInt()
    var divisiblesNumber = 0

    for (v in a..b) {
        if (v % n == 0) divisiblesNumber++
    }

    println(divisiblesNumber)
}