package jour2.model

class Book(val title: String, val author : String, val pageCount: Int ) {
    constructor(title: String, author: String): this(title, author, 100)

    fun description(): String = "Le livre $title écrit par $author contient $pageCount pages."
}