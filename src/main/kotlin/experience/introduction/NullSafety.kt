package experience

fun main(){

    //Precisa do ? para ser atribuído o valor nulo na variável

    var neverNull: String = "This can't be null"            // 1
    //neverNull = null                                        // 2

    var nullable: String? = "You can keep a null here"      // 3
    nullable = null                                         // 4


    var inferredNonNull = "The compiler assumes non-null"   // 5
    //inferredNonNull = null                                  // 6

    //Pega o tamanho de caracteres do valor das Strings
    fun strLength(str: String?): Int {                   // 7
        return str?.length ?: 0
    }

    println(strLength(neverNull))                       // 8
    println(strLength(nullable))                        // 9

}