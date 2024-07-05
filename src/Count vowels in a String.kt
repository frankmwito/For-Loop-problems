import java.util.Scanner

fun main()  {
    println("Enter any word:")
    val reader = Scanner(System.`in`)
    val vowels: String= "aeiou"
    var count  = 0

    val word = reader.next()
    for (ch in word){
        if (ch in vowels){
            count ++
        }
    }
    println(count)
}