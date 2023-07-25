import java.lang.Exception
import java.util.Scanner

val scanner = Scanner(System.`in`)

fun solution() {
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()

    try {
        println(n1/n2)
    } catch (e: Exception) {
        println(message = e.message)
    } finally {
        println("This is the end, my friend.")
    }
}