fun main(){
    var divisible = numDivisible(30);
    print(divisible)
}

fun numDivisible(i: Int): Boolean{
    if (i % 5 == 0){
        return true
    }
    return false
}
