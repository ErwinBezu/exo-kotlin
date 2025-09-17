package TP.model

import TP.interfaces.Consultation

class Magazine(title: String, publicationDate:Int, val number:Int )
    : Document(title, publicationDate ), Consultation {
        override fun showInfo() {
            println("'$title', n°$number, $publicationDate" )
        }
}