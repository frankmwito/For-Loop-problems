import java.util.Scanner

fun main() {
    println("Enter number of choice:")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    var sum = 0
    for (ch in n.toString()){
        sum += ch.toString().toInt()
    }
    println(sum)
}