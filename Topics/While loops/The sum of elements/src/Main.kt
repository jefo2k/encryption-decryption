import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    var total = 0
    do {
        val nextValue = scanner.nextInt()
        total += nextValue
    } while (nextValue != 0)

    println(total)
}