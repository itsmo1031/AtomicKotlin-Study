// Summary2/Task5.kt
package summaryIIExercise5

fun va1(vararg nums: Int) {
    println("va1:")
    nums.forEach { println(it) }
}

fun va2(vararg nums: Int) {
    println("va2:")
    va1(*nums)
}

fun main() {
    /*
      va1(1, 2, 3)
      va2(4, 5, 6)
    */
}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */