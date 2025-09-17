package jour3

fun main() {
    println("CAS numéro 1")
    case1()
    println("CAS numéro 2")
    case2()
}

fun case1() {
    val players = sortedSetOf<String>()

    players.add("Faker")
    players.add("Apex")
    players.add("Zywoo")
    players.add("Chovy")
    players.add("Uzi")
    players.add("Apex")
    println(players.joinToString(", "))
    println("Faker est inscrit ? ${players.contains("Faker")}")

    val finalPlayers = players.toSet()
    println("La liste définitive : ${finalPlayers.joinToString( " - ")}")
}

fun case2() {
    val file = ArrayDeque<String>()

    file.add("Cao Cao")
    file.add("Sun Jian")
    file.add("Liu Bei")
    file.add("Lu Bu")
    file.add("Xing Cai")

    while (file.isNotEmpty()) {
        println("Tapez la touche 'Entrer' pour le client suivant :")
        readLine()

        val client = file.removeFirst()
        println("Client en cours de traitement : ${client}")
        println("Liste des clients restant : ${file.joinToString(", ")}")
    }
    println("C'est l'heure de l'apéro !!")
}