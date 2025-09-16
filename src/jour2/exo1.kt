package jour2

import jour2.model.Book

fun main() {
    val book1 = Book("Le Silmarillion ", "J.R.R. Tolkien", 528)

    val book2 = Book("Conan", "Robert E. Howard")

    println(book1.description())
    println(book2.description())

}
