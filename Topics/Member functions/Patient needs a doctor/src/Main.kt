class Patient(private val name: String) {
    fun say() = println("Hello, my name is ${this.name}, I need a doctor.")
}