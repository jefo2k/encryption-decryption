import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    val nList = IntArray(n) { scanner.nextInt() }
    val dQtd = nList.filter { it == 2 }.size
    val cQtd = nList.filter { it == 3 }.size
    val bQtd = nList.filter { it == 4 }.size
    val aQtd = nList.filter { it == 5 }.size

    println("$dQtd $cQtd $bQtd $aQtd")
}