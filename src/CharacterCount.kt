fun main() {
    val array = arrayOf("HTML", "CSS", "JAVA", "JS", "ANDROID")
    var sum=0
    for (i in array.indices){
        sum+= array[i].length
    }
    println("Total characters are $sum")
}