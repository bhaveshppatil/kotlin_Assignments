fun main() {

    var values = arrayOf(1, 2, 3, 4, 5)
    println(averageCalc(values))
}

fun averageCalc(values: Array<Int>): Int {
    var sum = 0;
    for (i in values) {
        if (values.isEmpty()) {
            return 0
        } else {
            sum += i;
        }
    }
    return sum / values.size
}
