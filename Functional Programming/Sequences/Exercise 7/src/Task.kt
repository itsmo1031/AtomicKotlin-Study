// Sequences/Task7.kt
package sequencesExercise7

fun oddWithoutDigitOne(): Sequence<Int> {
    val oddNumbers = generateSequence(1) { it + 2 }
    return oddNumbers.filterNot { it.toString().contains('1') }
}

fun main() {
    println(oddWithoutDigitOne().take(20).sum())
}