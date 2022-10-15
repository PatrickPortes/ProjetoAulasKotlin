fun exibirMensagem(nome: String, idade: Int){

    //Bloco de Código
    println("Alerta, Preencha Todos os Campos de Dados Necessarios!!! Nome: $nome Idade: $idade anos!!!")

}

fun somarValores(num1: Int, num2: Int): Int{

    var soma = num1 + num2

    //println(soma)

    return soma

}

fun main(args: Array<String>){

    /* exibirMensagem("Patrick", 23)
    exibirMensagem("Leticia", 32)
    exibirMensagem("Mariana", 28) */

    var resultado = somarValores(5,5)

    println(resultado)
}
