class Car(val make: String, val year: Int) {

    var speed: Int = 0

    // write the methods here
    fun accelerate() {
        speed += 5
    }
    fun decelerate() {
        speed -= 5
        if (speed < 0) speed = 0
    }
}

//fun main() {
//    var dkv = Car("VW", 1970)
//
//    println(dkv.speed)
//    dkv.accelerate()
//    dkv.accelerate()
//    dkv.accelerate()
//    println(dkv.speed)
//    dkv.decelerate()
//    dkv.decelerate()
//    println(dkv.speed)
//}