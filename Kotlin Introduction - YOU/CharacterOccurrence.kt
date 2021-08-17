import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val str = scan.nextLine()
    val count = IntArray(256)

    for (element in str) {
        count[element.toInt()]++
    }
    val ch = CharArray(str.length)
    for (i in str.indices) {
        ch[i] = str[i]
        var found = 0
        for (j in 0..i) {
            if (str[i] != ' ') {
                if (str[i] == ch[j]) {
                    found++
                }
            }
            if (found == 1) {
                println(str[i].toString() + "-" + count[str[i].toInt()])
            }
        }
    }
}