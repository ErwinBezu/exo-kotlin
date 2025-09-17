package TP.model

abstract  class Document(val title: String, val publicationDate: Int){
    abstract fun showInfo():String

    fun showInfo(transform: (String) -> String): String {
        return transform(showInfo())
    }
}