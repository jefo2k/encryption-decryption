import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    val nList = mutableListOf<Int>()

    repeat(n) {
        val n = scanner.nextInt()
        nList.add(n)
    }

    val m = scanner.nextInt()

    println(if (nList.contains(m)) "YES" else "NO")
}