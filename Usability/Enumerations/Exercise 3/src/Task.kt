// Enumerations/Task3.kt
package enumerationsExercise3

import atomictest.eq
import enumerationsExercise3.Result.*
import enumerationsExercise3.Rochambeau.*

enum class Rochambeau {
    ROCK, PAPER, SCISSORS
}

enum class Result {
    DRAW, FIRST_WINS, SECOND_WINS
}

fun winner(first: Rochambeau, second: Rochambeau): Result {
    if (first == second) return DRAW
    val result = second.ordinal - first.ordinal
    if (result == 1 || result == -2) return SECOND_WINS
    return FIRST_WINS
}

fun main() {
    winner(ROCK, SCISSORS) eq FIRST_WINS
    winner(SCISSORS, ROCK) eq SECOND_WINS
    winner(PAPER, PAPER) eq DRAW
}