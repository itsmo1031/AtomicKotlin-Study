// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b: Int) = a + b

fun g(s1: String, s2: String) = s1 + s2

fun h() = println("h()")

fun main() {
    val fr: Int = f(1, 2)
    val gr: String = g("a", "b")
    val hr: Unit = h()
    println("Int")
    println("String")
    println("Unit")
}