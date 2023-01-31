// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var i=1
  var res=0
  while (i<=number){
    res+=i++
  }
  return res
}

fun main() {
  println(sum(10))  // 55
}