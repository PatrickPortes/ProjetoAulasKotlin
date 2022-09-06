fun main(args: Array<String>) {

    /*
    for (i in 0..20){
        println("$i")
    }
     */

    //step(2)

    letters()

}

fun downTo(){

    for (i in 20 downTo 0){
        println("$i")
    }
}

fun until(){

    //i < 20
    for (i in 1 until 20){
        println("$i")
    }
}

fun step(num:Int){

    for (i in 0..20 step num){
        println("$i")
    }
}

fun letters(){

    val sArray= "Olha essa String!"

    //Tamanho do array
    //Casa posição do array
    for (l in sArray){
        //l(index)
        println(l.toUpperCase())
        //print(l.toUpperCase()+ " ")
    }
}