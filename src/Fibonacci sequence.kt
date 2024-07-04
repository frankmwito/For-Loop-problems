import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter the number of terms in the Fibonacci series:")
    val n = reader.nextInt()

    var first = 0
    var second = 1

    print("Fibonacci Series up to $n terms:")
    for (i in 1..n) {
        print(" $first")
        val sum = first + second
        first = second
        second = sum
    }
}
