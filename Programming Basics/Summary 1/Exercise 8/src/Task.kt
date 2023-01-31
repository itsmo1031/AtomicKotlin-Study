// Summary1/Task8.kt
package summaryIExercise8
import kotlin.math.pow


fun reverseDecimal(number: Int): Int {
  var worker = number
  var result = 0
  var index = 10.toDouble().pow(number.toString().length-1).toInt()
  while (worker>0){
    val temp = worker%10
    result += temp*index
    worker /= 10
    index /= 10
  }
  return result
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}