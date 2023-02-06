// ComplexConstructors/Exercise2.kt
package complexConstructorsExercise2

import atomictest.eq

class SumChars(val text: String) {
    val sum: Int

    init {
        sum = calc()
    }

    private fun calc(): Int {
        return text.reduce { acc, it -> acc + it.code }.code
    }
}

fun main() {
    SumChars("What?").sum eq 467
}