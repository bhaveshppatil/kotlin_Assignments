fun main() {

    for (i in 1..5) {
        if (i == 3) {
            break
        }
        for (j in 1..5) {
            println("$i.$j")
        }
    }
}