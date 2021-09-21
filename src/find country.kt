import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val s = Scanner(System.`in`)
    val list:MutableList<String> = ArrayList()
    for (i in 0..9) list.add(s.next())
    val country =s.next()
    if (list.contains(country)) println("Country Found") else println("Country not found")
}