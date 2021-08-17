fun main() {
    var input = readLine();
    var countriesList = arrayOf("india", "Japan", "China", "America", "England", "France")

    var count = 0;
    for (i in countriesList) {
        if (input.equals(i)){
            count++;
        }
    }
    if (count >= 1){
        print("Country Found")
    }else{
        print("Country not found")
    }
}

