// Sequences/Task3.kt
package sequencesExercise3

fun School.averageInstructorRating(instructor: Instructor): Double {
    val result = mutableListOf<Double>()
    lessons.filter { it.instructor == instructor }
        .forEach {
            result.add(it.rating.values.reduce { acc, i -> acc + i } / it.rating.size.toDouble())
        }
    return result.average()
}