// Summary2/Task3.kt
package summaryIIExercise3

import atomictest.*

class FixedSizeHolder(private val max: Int) {
    private val container = mutableListOf<Any>()
    val size: Int
        get() {
            return container.size
        }

    val full: Boolean
        get() {
            return container.size == max
        }

    fun add(something: Any) {
        if (container.size == max) throw IllegalStateException("The container is full")
        container.add(something)
    }

}

fun main() {
    /*
      val holder = FixedSizeHolder(2)
      holder.add("What is the answer?")
      holder.add(42)
      holder.full eq true
      holder.size eq 2
      capture {
        holder.add("!!!")
      } eq "IllegalStateException: The container is full"
    */
}