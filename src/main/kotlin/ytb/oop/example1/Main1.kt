package ytb.oop.example1

fun main(){

    val edward = Human()
    edward.name= "Edward"

    val dog = Dog()
    dog.name = "Shiro"
    dog.owner = edward
    dog.dogTalking()
    dog.dogRunning()
    dog.dogBarking()
    dog.dogBiting()

    val teach = Human()
    teach.name= "Teach"

    val dog2 = Dog()
    dog2.name = "Kuro"
    dog2.owner = teach
    dog2.dogTalking()
    dog2.dogRunning()
    dog2.dogBarking()
    dog2.dogBiting()

}