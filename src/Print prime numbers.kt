import java.util.Scanner

fun main() {
    println("Enter any number of your choice:")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    println("Prime numbers between 1 and $n are:")
    for (i in 2..n) {
        if (isPrime(i)) {
            println(i)
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }
    return true
}
