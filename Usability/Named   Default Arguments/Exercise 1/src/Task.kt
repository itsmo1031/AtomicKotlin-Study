// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(
    private val side1: Double = 1.0,
    private val side2: Double = 2.0,
    private val color: String = "yellow"
) {
    override fun toString(): String {
        return "$color rectangle $side1 x $side2"
    }
}

fun main() {
    println(Rectangle())

    println(Rectangle(4.0, 5.0, "white"))
}