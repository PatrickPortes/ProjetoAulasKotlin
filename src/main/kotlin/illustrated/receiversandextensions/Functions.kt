package illustrated.receiversandextensions

//Standalone Functions and Object Functions:

fun main() {


    //Functions that stand alone, apart from an object:

    //A simple function to wrap a string in single quotes:
    fun singleQuoted(original: String) = "'$original'"

    //Calling a simple function:
    val title = "The Robots from Planet X3"
    val quotedTitle = singleQuoted(title)

    println(quotedTitle) // 'The Robots from Planet X3'



    //Functions that are called on an object:

    //Calling a function on an object:
    val title1 = "The Robots from Planet X3"
    val loudTitle = title1.uppercase()    // dot notation

    println(loudTitle) // THE ROBOTS FROM PLANET X3



    /*
    Calling three functions to change a string - two functions are
    on an object and another is a standalone function:
    */
    singleQuoted(title.removePrefix("The ")).uppercase()




}