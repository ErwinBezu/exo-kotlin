package TP

import TP.enums.Type
import TP.exception.DocumentAlreadyBorrowedException
import TP.exception.DocumentNotBorrowedException
import TP.model.Book
import TP.model.Document
import TP.model.Magazine

fun main() {
    val documents = mutableListOf<Document>(
        Book("The Witcher", "Andrzej Sapkowski", 1993, 320, Type.FANTASTIQUE),
        Magazine("Canard PC", 2023, 420),
        Book("Harry Potter", "J.K. Rowling", Type.ROMAN)
    )

    for (doc in documents) {
        println(doc.showInfo())
    }

    val witcher = documents[0] as Book
    val canardPC = documents[1] as Magazine
    val harry = documents[2] as Book

    println("Consultation du magazine '${canardPC.title}' ...")
    canardPC.consult()

    println("Tentative d’emprunt du livre '${witcher.title}'...")
    try {
        witcher.borrow()
    } catch (e: DocumentAlreadyBorrowedException) {
        println("ERREUR : ${e.message}")
    } catch (e: DocumentNotBorrowedException) {
        println("ERREUR : ${e.message}")
    }

    println("Tentative d’emprunt du livre '${witcher.title}' à nouveau ...")
    try {
        witcher.borrow()
    } catch (e: DocumentAlreadyBorrowedException) {
        println("ERREUR : ${e.message}")
    } catch (e: DocumentNotBorrowedException) {
        println("ERREUR : ${e.message}")
    }

    println("Tentative de rendre le livre '${harry.title}' sans l'avoir emprunté ...")
    try {
        harry.render()
    } catch (e: DocumentAlreadyBorrowedException){
        println("ERREUR : ${e.message}")
    } catch (e: DocumentNotBorrowedException) {
        println("ERREUR : ${e.message}")
    }

    println("Retour du livre '${witcher.title}' ... ")
    try {
        witcher.render()
    } catch (e: DocumentAlreadyBorrowedException){
        println("ERREUR : ${e.message}")
    } catch (e: DocumentNotBorrowedException) {
        println("ERREUR : ${e.message}")
    }

    //BONUS
    for (doc in documents) {
        println(doc.showInfo { it.uppercase() })
        println(doc.showInfo { it.lowercase() })
        println(doc.showInfo { "[$it]" })
    }

}