fun main() {
    var arr = listOf<Int>(10, 10, 20, 20, -20)
    var count = 0;

    for (i in arr.indices) {
        count = 0;
        for (j in arr.indices) {
            if (arr[i] == arr[j] && i != j){
                count++;
            }
        }
        if (count >= 1){
            print(arr[i].toString() + ", ")
        }
    }
}