import java.util.*

fun main() {
    println("Enter any word:")
    val reader = Scanner(System.`in`)

    val word = reader.next()
    var reverseWord = ""
    for (i in word.length -1 downTo 0){
        reverseWord += word[i]
    }
    println(reverseWord)


}