import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val a = scanner.nextLine().toInt()
    val b = scanner.nextLine().toInt()
    val c = scanner.nextLine().toInt()

    val isSumEquals20 = { a: Int, b: Int -> a + b == 20 }

    println(isSumEquals20(a, b) || isSumEquals20(a, c) || isSumEquals20(b, c))
}