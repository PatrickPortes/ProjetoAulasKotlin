package illustrated.collections

// MutableList:

fun main(){

    /*
        When using a mutable list, you can use the add() and remove()
        functions to add or remove elements:
     */

    val booksToRead: MutableList<String> = mutableListOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery",
    )

    booksToRead.add("Beyond the Expanse")
    booksToRead.remove("Among the Aliens")

    println(booksToRead)


    //Getting an Element from a List:

    val firstBook = booksToRead[0]
    //val firstBook = booksToRead.get(0)
    println(firstBook) // Tea with Agatha
}