// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
    var i = 0
    for (c in s) {
        if (c == ' ') continue
        if (++i % 5 == 0) println(c)
    }
}

fun main() {
    everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/