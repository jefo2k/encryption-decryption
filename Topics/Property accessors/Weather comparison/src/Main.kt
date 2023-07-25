class City(val name: String) {
    var degrees: Int = if (name == "Dubai") 30 else if (name == "Moscow") 5 else if (name == "Hanoi") 20 else 0
        set(value) {
            if (value >= -92 && value <= 57) field = value
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees) {
        println(firstCity.name)
    } else if (secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees) {
        println(secondCity.name)
    } else if (thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees) {
        println(thirdCity.name)
    } else {
        println("neither")
    }
}