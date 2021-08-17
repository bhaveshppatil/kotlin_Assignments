fun main() {
    var input = readLine()
    var countries = arrayOf("India", "Aus", "England", "Canada", "India", "USA", "USA", "Japan", "China", "UK")

    for (i in countries.indices) {
        if (input.equals(countries[i])) {
            println(countries[i] + " " + i)
        }
    }
}