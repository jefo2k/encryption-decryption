import java.util.*
import kotlin.math.pow

val scanner = Scanner(System.`in`)

fun main() {
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()

    for (x in 0..1000) {
        val expression = (a * x.toFloat().pow(3)) + (b * x.toFloat().pow(2)) + (c * x) + d
        if (expression == 0f) {
            println(x)
        }
    }
}