package illustrated.collections

// Collections: Maps

fun main() {

    // Associating Data:
    val association = Pair("Nail", "Hammer")
    println(association.first)  // Nail
    println(association.second) // Hammer


    //val association = "Nail".to("Hammer")
    val association2 = "Nail" to "Hammer"

    //Example without type inference:
    //val association: Pair<String, String> = "Nail" to "Hammer"


    //Creating a Map with mapOf()
    val toolbox: Map<String, String>  = mapOf(   //It's possible to use type inference
        "Nail" to "Hammer",
        "Hex Nut" to "Wrench",
        "Hex Bolt" to "Wrench",
        "Slotted Screw" to "Slotted Screwdriver",
        "Phillips Screw" to "Phillips Screwdriver",
    )

    //We could also have created the map like this:
    /*
    val toolbox = mapOf(
        Pair("Nail", "Hammer"),
        Pair("Hex Nut", "Wrench"),
        // ... and so on ...
    )
     */

    println(toolbox)

}