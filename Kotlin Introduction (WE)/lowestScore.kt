fun main(){
    var score = arrayOf(10, 20, 30, 5, 60,)
    var lowest = score[0];

    for (i in score){
        if (i < lowest){
            lowest = i
        }
    }
    print(lowest)
}