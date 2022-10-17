package ytb.oop.example2

class MotorEletrico: MotorImpl() {

    private var nivelBateria: Int = 1

    override fun temAutonomia(): Boolean {
        return nivelBateria > 0
    }

    override fun gastando(){
        println("Nivel Atual Combustivel: $nivelBateria")
        nivelBateria--
    }

}