import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val companiesNumber = scanner.nextInt()
    val anualIncomeList = MutableList<Int>(companiesNumber) { scanner.nextInt() }
    val taxRateList = MutableList<Int>(companiesNumber) { scanner.nextInt() }

    val taxValueList = mutableListOf<Int>()
    repeat(companiesNumber) { index ->
        taxValueList.add(anualIncomeList[index] * taxRateList[index])
    }

    println(taxValueList.indexOf(taxValueList.maxOrNull()) + 1)
}