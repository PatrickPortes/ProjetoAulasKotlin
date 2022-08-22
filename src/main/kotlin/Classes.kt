class Casa {

    //Propriedades
    var cor: String = ""

    //Métodos
    fun abrirPorta(){
        println("Abrindo as Portas!!!")
    }

    fun abrirJanela(qtdJanelas: Int){
        println("Abrindo as Janelas!!! Um total de $qtdJanelas janelas foram abertas!!!")
    }

    fun abrirCasa(){
        this.abrirPorta()
        //this.abrirJanela()
    }

}


fun main(args: Array<String>){

    //Criando um Objeto em Kotlin
    var casa = Casa()
    casa.cor = "Azul"
    casa.abrirPorta()
    casa.abrirJanela(3)

    //casa.abrirCasa()

}
