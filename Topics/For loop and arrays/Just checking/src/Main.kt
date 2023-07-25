import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val arraySize = scanner.nextInt()
    val intArray = IntArray(arraySize) { scanner.nextInt() }
    val p = scanner.nextInt()
    val m = scanner.nextInt()

    println(if (intArray.contains(p) && intArray.contains(m)) "YES" else "NO")
}