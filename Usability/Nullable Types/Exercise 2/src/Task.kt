// NullableTypes/Task2.kt
package nullableTypesExercise2

fun zilch(): String? = null
fun zilch2(): String? = zilch()

fun main() {
    val x = zilch()
    val y = zilch2()

    println(x)
    println(y)
}