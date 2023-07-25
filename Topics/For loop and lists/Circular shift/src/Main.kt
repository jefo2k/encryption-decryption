import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val n = scanner.nextInt()
    val nList = mutableListOf<Int>()

    repeat(n) {
        val n = scanner.nextInt()
        nList.add(n)
    }

    print("${nList[nList.lastIndex]} ")
    for (index in 0 until  nList.lastIndex) {
        print("${nList[index]} ")
    }
}