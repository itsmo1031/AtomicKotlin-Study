// ManipulatingLists/Task1.kt
package manipulatingListsExercise1

import atomictest.eq

fun <T> List<T>.zipWithIndex(): List<Pair<T, Int>> =
    zip(0..size)

fun main() {
    val list = listOf('a', 'b', 'c')
    list.zipWithIndex() eq
            "[(a, 0), (b, 1), (c, 2)]"
}