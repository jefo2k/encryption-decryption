// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    var a = 10

    when (a) {
        in 1..22 -> print("Ok 1")
        //in 1..20 -> print("Ok"); print("Ok")
        //"2" -> print("Ok")
        a + a -> print("Ok 2")
        //> 0 -> print("Ok")
        10, 11, 12 -> print("Ok 3")
    }
}
