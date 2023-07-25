import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val (a, b, c, n) = scanner.nextLine().split(" ").map { it.toInt() }
    val password = generatePassword(a, b, c, n)
    println(password)
}

fun generatePassword(a: Int, b: Int, c: Int, n: Int): String {
    val passwordChars = mutableListOf<Char>()

    var uppercaseQtd = 0
    var lowercaseQtd = 0
    var digitsQtd = 0

    repeat(n) {
        if (uppercaseQtd < a) {
            val upperRandomChar = ('A'..'Z').random()
            passwordChars.add(upperRandomChar)
            uppercaseQtd++
        } else if (lowercaseQtd < b) {
            val lowerRandomChar = ('a'..'z').random()
            passwordChars.add(lowerRandomChar)
            lowercaseQtd++
        } else if (digitsQtd < c) {
            val digitRandomChar = (('0'..'9').random())
            passwordChars.add(digitRandomChar)
            digitsQtd++
        } else {
            passwordChars.add(('a'..'z').random())
        }
    }

    var finalPassword = passwordChars.shuffled().joinToString("")
    while (isCharRepetition(finalPassword)) {
        finalPassword = finalPassword.toMutableList().shuffled().joinToString("")
    }

    return finalPassword
}

fun isCharRepetition(password: String): Boolean {
    for (i in 0 until password.lastIndex) {
        if (password[i] == password[i + 1]) return true
    }
    return false
}