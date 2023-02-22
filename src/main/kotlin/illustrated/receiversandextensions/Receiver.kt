package illustrated.receiversandextensions

//Introduction to Receivers:

class Dog {

    fun speak() {
        println("BARK!")
    }

    fun play() {
        //this.speak() //Explicit Receiver
        speak() //Implicit Receiver
    }
}

fun main() {

    val fido = Dog()
    fido.speak() //Explicit Receiver
    fido.play() //Explicit Receiver

}