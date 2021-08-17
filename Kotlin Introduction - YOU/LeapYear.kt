fun main(){
    var year = 2012
    if (year % 400 ==0){
        println("$year is a leap year")
    }else if (year % 100 == 0){
        println("$year is not a leap year")
    }else if (year % 4 == 0){
        println("$year is a leap year")
    }else {
        println("$year is not a leap year")
    }
}