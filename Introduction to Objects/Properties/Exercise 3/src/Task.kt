// Properties/Task3.kt
package propertiesExercise3

class Robot {
  var x = 0
  var y = 0

  private fun isOverBoundary(pos: Int): Boolean =
    pos !in 0..100

  fun right(steps: Int) {
    x += steps
    while (isOverBoundary(x)) x-=100
  }

  fun left(steps: Int) {
    x -= steps
    while (isOverBoundary(x)) x+=100
  }

  fun down(steps: Int) {
    y += steps
    while (isOverBoundary(y)) y-=100
  }

  fun up(steps: Int) {
    y -= steps
    while (isOverBoundary(y)) y+=100
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/