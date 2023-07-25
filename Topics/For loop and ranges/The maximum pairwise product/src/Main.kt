import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextLine().toInt()
    val values = MutableList(n) { scanner.nextInt() }
    val valuesSorted = values.sorted().reversed()

    println(if (n > 1) valuesSorted[0] * valuesSorted[1] else valuesSorted[0])
}