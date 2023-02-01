// IntroGenerics/Task2.kt
package introductionToGenericsExercise2

import atomictest.eq

fun <T> List<T>.reversed(): List<T> {
    val result = mutableListOf<T>()
    forEach {
        result.add(0, it)
    }
    return result
}

fun main() {
    val list = listOf(1, 2, 3)
    list.reversed() eq listOf(3, 2, 1)
}