package ytb.oop.example2

fun main(){

    val motorCombustao = MotorCombustao()
    val fuca = Car(motorCombustao)
    fuca.ligar()
    fuca.drive()
    fuca.drive()
    fuca.drive()
    fuca.desligar()

    val motorEletrico = MotorEletrico()
    val tesla = Car(motorEletrico)
    tesla.ligar()
    tesla.drive()
    tesla.drive()
    tesla.desligar()

}