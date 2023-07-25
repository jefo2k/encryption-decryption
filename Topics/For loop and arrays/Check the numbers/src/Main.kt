fun main() {
    // reading data
    val n = readln().toInt()
    val array = IntArray(n)
    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
    }
    val (p, m) = readln().split(" ").map { it.toInt() }

    val isNextToEachOther = array.joinToString("").contains("$p$m") || array.joinToString("").contains("$m$p")
    println(if (isNextToEachOther) "NO" else "YES")
}