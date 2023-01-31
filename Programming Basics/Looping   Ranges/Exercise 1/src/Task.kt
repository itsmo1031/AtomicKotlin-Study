// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var res=1L
  for (i in n downTo 1){
    res *= i
  }
  return res
}

fun main() {
  println(factorial(10))  // 3628800
}