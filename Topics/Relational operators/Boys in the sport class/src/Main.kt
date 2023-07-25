fun main() {
    val h1: Int = readln().toInt()
    val h2: Int = readln().toInt()
    val h3: Int = readln().toInt()

    if ((h1 >= h2 && h2 >= h3) || (h1 <= h2 && h2 <= h3)) {
        println(true)
    } else {
        println(false)
    }
}
