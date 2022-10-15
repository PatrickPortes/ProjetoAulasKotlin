package ytb.oop.example2

class Engine {

    private var ligado: Boolean = false

    fun ligar(){
        ligado = true
    }

    fun desligar(){
        ligado = false
    }

    fun estaLigado(): Boolean{
        return ligado
    }
}