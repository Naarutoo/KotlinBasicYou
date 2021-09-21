import java.util.*

fun main() {
    while (true){
        var s = Scanner(System.`in`)
        val amount = s.nextInt()
        println("Discount for purchase is "+discount(amount))
    }}
    fun discount(x:Int):Int {
        var discount = 0
        if (x > 300) {
            discount = (x * .1).toInt()
            if (discount > 300) return 100
        }
    return discount
    }
