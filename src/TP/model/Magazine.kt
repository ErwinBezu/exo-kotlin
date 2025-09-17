package TP.model

import TP.interfaces.Consultation

class Magazine(title: String, publicationDate:Int, val number:Int )
    : Document(title, publicationDate ), Consultation {
        override fun showInfo(): String {
            return "'$title', n°$number, $publicationDate"
        }
}