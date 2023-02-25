package illustrated.interfaces

//Multiple Interfaces

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}


class Sheep(override val name: String) : Speaker, Named {
    override fun speak() = println("Mee!")
}

//Default Functions in Interfaces:

//A default implementation in an interface:
interface Speaker1 {
    fun speak() {
        println("...")
    }
}


//Default Properties in Interfaces

//you can create a getter for the property, because you can’t just directly assign a value:

interface Named1 {
    val name: String get() = "No name"
}