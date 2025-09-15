fun main () {
    val adn = saisirADN()
    println("saisir la séquence:")
    val sequence = readLine() ?: ""

    if (!verifierADN(sequence)) {
        println("La séquence saisie est invalide !")
    } else {
        val pourcentage = proportion(adn, sequence)
        println("Le pourcentage d'occurrences de \"$sequence\" dans la chaîne est : $pourcentage %")
    }

    /* Version plus courte pour la science xD
    println(
        if (verifierADN(sequence))
            "Pourcentage de \"$sequence\" dans \"$adn\" : ${proportion(adn, sequence)} %"
        else
            "Séquence invalide"
    )
     */
}

fun verifierADN (adn: String) : Boolean = adn.all { it.lowercaseChar() in "atcg" }

fun saisirADN(): String {
    var saisie: String?
    do{
        println("Saisir l'ADN (a,t,c,g)")
        saisie = readLine()
    } while (saisie.isNullOrBlank() || !verifierADN(saisie))
    return saisie
}

fun proportion(adn: String, sequence:String) : Double {
    if (sequence.isEmpty() || sequence.length > adn.length) return 0.0

    val adnNorm = adn.uppercase()
    val seqNorm = sequence.uppercase()

    var compteur = 0
    val maxPositions = adnNorm.length - seqNorm.length

    for (i in 0 ..maxPositions) {
        if (adnNorm.substring(i, i + seqNorm.length) == seqNorm) {
            compteur++
        }
    }
    return (compteur.toDouble() / (maxPositions +1)) * 100.0
}
