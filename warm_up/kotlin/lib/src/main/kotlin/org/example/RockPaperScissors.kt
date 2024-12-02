package org.example

// Rock Paper Scissors
// Let's play! You have to return which player won! In case of a draw return Draw!.
// Examples(Input1, Input2 --> Output):
// "scissors", "paper" --> "Player 1 won!"
// "scissors", "rock" --> "Player 2 won!"
// "paper", "paper" --> "Draw!"
// https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/kotlin

fun rps(p1: String, p2: String): String {
    return when {
        whoBeats[p2] == p1 -> "Player 1 won!"
        whoBeats[p1] == p2 -> "Player 2 won!"
        else -> "Draw!"
    }
}

val whoBeats =
        mapOf(
                "rock" to "paper",
                "paper" to "scissors",
                "scissors" to "rock",
        )
