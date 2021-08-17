fun main(args: Array<String>) {
    val arr = arrayOf("HTML", "CSS", "JAVA", "JS", "ANDROID")
    var count = 0
    var str = ""
    for (i in arr.indices) {
        str = arr[i]
        for (j in 0 until str.length) {
            if (str[j] != ' ') {
                count++
            }
        }
    }
    println(count)
}