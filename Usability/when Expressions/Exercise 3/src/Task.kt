// WhenExpressions/Task3.kt
package whenExpressionsExercise3

import atomictest.eq

fun balanced(input: String): Boolean {
    var idx = 0
    for (ch in input) {
        when (ch) {
            '(' -> idx++
            ')' -> idx--
            ' ' -> continue
            else -> throw IllegalArgumentException()
        }
        if (idx < 0) return false
    }
    return idx == 0
}

fun main() {
    balanced("(()) ()") eq true
    balanced(")(") eq false
}