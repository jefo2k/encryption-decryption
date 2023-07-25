class Fabric(var color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"
    init {
        println("$color fabric is created")
    }

    constructor(_color: String, _pattern: String, _patternColor: String): this(_color) {
        pattern = _pattern
        patternColor = _patternColor
        println("$patternColor $pattern pattern is printed on the fabric")
    }
}