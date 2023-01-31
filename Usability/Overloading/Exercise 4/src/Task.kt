// Overloading/Task4.kt
package overloadingExercise4

import atomictest.eq

fun f(n: Int = 0, i: Int = 373) = n + i

fun main() {
    f() eq 373
}