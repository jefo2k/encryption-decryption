import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

val scanner = Scanner(System.`in`)

fun main() {
    val format = scanner.next()

    when (format) {
        "triangle" -> triangle()
        "rectangle" -> rectangle()
        "circle" -> circle()
        else -> println("Invalid operation")
    }
}

fun triangle() {
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    val s = (a + b + c) / 2 // semi-perimeter
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    println(area)
}

fun rectangle() {
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()

    val area = a * b
    println(area)
}

fun circle() {
    val r = scanner.nextDouble()

    val pi = 3.14
    val area = pi * r.pow(2)
    println(area)
}
