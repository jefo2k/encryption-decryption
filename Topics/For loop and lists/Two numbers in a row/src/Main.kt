import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextLine().toInt()
    val nList = IntArray(n) { scanner.nextLine().toInt() }
    val (p, m) = scanner.nextLine().split(" ").map { it.toInt() }

    println(if (nList.joinToString("").contains("$p$m") || nList.joinToString("").contains("$m$p")) "NO" else "YES")
}