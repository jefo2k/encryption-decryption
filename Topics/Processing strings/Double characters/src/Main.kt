import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val input = scanner.nextLine()

    for(char in input) {
        print(char.toString().repeat(2))
    }
}