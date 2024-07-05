import java.util.Scanner

fun main() {
    println("Enter the the max of even numbers:")
    val reader = Scanner(System.`in`)
    val n1 = reader.nextInt()
    println("Enter the max of odd numbers:")
    val n2 = reader.nextInt()
    var sum1 = 0
    var sum2 = 0

    for (i in 0..n1 step 2) {
        sum1 += i
    }
        for (j in 1..n2 step 2) {
            sum2 += j
        }
    println(sum1 + sum2)
}