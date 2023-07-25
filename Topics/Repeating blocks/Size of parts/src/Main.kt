import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()

    var numberOfPerfectComponents = 0
    var numberOfLargerComponents = 0
    var numberOfRejectedComponents = 0

    repeat(n) {
        when (scanner.nextInt()) {
            0 -> numberOfPerfectComponents++
            -1 -> numberOfRejectedComponents++
            1 -> numberOfLargerComponents++
        }
    }

    println("$numberOfPerfectComponents $numberOfLargerComponents $numberOfRejectedComponents")
}