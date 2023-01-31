// Summary2/Task2.kt
package summaryIIExercise2
import atomictest.eq

class Boring2(val a:Double, val b:String, val c:Int){
  fun a() = a
  fun b() = b
  fun c() = c
}

fun main() {
  val b2 = Boring2(1.618,"ratio",11)
  b2.a eq b2.a()
  b2.b eq b2.b()
  b2.c eq b2.c()
}