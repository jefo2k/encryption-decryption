package encryptdecrypt

import java.io.File
import java.lang.Exception
import java.util.Scanner
import kotlin.system.exitProcess

val scanner = Scanner(System.`in`)

class Cypher(private val key: Int) {
    private val unicodeEncryptTable = HashMap<Char, Char>()
    private val unicodeDecryptTable = HashMap<Char, Char>()
    private val shiftEncryptTable = HashMap<Char, Char>()
    private val shiftDecryptTable = HashMap<Char, Char>()
    private val symbolsUnicodeRange = 32..126
    private val symbolsShiftRange1 = 'A'..'Z'
    private val symbolsShiftRange2 = 'a'..'z'

    init {
        // unicode encrypt decrypt
        val originalUnicodeSymbols = symbolsUnicodeRange.map { it.toChar() }.toList().toTypedArray()
        val encryptedUnicodeSymbols = CharArray(originalUnicodeSymbols.size)

        // initialize unicode encrypted symbols
        for (i in originalUnicodeSymbols.indices) {
            val newIndex = (i + key) % originalUnicodeSymbols.size
            encryptedUnicodeSymbols[i] = originalUnicodeSymbols[newIndex]
        }

        // initialize unicode cypher map table
        for (i in originalUnicodeSymbols.indices) {
            unicodeEncryptTable[originalUnicodeSymbols[i]] = encryptedUnicodeSymbols[i]
            unicodeDecryptTable[encryptedUnicodeSymbols[i]] = originalUnicodeSymbols[i]
        }

        // shift encrypt decrypt
        val originalShiftSymbols1 = symbolsShiftRange1.map { it.toChar() }.toList().toTypedArray()
        val originalShiftSymbols2 = symbolsShiftRange2.map { it.toChar() }.toList().toTypedArray()
        val encryptedShiftSymbols1 = CharArray(originalShiftSymbols1.size)
        val encryptedShiftSymbols2 = CharArray(originalShiftSymbols2.size)

        // initialize shift encrypted symbols
        for (i in originalShiftSymbols1.indices) {
            val newIndex = (i + key) % originalShiftSymbols1.size
            encryptedShiftSymbols1[i] = originalShiftSymbols1[newIndex]
        }

        for (i in originalShiftSymbols2.indices) {
            val newIndex = (i + key) % originalShiftSymbols2.size
            encryptedShiftSymbols2[i] = originalShiftSymbols2[newIndex]
        }

        // initialize shift cypher map table
        for (i in originalShiftSymbols1.indices) {
            shiftEncryptTable[originalShiftSymbols1[i]] = encryptedShiftSymbols1[i]
            shiftDecryptTable[encryptedShiftSymbols1[i]] = originalShiftSymbols1[i]
        }

        for (i in originalShiftSymbols2.indices) {
            shiftEncryptTable[originalShiftSymbols2[i]] = encryptedShiftSymbols2[i]
            shiftDecryptTable[encryptedShiftSymbols2[i]] = originalShiftSymbols2[i]
        }

    }

    fun encrypt(rawData: String, alg: String): String {
        when (alg) {
            "shift" -> return shiftEncrypt(rawData)
            "unicode" -> return unicodeEncrypt(rawData)
            else -> return rawData
        }
    }

    fun decrypt(encryptedData: String, alg: String): String {
        when (alg) {
            "shift" -> return shiftDecrypt(encryptedData)
            "unicode" -> return unicodeDecrypt(encryptedData)
            else -> return encryptedData
        }
    }

    private fun unicodeEncrypt(rawData: String): String {
        val encryptedCharList = mutableListOf<Char>()
        for (char in rawData) {
            if (char.code in symbolsUnicodeRange) {
                unicodeEncryptTable[char]?.let { encryptedCharList.add(it) }
            } else {
                encryptedCharList.add(char)
            }
        }
        return encryptedCharList.joinToString("")
    }

    private fun unicodeDecrypt(encryptedData: String): String {
        val decryptedCharList = mutableListOf<Char>()
        for (char in encryptedData) {
            if (char.code in symbolsUnicodeRange) {
                unicodeDecryptTable[char]?.let { decryptedCharList.add(it) }
            } else {
                decryptedCharList.add(char)
            }
        }
        return decryptedCharList.joinToString("")
    }

    private fun shiftEncrypt(rawData: String): String {
        val encryptedCharList = mutableListOf<Char>()
        for (char in rawData) {
            if (char in symbolsShiftRange1 || char in symbolsShiftRange2) {
                shiftEncryptTable[char]?.let { encryptedCharList.add(it) }
            } else {
                encryptedCharList.add(char)
            }
        }
        return encryptedCharList.joinToString("")
    }

    private fun shiftDecrypt(encryptedData: String): String {
        val decryptedCharList = mutableListOf<Char>()
        for (char in encryptedData) {
            if (char in symbolsShiftRange1 || char in symbolsShiftRange2) {
                shiftDecryptTable[char]?.let { decryptedCharList.add(it) }
            } else {
                decryptedCharList.add(char)
            }
        }
        return decryptedCharList.joinToString("")
    }

}

fun main(args: Array<String>) {
    if (args.size % 2 != 0) showWrongUsageMessageAndExit()

    var alg = "shift"
    var mode = "enc"
    var key = 0
    var data = ""
    var fileInName = ""
    var fileOutName = ""

    for (i in args.indices step 2) {
        when (args[i]) {
            "-mode" -> mode = args[i + 1]
            "-key" -> key = args[i + 1].toInt()
            "-data" -> data = args[i + 1]
            "-in" -> fileInName = args[i + 1]
            "-out" -> fileOutName = args[i + 1]
            "-alg" -> alg = args[i + 1]
            else -> showWrongUsageMessageAndExit()
        }
    }

    // when receives -in and no -data, reads file content
    if (fileInName != "" && data == "") {
        val inputFile = File(fileInName)
        data = inputFile.readText()
    }

    val cypherService = Cypher(key)

    val result = when (mode) {
        "enc" -> cypherService.encrypt(data, alg)
        "dec" -> cypherService.decrypt(data, alg)
        else -> ""
    }

    // when -out write a file
    if (fileOutName != "") {
        val outputFile = File(fileOutName)
        outputFile.writeText(result)
    } else {
        println(result)
    }
}

fun showWrongUsageMessageAndExit() {
    println("Error")
    println("usage:")
    println("> app -mode <enc/dec> -key <key> -data \"<input message>\"")
    exitProcess(0)
}
