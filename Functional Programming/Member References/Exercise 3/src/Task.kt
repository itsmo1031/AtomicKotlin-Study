// MemberReferences/Task3.kt
package memberReferencesExercise3

import atomictest.eq

val Int.isEven: Boolean
    get() = this % 2 == 0

// Returns all the divisors of the number
// except 1 and the number itself
private fun getNonTrivialDivisors(num: Int): List<Int> =
    List(num - 1) { it + 1 }.filter { num % it == 0 }


fun Int.isPrime(): Boolean {
    if (this == 1) return false
    for (x in 2 until this) {
        if (this % x == 0) return false
    }
    return true
}

fun isPerfect(num: Int): Boolean =
    getNonTrivialDivisors(num).sum() == num


fun main() {
    val range = 1..1000
    val even = range.filter(Int::isEven)
    even.size eq 500

    val prime = range.filter(Int::isPrime)
    prime.take(7) eq listOf(2, 3, 5, 7, 11, 13, 17)
    prime.takeLast(7) eq
            listOf(953, 967, 971, 977, 983, 991, 997)

    val perfect = range.filter(::isPerfect)
    perfect eq listOf(6, 28, 496)
    // 6 = 1 + 2 + 3
    // 28 = 1 + 2 + 4 + 7 + 14
}