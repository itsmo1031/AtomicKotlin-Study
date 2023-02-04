// LocalFunctions/Task3.kt
package localFunctionsExercise3

import atomictest.eq

fun createContainer(): Pair<(Int) -> Unit, () -> Int?> {
    val container = mutableListOf<Int>()

    fun append(n: Int) {
        container.add(n)
    }

    fun del() = container.removeLastOrNull()

    return Pair(::append, ::del)
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}