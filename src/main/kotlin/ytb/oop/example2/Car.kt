package ytb.oop.example2

class Car constructor(
    private val engine: Engine
){
    var color: String? = null

    fun ligarCarro(){
        println("Ligando o Carro!")
        engine.ligar()
    }

    fun desligarCarro(){
        println("Desligando o Carro!")
        engine.desligar()
    }

    fun drive(){
        if (engine.estaLigado()){
            println("VRUMMMMMMMM")
        } else{
            println("LIGA O CARRO PRIMEIRO NE!")
        }
    }

    fun honk(){
        println("FONNNN")
    }

    fun brak(){
        println("Braking the Car!")
    }

    fun gear(){
        println("Changing Gear")
    }

}