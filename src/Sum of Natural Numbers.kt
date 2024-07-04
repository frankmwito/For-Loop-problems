import java.util.Scanner

fun main()  {
    println("Enter maximum number you want to sum up:")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var sum = 0

    for (i in 0..n){
        sum += i
    }
    println(sum)
}