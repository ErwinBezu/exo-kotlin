package TP.model

abstract  class Document(val title: String, val publicationDate: Int){
    abstract fun showInfo()
}