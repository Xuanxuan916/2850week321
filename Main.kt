
fun is_correct_guess(matches: List<Int>): Boolean {
    for (match in matches) {
        if (match == 0) {
            return false
        }
    }
    return true
}

fun main() {
    // WordleGuess
    // cmd: kotlinc Main.kt -include-runtime -d Main.jar && java -jar Main.jar

    println("Main.kt")

    println("=== Welcome to Wordle Guessing Game ===")

    var words = read_word_list("data/words.txt")

    if (words.isEmpty()) {
        println("Error: No words found in the word list!")
        generate_wordles(10, "data/words.txt")
        words = read_word_list("data/words.txt")
    }

    val targetWord = pickRandomWord(words)
    var won = false

    println("Choosen: " + targetWord)

    println("You have 10 attempts to guess the 5 letter word!\n")
    var win_attempt = 0
    for (attempt in 1..10) {
        val guess = obtainGuess(attempt)
        val result = evaluateGuess(guess, targetWord)

        displayGuess(guess, result)

        if (is_correct_guess(result)) {
            won = true
            win_attempt = attempt
            break
        }

        println()
    }

    println()
    if (!won) {
        println("Game over! The answer is '$targetWord'.")
    } else {
        println("Nice! You guessed the word '$targetWord' in $win_attempt attempts!")
    }
}