package ytb.oop.example1

class Dog constructor() {

    var name: String? = null
    var owner: Human? = null

    fun dogBarking(){
        println("Bark!!")
    }

    fun dogBiting(){
        println("Bite!!")
    }

    fun dogTalking(){
        println("Hi, My name's $name and my owner is ${owner?.name}, i can talk!!!")
    }

    fun dogRunning() {
        println("Run!!")
    }
}