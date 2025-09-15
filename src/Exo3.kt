fun main() {
    quelleHeure()
    quelleHeure("14h00")
}

fun quelleHeure(heure:String = "12h00") = println("il est $heure")