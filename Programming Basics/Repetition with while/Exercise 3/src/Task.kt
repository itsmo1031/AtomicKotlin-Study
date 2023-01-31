// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
    var i = 0
    var result = 0
    while (i <= n) {
        result += i
        i += 2
    }
    return result
}

fun main() {
    println(sumOfEven(10))  // 30
}