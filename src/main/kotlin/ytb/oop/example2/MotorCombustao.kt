package ytb.oop.example2

class MotorCombustao: MotorImpl() {


    protected var nivelCombustivel: Int = 2

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }

    override fun gastando(){
        println("Nivel Atual Combustivel: $nivelCombustivel")
        nivelCombustivel --
    }
}


/*
class MotorAlcool : MotorCombustao() {

    override fun gastando() {
        println("Nivel Atual Combustivel: $nivelCombustivel")
        nivelCombustivel -= 2
    }

}

class MotorGasolina : MotorCombustao() {

    override fun gastando() {
        println("Nivel Atual Combustivel: $nivelCombustivel")
        nivelCombustivel = nivelCombustivel--
    }
}
 */