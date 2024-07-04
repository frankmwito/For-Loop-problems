import java.util.Scanner

fun main()  {
    println("Enter the length of array:")
    val reader = Scanner(System.`in`)

    val n = reader.nextInt()
    val array = IntArray(n)
    for(i in 0 until n){
        println("Enter the values of the array:")
        array[i] = reader.nextInt()

    }
    println("${array.contentToString()}")
}