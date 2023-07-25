//fun main() {
//    val lewisCarrollBook = LewisCarrollBook()
//    var bookName = lewisCarrollBook.name
//    lewisCarrollBook.name = "Alice's Adventures in Wonderland"
//    bookName = lewisCarrollBook.name
//    var authorName = lewisCarrollBook.author
//    var bookPrice = lewisCarrollBook.price
//    lewisCarrollBook.price = 1500
//}

class LewisCarrollBook {
    var name = ""
        get() {
            println("The name of the book is $field")
            return field
        }
        set(value) {
            println("Now, a book called $value")
            field = value
        }
    var author = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }
    var price = 0
        get() {
            println("Putting a new price...")
            return field
        }
        set(value) {
            println("The new price is $value")
            field = value
        }
}