const val MIN_AGE= 16
const val MAX_AGE= 68

fun main(args: Array<String>) {

    //Operadores In e Range
    val number = listOf<Int>(1,3,5,8,2,9,15,14,12,20,4)

    //println(12 in number)
    //println(32 in 0..20)

    //Operadores Lógicos
    var age = (1..100).random()
    println("A idade e de: "+ age)

    println(age in MIN_AGE..MAX_AGE)

    //Operadores Comparativos
    if (age >= MIN_AGE && age <= MAX_AGE){
        println("A pessoa pode doar sangue!")
    } else{
        println("A pessoa nao pode doar sangue!")
    }
}
