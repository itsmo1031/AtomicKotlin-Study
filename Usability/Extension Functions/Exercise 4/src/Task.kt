// ExtensionFunctions/Task4.kt
package extensionFunctionsExercise4

import atomictest.eq

class Book(val title: String)

fun categorize(book: Book, category: String) =
    """title: "${book.title}", category: $category"""

fun main() {
    val book = Book("Dracula")
    categorize(book, "Vampire") eq
            """title: "Dracula", category: Vampire"""
}