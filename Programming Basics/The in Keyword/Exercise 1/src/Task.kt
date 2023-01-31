// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var res= ""
  for (i in 'a'..'z'){
    res += i
  }
  return res
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}