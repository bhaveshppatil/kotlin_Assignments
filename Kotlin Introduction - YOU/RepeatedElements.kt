import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()

    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = scan.nextInt()
    }
    var store = arr[0]
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (arr[i] == arr[j]) {
                store = arr[i]
                print("$store,  $store,")
            }
        }
    }
}