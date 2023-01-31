// CreatingClasses/Task5.kt
package creatingClassesExercise5

fun cap(s: String) = s.replaceFirstChar { it.uppercase() }

fun main() {
    println(cap("hi!"))
    println(cap("Hi!"))
}
/* Output:
Hi!
Hi!
 */