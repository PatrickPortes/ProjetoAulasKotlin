package illustrated.interfaces

interface FarmAnimal {
    val name: String
    fun speak()
}

class Farmer(val name: String) {

        fun greet(animal: FarmAnimal) {
            println("Good morning, ${animal.name}!")
            animal.speak()
        }
}

class Chicken(override val name: String, var numberOfEggs: Int = 0): FarmAnimal {
    override fun speak() = println("Cluck!")
}

class Pig(override val name: String, val excitementLevel: Int): FarmAnimal  {
    override fun speak() {
        repeat(excitementLevel) {
            println("Oink!")
        }
    }
}

class Cow(override val name: String): FarmAnimal {
    override fun speak() = println("Moo!")
}



fun main() {

    val sue = Farmer("Sue")
    val henrietta = Chicken("Henrietta")
    val astolfo = Pig("astolfo", 3)
    val mimosa = Cow("mimosa")

    sue.greet(henrietta)
    sue.greet(astolfo)
    sue.greet(mimosa)

}