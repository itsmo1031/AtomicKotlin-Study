// Visibility/Task1.kt
package constrainingVisibilityExercise1

class Alien(val name: String, val species: String, private var planet: String) {
    fun movePlanet(dest: String) {
        planet = dest
    }

    override fun toString(): String {
        return "Alien $name, $species: $planet"
    }
}

fun main() {
    val arthricia = Alien("Arthricia", "Cat Person", "PurgePlanet")
    val dale = Alien("Dale", "Giant", "Gearworld")

    println(arthricia)
    println(dale)

    arthricia.movePlanet("Earth C-137")
    dale.movePlanet("Parblesnops")

    println(arthricia)
    println(dale)
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/