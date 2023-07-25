import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val ticket = scanner.nextLine().toCharArray()
    val sumOfFirstOnes = ticket[0].toString().toInt() + ticket[1].toString().toInt() + ticket[2].toString().toInt()
    val sumOfLastOnes = ticket[ticket.lastIndex].toString().toInt() + ticket[ticket.lastIndex - 1].toString().toInt() + ticket[ticket.lastIndex - 2].toString().toInt()
    println(if (sumOfFirstOnes == sumOfLastOnes) "Lucky" else "Regular")
}