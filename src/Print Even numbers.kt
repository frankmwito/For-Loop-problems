import java.util.Scanner

fun main() {
    println("Enter number of choice:")
    val reader = Scanner(System.`in`)

    val n = reader.nextInt()

    for (i in 0..n step 2){
        print("${i}\t")
    }
}