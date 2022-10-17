package ytb.oop.example2

abstract class MotorImpl : Motor {

    private var ligado: Boolean = false

    override fun ligar(){
        ligado = true
    }

    override fun desligar(){
        ligado = false
    }

    fun estaLigado(): Boolean{
        return ligado
    }

    abstract fun temAutonomia(): Boolean

    abstract fun gastando()

}