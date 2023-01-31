// Enumerations/Task1.kt
package enumerationsExercise1

import enumerationsExercise1.Direction.*

enum class Direction {
    UP, DOWN, LEFT, RIGHT
}

class Robot {
    var x = 0
    var y = 0

    fun go(direction: Direction, steps: Int) {
        when (direction) {
            UP -> if (steps < y) y -= steps else y = 0
            DOWN -> y += steps
            LEFT -> if (steps < x) x -= steps else x = 0
            RIGHT -> x += steps
        }
    }

    val location: String
        get() = "($x, $y)"
}

fun main() {
    val robot = Robot()
    println(robot.location)
    robot.go(RIGHT, 1)
    println(robot.location)
    robot.go(DOWN, 2)
    println(robot.location)
}
/* Output:
(0, 0)
(1, 0)
(1, 2)
*/