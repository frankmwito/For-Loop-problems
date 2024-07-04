import java.util.Scanner

fun main()  {
    println("Enter number of choice:")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var factorial = 1

    for (i in 1..n){
        factorial *= i
    }
    println(factorial)
}