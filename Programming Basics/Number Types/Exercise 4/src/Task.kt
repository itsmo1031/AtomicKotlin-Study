// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
  (seconds+minutes*60L+hours*60L*60L)*1000L

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}