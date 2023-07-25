import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextLine().toInt()
    val nList = IntArray(n) { scanner.nextLine().toInt() }

    val nListMax = nList.maxOf { it }
    println(nList.indexOf(nListMax))
}