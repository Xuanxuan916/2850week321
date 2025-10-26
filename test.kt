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