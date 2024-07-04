import java.util.Scanner

fun main()  {
    println("Enter maximum number you want to print:")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    for (i in 0..n){
        println(i)
    }
}