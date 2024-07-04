import java.util.*

fun main() {
    println("Enter Maximum number of table:")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    for(i in 1..n){
        for (j in 1..n){
            print("${i * j}\t")
        }
        println()
    }
}