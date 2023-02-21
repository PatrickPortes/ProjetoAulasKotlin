package illustrated.collections

fun main() {

    val toolbox = mapOf(   //It's possible to use type inference
        "Nail" to "Hammer",
        "Hex Nut" to "Wrench",
        "Hex Bolt" to "Wrench",
        "Slotted Screw" to "Slotted Screwdriver",
        "Phillips Screw" to "Phillips Screwdriver",
    )

    //Looking Up a Value
    val tool = toolbox.get("Nail")
    println(tool) // Hammer

    //Indexed access operator to get a value:
    val tool1 = toolbox["Nail"]
    println(tool) // Hammer

    //val anotherTool = toolbox.get("Wing Nut") // it will return a null
    //val anotherTool1 = toolbox.getValue("Wing Nut") // Error at runtime
    //val tool = toolbox.getOrDefault("Hanger Bolt", "Hand") // Provide a default value if the key does not exist in the map


    //Modifying a Map
    val toolboxMutable = mutableMapOf(
        "Nail" to "Hammer",
        "Hex Nut" to "Wrench",
        "Hex Bolt" to "Wrench",
        "Slotted Screw" to "Slotted Screwdriver",
        "Phillips Screw" to "Phillips Screwdriver",
    )

    //add a new entry:
    //toolboxMutable.put("Lumber", "Saw")

    /* Kotlin's developers typically use the indexed access operator
       instead of calling the put() function directly:             */
    toolboxMutable["Lumber"] = "Saw"


    //change an existing value:
    toolboxMutable["Hex Bolt"] = "Nut Driver"

    //remove an entry:
    toolboxMutable.remove("Lumber")

    /*
    Note that although you can change a value, you cannot change a key.
    Instead, you can remove a key and insert a new entry.
     */
    toolboxMutable["Cross Recess Screw"] = "Phillips Screwdriver"


}