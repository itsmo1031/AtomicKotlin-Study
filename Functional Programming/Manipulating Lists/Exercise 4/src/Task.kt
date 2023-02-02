// ManipulatingLists/Task4.kt
package manipulatingListsExercise4

import atomictest.eq

class Person(
    val name: String
) {
    val friends: MutableList<Person> = mutableListOf()

    override fun toString() = "($name, friends: ${friends.map { it.name }})"
}

fun friendSuggestions(person: Person): Set<Person> {
    val result = mutableSetOf<Person>()
    person.friends.map {
        it.friends.map { f ->
            if (f !in person.friends && f != person) result.add(f)
        }
    }
    return result
}

fun main() {
    val alice = Person("Alice")
    val bob = Person("Bob")
    val charlie = Person("Charlie")

    alice.friends += bob
    bob.friends += alice
    bob.friends += charlie
    charlie.friends += bob

    friendSuggestions(alice) eq setOf(charlie)
}