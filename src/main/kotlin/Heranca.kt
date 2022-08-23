open class Animal{

    open fun dormir(){
        println("Dormir!!!")
    }

}

class Cao: Animal(){

    fun latir() {
        println("AU AU AU")
    }

    override fun dormir(){

        super.dormir()
        println("Igual um Cao!!!")
    }
}

class Gato: Animal(){

    fun miar(){
        println("Meoowwnnnn")
    }

}

fun main(args: Array<String>){

    val cao = Cao()
    cao.latir()
    cao.dormir()

    val gato = Gato()
    gato.miar()
    gato.dormir()

}