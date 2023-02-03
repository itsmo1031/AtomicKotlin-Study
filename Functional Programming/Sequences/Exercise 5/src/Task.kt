// Sequences/Task5.kt
package sequencesExercise5

fun School.instructorsWithLargestClass(): Set<Instructor> {
    val largestClass = lessons.maxByOrNull { it.students.size }
    return lessons
        .filter { largestClass!!.students.size == it.students.size }
        .map { it.instructor }.toSet()

}