package dio

class Construtores (var cor: String, var vagasGaragem: Int) {

    /*
    //Propriedades
    var cor: String
    var vagasGaragem: Int
     */

    //Inicializando o Construtor Primário
    /*
    init {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    } */

    /*
    //Construtor utilizado igual em Java
    constructor(cor: String, vagasGaragem: Int){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    } */

    //Métodos
    fun detalhesCasa(){
        println("A casa tem a cor $cor, e $vagasGaragem vagas na garagem!")
    }

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
    var casa = Construtores("Azul", 2)

    /*
    casa.cor = "Azul"
    casa.vagasGaragem = 2
     */

    casa.detalhesCasa()

}