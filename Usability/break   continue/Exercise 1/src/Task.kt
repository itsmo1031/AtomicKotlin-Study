// BreakAndContinue/Task1.kt
package breakAndContinueExercise1

import atomictest.*

fun readNumbers(vararg n: String) {
    var sum = 0
    for (it in n) {
        if (it == "0") break
        if (it.toIntOrNull() == null) trace("Not a number: $it")
        else sum += it.toInt()
    }
    trace("Sum: $sum")
}

fun main() {
    readNumbers("1", "a", "3", "10", "0", "19")
    trace eq """
    Not a number: a
    Sum: 14
  """
}