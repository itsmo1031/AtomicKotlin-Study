// Summary2/Task1.kt
package summaryIIExercise1
import atomictest.eq

class Boring{
    fun a() = 1.618
    fun b() = "ratio"
    fun c() = 11
}

fun main() {
  val b = Boring()
    b.a() eq 1.618
    b.b() eq "ratio"
    b.c() eq 11
}