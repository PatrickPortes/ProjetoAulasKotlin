package illustrated.interfaces

fun main() {

    //Using FarmAnimal in a List to put multiple implementations into a single collection:

    val sue = Farmer("Sue")

    val animals: List<FarmAnimal> = listOf(
        Chicken("Henrietta"),
        Pig("Hamlet", 1),
        Cow("Dairy Godmother"),
    )

    animals.forEach { sue.greet(it) }



    //Smart Casts

    //Using an if conditional with is to perform a smart cast:
    fun greet(animal: FarmAnimal) {
        println("Hello, ${animal.name}!")
        if (animal is Chicken) {
            println("I see you have ${animal.numberOfEggs} eggs today!")
        }
        animal.speak()
    }



    //Explicit Casts

    //An explicit safe cast: (using as?):
    /*
    fun greet(animal: FarmAnimal) {
        println("Hello, ${animal.name}!")

        val chicken: Chicken? = animal as? Chicken
        chicken?.let { println("I see you have ${it.numberOfEggs} eggs today!") }

        animal.speak()
    }
     */

}