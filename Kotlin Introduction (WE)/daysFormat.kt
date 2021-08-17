fun main() {
    var day = "Monday"

    when (day) {
        "Monday" -> print("Mon")
        "Tuesday" -> print("Tue")
        "Wednesday" -> print("Wed")
        "Thursday" -> print("Thu")
        "Friday" -> print("Fri")
        "Saturday" -> print("Sat")
        "Sunday" -> print("Sun")
        else -> {
            print("Day not fount")
        }
    }
}