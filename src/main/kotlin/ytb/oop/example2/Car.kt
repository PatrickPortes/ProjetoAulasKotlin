package ytb.oop.example2

class Car constructor(
    private val motor: MotorImpl
) : Motor by motor{

    var cor: String? = null

    fun drive(){

        when{
            !motor.estaLigado() -> println("LIGA O CARRO PRIMEIRO NE!")
            !motor.temAutonomia() -> {
                motor.desligar()

                when(motor) {
                    is MotorEletrico -> println("A Energia da Bateria Acabou!")
                    is MotorCombustao -> println("O Combustivel Acabou!")
                }
            }
            else -> {
                motor.gastando()

                when(motor) {
                    is MotorEletrico -> println("Carro Andando!")
                    is MotorCombustao -> println("Carro Andando! VRUM VRUM!")
                }
            }
        }

        /* IF ELSE:
        if (engine.estaLigado() && engine.temCombustivel()){
            println("VRUMMMMMMMM")
        } else if (!engine.temCombustivel()){
            println("O Combustivel Acabou!")
        } else {
            println("LIGA O CARRO PRIMEIRO NE!")
        }
        engine.gastandoCombustivel() */
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