fun main() {
    val arr = intArrayOf(10, 10, 20, 20, -20)
    var count: Int
    var temp = false

    for (i in arr.indices) {
        count = 1
        for (j in arr.indices) {
            if (arr[i] == arr[j] && i != j) {
                count++
            }
        }
        if (count == 1) {
            temp = true
            print(arr[i].toString() + ", ")
        }
    }
    if (!temp) println("Nothing is unqiue")
}