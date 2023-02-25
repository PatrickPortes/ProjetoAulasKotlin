package illustrated.scopefunctions

fun main() {


    //Replacing the singleQuoted() extension function with a call to the run() function:

    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .run { "'$this'" }
        .uppercase()

    // 'ROBOTS FROM PLANET X3'


    //Single-quoting a title with the let() function:

    val title1 = "The Robots from Planet X3"
    val newTitle1 = title1
        .removePrefix("The ")
        .let { titleWithoutPrefix -> "'$titleWithoutPrefix'" }
        .uppercase()

    // 'ROBOTS FROM PLANET X3'

    //Single-quoting a title with the let() function, using the implicit it lambda parameter:
    val title2 = "The Robots from Planet X3"
    val newTitle2 = title1
        .removePrefix("The ")
        .let { "'$it'" }
        .uppercase()

    // 'ROBOTS FROM PLANET X3'


    //Using also() in a call chain to print out a value:
    val title3 = "The Robots from Planet X3"
    val newTitle3 = title3
        .removePrefix("The ")
        .also { println(it) } // Robots from Planet X3
        //.singleQuoted()
        .uppercase()

    // 'ROBOTS FROM PLANET X3'

    //Using also() with a function reference.
    val title4 = "The Robots from Planet X3"
    val newTitle4 = title4
        .removePrefix("The ")
        .also(::println) // Robots from Planet X3
        //.singleQuoted()
        .uppercase()

    // 'ROBOTS FROM PLANET X3'


    //Using apply() to print out the value in a call chain. This works, but most Kotlin developers favor also() for this situation:

    val title5 = "The Robots from Planet X3"
    val newTitle5 = title5
        .removePrefix("The ")
        .apply { println(this) } // Robots from Planet X3
        //.singleQuoted()
        .uppercase()

    // 'ROBOTS FROM PLANET X3'



    /*
    Using apply() to initialize a DropTarget immediately after constructing it.
    It’s constructed and initialized in a single expression:

    val dropTarget = DropTarget().apply {
        addDropTargetListener(myListener)
    }
     */

}
