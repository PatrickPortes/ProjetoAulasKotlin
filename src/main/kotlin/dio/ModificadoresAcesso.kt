open class Passaros {

    /*
    São palavras utilizadas para definir a visibilidade de propriedades/atributos e métodos.
    É um controle do que vai ser exibido, do que não vai ser exibido e onde pode ser exibido.

    = private --> Visível apenas dentro da classe.
    # protected --> Funciona como o private, mas é visível em subclasses.
    + public --> Visível em todos os lugares do código, caso não seja definido como padrão.
      internal --> Lembra o public, mas sua visibilidade é restringida ao módulo,
      sendo então visível dento de um mesmo módulo.
     */

    protected var nome: String = "Papagaio"

    fun voar(){
        println("Voando Nas Alturas!!!")
    }

}

class Papagaio : Passaros() {

    fun falar(){
        println("Estou Falando!!! Eu sou um $nome")
    }

}

class Canario : Passaros(){

}


fun main(args: Array<String>){

    val papagaio = Papagaio()
    papagaio.voar()
    papagaio.falar()

    val canario = Canario()
    canario.voar()

}