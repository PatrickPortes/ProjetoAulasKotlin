package illustrated.delegation

interface Eater {
    fun eat()
}

class Muncher(private val food: String) : Eater {
    override fun eat() = println("Eating $food - munch, munch, munch!")
}

class Scarfer(private val food: String) : Eater {
    override fun eat() = println("Scarfing down $food - NOM NOM NOM!!!")
}

class Cow : Eater by Muncher("grass")

class Chicken : Eater by Muncher("bugs")

class Pig : Eater {
    override fun eat() = println("Scarfing down corn - NOM NOM NOM!!!")
}

//or you can do like that:
class Pig1 : Eater by Scarfer("corn")

fun main() {

    Cow().eat()     // Eating grass - munch, munch, munch!
    Chicken().eat() // Eating bugs - munch, munch, munch!
    Pig().eat()     // Eating corn - munch, munch, munch!
    Pig1().eat()    // Scarfing down corn - NOM NOM NOM!!!

}