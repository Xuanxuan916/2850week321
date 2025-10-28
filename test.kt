fun generate_random_word():String {
    val letters =" ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
    val word = StringBuilder()
    for (i in 1..5){
        val randomIndex=(0 until letters.length).random()
        word.append(letters[randomIndex])
    }
    return word.toString()

}
fun isValid():Boolean {
    if(word.length != 5){
        return false
    }
    return is_all_letter(word)

}
fun is_all_letter(word:String):Boolean{
    for (char in word){
        if(char.isLetter()){
            continue
        else{return false}
        }
    }
    return true
}
fun pickRandomWord(word:MutableList<String>):String{
    val random_index=(0 until word.size).random
    val chosen=word.random
    word.removeAt(random_index)

}
return chosen
fun displayGuess(guess:String,matches:List<Int>){
    var display=""
    for (i in 0 until 5){
        if (match[i]=1){
            display+=guess[i]
        }
        else{
            display+= "?"
        }
    }
    println(display)
}
fun evaluateGuess(guess:String,target:String):List<Int>{
    var ans = mutableListOf<Int>()
    for (i in 0 until 5){
        if(guess[i]=target[i]){
            ans.add(1)
        else{
            ans.add(0)
        }
        }
    }
    if(guess.length != 5 || target.length != 5){
        throw IllegalArgumentException("guess and target should both contains exactly 5 letters")
    }
}