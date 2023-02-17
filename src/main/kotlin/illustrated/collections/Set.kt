package illustrated.collections

fun main() {

    val booksBySlim: MutableSet<String> = mutableSetOf(
        "The Malt Shop Caper",
        "Who is Mrs. W?",
        "At Midnight or Later",
    )

    booksBySlim.add("The Malt Shop Caper")

    println(booksBySlim)
    // [The Malt Shop Caper, Who is Mrs. W?, At Midnight or Later]



    /*

    you can convert a list into a set, or the other way around:

    val bookList = listOf(
    "The Malt Shop Caper",
    "At Midnight or Later",
    "The Malt Shop Caper",
    )

    val bookSet = bookList.toSet()         // bookSet has two elements
    val anotherBookList = bookSet.toList() // anotherBookList also has two elements

     */

}