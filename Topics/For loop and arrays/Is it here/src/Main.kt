import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    val numbers = IntArray(n) { scanner.nextInt() }
    val m = scanner.nextInt()

    println(if (numbers.contains(m)) "YES" else "NO")
}