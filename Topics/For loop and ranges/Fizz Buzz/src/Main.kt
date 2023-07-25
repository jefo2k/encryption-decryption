import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()

    for (i in n1..n2) {
        println(fizzBuzz(i))
    }
}

fun fizzBuzz(n: Int): String {
    if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz"
    if (n % 3 == 0) return "Fizz"
    if (n % 5 == 0) return "Buzz"
    return n.toString()
}