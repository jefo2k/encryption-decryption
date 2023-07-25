import java.util.*

// using enums
enum class Country(val countryName: String) {
    GERMANY("Germany"),
    MALI("Mali"),
    DOMINICA("Dominica"),
    CANADA("Canada"),
    SPAIN("Spain"),
    AUSTRALIA("Australia"),
    BRAZIL("Brazil"),
    SENEGAL("Senegal"),
    FRANCE("France"),
    GRENADA("Grenada"),
    KIRIBATI("Kiribati"),
    NULL(""),
}

enum class Currency(val currencyName: String) {
    EUR("Euro"),
    XOF("CFA franc"),
    XCD("Eastern Caribbean dollar"),
    CAD("Canadian dollar"),
    AUD("Australian dollar"),
    BRL("Brazilian real"),
}

//enum class CountryCurrency(val countryName: String, countryCurrency: String) {
//    GERMANY("Germany", "Euro"),
//    MALI("Mali", "CFA franc"),
//    DOMINICA("Dominica", "Eastern Caribbean dollar"),
//    CANADA("Canada", "Canadian dollar"),
//    SPAIN("Spain", "Euro"),
//    AUSTRALIA("Australia", "Australian dollar"),
//    BRAZIL("Brazil", "Brazilian real"),
//    SENEGAL("Senegal", "CFA franc"),
//    FRANCE("France", "Euro"),
//    GRENADA("Grenada", "Eastern Caribbean dollar"),
//    KIRIBATI("Kiribati", "Australian dollar"),
//}

// using map<Country, Currency>
val countryCurrencyMap2 = mapOf(
    Pair(Country.GERMANY, Currency.EUR),
    Pair(Country.MALI, Currency.XOF),
    Pair(Country.DOMINICA, Currency.XCD),
    Pair(Country.CANADA, Currency.CAD),
    Pair(Country.SPAIN, Currency.EUR),
    Pair(Country.AUSTRALIA, Currency.AUD),
    Pair(Country.BRAZIL, Currency.BRL),
    Pair(Country.SENEGAL, Currency.XOF),
    Pair(Country.FRANCE, Currency.EUR),
    Pair(Country.GRENADA, Currency.XCD),
    Pair(Country.KIRIBATI, Currency.AUD),
)

// using map<String, String>
val countryCurrencyMap = mapOf(
    Pair("Germany", "Euro"),
    Pair("Mali", "CFA franc"),
    Pair("Dominica", "Eastern Caribbean dollar"),
    Pair("Canada", "Canadian dollar"),
    Pair("Spain", "Euro"),
    Pair("Australia", "Australian dollar"),
    Pair("Brazil", "Brazilian real"),
    Pair("Senegal", "CFA franc"),
    Pair("France", "Euro"),
    Pair("Grenada", "Eastern Caribbean dollar"),
    Pair("Kiribati", "Australian dollar"),
)

fun main() {
    val scanner = Scanner(System.`in`)

    scanner.nextLine().split(" ").also {

        var country1 = Country.NULL
        var country2 = Country.NULL
        for (enum in Country.values()) {
            if (it[0].uppercase(Locale.getDefault()) == enum.name) country1 = enum
            if (it[1].uppercase(Locale.getDefault()) == enum.name) country2 = enum
        }
        println(countryCurrencyMap2[country1] == countryCurrencyMap2[country2])
//        println(countryCurrencyMap[it[0]] == countryCurrencyMap[it[1]])
    }

}