import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val input = scanner.nextLine()
    var repetitions = 0

    for (i in input.indices) {
        repetitions ++
        if (i < input.lastIndex && input[i] == input[i + 1]) {
            continue
        }

        print(message = "${input[i]}$repetitions")
        repetitions = 0
    }

}