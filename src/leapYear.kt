import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    var year = s.nextInt()
    if ((year%4==0) &&(year%100!=0) || year%400 ==0) println("LEAP YEAR") else println("Not Leap Year")
}