package jour2.model

class Student (val name: String, val age: Int) {
    init {
        count++
        println("Étudiant ajouté")
    }

    companion object {
        var count: Int = 0
            private set

        fun showCount(){
            println("nombre d'étudiant créés: $count")
        }
    }
}