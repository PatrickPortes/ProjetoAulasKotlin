package illustrated.collections

// Loops and Iterations:

fun main(){

    //list
    val booksToRead: MutableList<String> = mutableListOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery",
    )
    //println(booksToRead)

    //see the list vertically
    /*booksToRead.forEach { element ->
        println(element)
    }
     */
    /* or (same result)
    booksToRead.forEach { println(it) }
    booksToRead.forEach(::println)
    */

    //Converting Elements (map):
    val sortableTitles = booksToRead.map { title ->
        title.removePrefix("The ")
    }
    //println(sortableTitles)


    //Sorting Collections (sorted):
    val sortedTitles = booksToRead.map { title -> title.removePrefix("The ") }.sorted()
    //println(sortedTitles)


    //Filtering Collections: Including and Omitting Elements
    /*
    val booksForNolan = booksToRead
        .map { title -> title.removePrefix("The ") }
        .sorted()
        .filter { title -> title.contains("Mystery") }

    println(booksForNolan)
     */


    /*
                Collection Operation Chains:
    Note: The list that’s created by the final operation, filter(),
    is the list that is assigned to the variable booksForNolan.
     */

    val booksForNolan = booksToRead
        .map { title -> title.removePrefix("The ") }
        .sorted()
        .filter { title -> title.contains("Mystery") }

    println(booksForNolan)

}