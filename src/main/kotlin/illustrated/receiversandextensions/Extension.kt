package illustrated.receiversandextensions

// Introduction to Extension Functions:

fun main() {

    //The original function from before:
    fun singleQuoted(original: String) = "'$original'"
    val title = "The Robots from Planet X3"
    val quotedTitle = singleQuoted(title)


    //An extension function that does the same thing as the previous listing:
    fun String.singleQuoted() = "'$this'"


    //How to call singleQuoted(), now that it’s an extension function:
    val quotedTitle1 = title.singleQuoted()


    //Adding a call to singleQuoted() in the middle of a call chain:
    val title1 = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .singleQuoted()
        .uppercase()

    // 'ROBOTS FROM PLANET X3'

    println(newTitle)



    //Nullable Receiver Types:

    val titleNullable: String? = null
    val newTitleNullable = title?.singleQuoted()


    //extension function that has a nullable receiver type:

    fun String?.singleQuoted() =
        if (this == null) "(no value)" else "'$this'"
    
}