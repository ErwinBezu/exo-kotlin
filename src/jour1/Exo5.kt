package jour1

fun main () {
    println(compterLettreA("C'est le b-a ba"))
    println(compterLettreA("mixer"))
}

fun compterLettreA(texte: String) = texte.count { it == 'a' || it == 'A' }

/* Version longue (je préfère la version one liner xD)

fun jour1.compterLettreA (texte : String) : Int {
    var compteur = 0
    for (lettre in texte) {
        if (lettre == 'a' || lettre == 'A') {
            compteur++
        }
    }
    return compteur
} */