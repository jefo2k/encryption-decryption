fun main() {
    try {
    val z = 1/0

    // do not touch the lines below    
    } catch(e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}