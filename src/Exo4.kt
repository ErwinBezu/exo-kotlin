fun main() {
    println(quelleCategorie(5))
    println(quelleCategorie(7))
    println(quelleCategorie(10))
    println(quelleCategorie(12))
    println(quelleCategorie(15))
}

fun quelleCategorie(age:Int):String {
    return when(age){
        in 3..6 -> "Baby"
        in 7..8 -> "Poussin"
        in 9..10 -> "Pupille"
        in 11..12 -> "Minime"
        in 13..17 -> "Cadet"
        else -> "C'est trop jeune ou alors trop vieux !"
    }
}