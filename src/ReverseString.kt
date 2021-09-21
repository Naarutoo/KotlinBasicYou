import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    val str = s.next()
    var str2 = ""
    for (i in str.length-1 downTo 0) str2+=str[i]
    println(str2)
}