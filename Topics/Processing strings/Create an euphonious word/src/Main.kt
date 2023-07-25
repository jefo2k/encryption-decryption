import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val inputWord = scanner.next()
    var charsNeeded = 0
    var qtdVowels = 0
    var qtdConsonants = 0
    val vowels = mutableListOf<Char>('a', 'e', 'i', 'o', 'u', 'y')
    val consonants = ('a'..'z').toMutableList() - vowels

    for (char in inputWord) {
        if (vowels.contains(char)) {
            qtdVowels++
            qtdConsonants = 0
        }
        if (consonants.contains(char)) {
            qtdConsonants++
            qtdVowels = 0
        }
        if (qtdVowels > 1 && qtdVowels % 2 == 1) {
            charsNeeded++
        }
        if (qtdConsonants > 1 && qtdConsonants % 2 == 1) {
            charsNeeded++
        }
    }
    println(charsNeeded)

}