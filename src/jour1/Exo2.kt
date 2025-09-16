package jour1

fun main () = println(soustraire(2,1))

fun soustraire (a:Int, b: Int) : Int {
    println("je soustrais $a et $b, c'est égal à:")
    return a - b
}