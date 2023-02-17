package illustrated.collections

//  Regular Kotlin List:

fun main(){

    var booksToRead: List<String> = listOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery",
    )

    //Adding and Removing an Element:

    /*
        Declaring a collection variable with var does not change the fact that
        the list itself is immutable. We had to create a new list by using a plus
        or minus operator, because regular Kotlin List doesn’t allow changes to it:
    */

    booksToRead = booksToRead + "Beyond the Expanse" - "Among the Aliens"

    println(booksToRead)
}