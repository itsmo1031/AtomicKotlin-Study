// Sequences/Task2.kt
package sequencesExercise2

fun School.studentInstructors(
    student: Student
): Set<Instructor> {
    val result = mutableSetOf<Instructor>()
    lessons.filter { student in it.students }.mapTo(result) {
        it.instructor
    }
    return result
}

fun School.studentsOf(
    instructor: Instructor
): Set<Student> {
    val result = mutableSetOf<Student>()
    lessons.filter { instructor == it.instructor }.flatMapTo(result) {
        it.students
    }
    return result
}