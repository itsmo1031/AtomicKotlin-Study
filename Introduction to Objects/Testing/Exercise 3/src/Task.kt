// Testing/Task3.kt
package testingExercise3

import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int): Double = h * (x + y) / 2.0

fun main() {
    squareArea(1) eq 1
    squareArea(2) eq 4
    squareArea(5) eq 25
    rectangleArea(4, 3) eq 12
    trapezoidArea(3, 2, 2) eq 5
}