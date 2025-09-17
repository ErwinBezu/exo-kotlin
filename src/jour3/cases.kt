package jour3

fun main() {
    println("CAS numéro 1")
    case1()
    println("CAS numéro 2")
    case2()
    println("CAS numéro 3")
    case3()
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
        println("Le nombre de clients restant : ${file.size}")
        println("Liste des clients restant : ${file.joinToString(", ")}")
    }
    println("C'est l'heure de l'apéro !!")
}

fun case3() {
    val notes = mutableMapOf<String, Int>()

    notes["Ducobu"] = 1
    notes["Titeuf"] = 0
    notes["Kid Paddle"] = 6
    notes["Astérix"] = 20

    val troisiemeNom = notes.keys.elementAt(2)
    notes[troisiemeNom] = 3
    println("Nouvelle note pour $troisiemeNom : ${notes[troisiemeNom]}/20")

    println("Dernier eleve ajouté: ${notes.keys.last()}")

//    println("Liste des élèves: ${notes.toList()}")
    println("Liste des élèves:")
    for ((nom, note) in notes) {
        println("$nom - $note/20")
    }
}