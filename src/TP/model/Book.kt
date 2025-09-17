package TP.model

import TP.enums.Type
import TP.exception.DocumentAlreadyBorrowedException
import TP.exception.DocumentNotBorrowedException
import TP.interfaces.Borrowable
import TP.interfaces.Consultation

class Book (title: String,
            val author:String,
            publicationDate: Int,
            val nbPages: Int,
            val type: Type)
    : Document(title, publicationDate), Borrowable, Consultation
{
    constructor(title: String, author: String, type: Type) :
            this(title, author, 0, 100, type)

    override fun showInfo():String {
        return "'$title', $author, $publicationDate, $nbPages pages, Genre: $type"
    }

    override var isBorrowed: Boolean = false

    override fun borrow() {
        if (isBorrowed) {
            throw DocumentAlreadyBorrowedException("Ce livre est déjà emprunté !")
        }
        isBorrowed = true
        println("Emprunt réussi !")
    }

    override fun render() {
        if (!isBorrowed) {
            throw DocumentNotBorrowedException("Ce document n’a pas été emprunté !")
        }
        isBorrowed = false
        println("Le livre est maintenant disponible.")
    }
}