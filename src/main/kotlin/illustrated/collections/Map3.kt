package illustrated.collections

// Map Operations

fun main() {

    var toolbox = mapOf(
        "Nail" to "Hammer",
        "Hex Nut" to "Wrench",
        "Hex Bolt" to "Wrench",
        "Slotted Screw" to "Slotted Screwdriver",
        "Phillips Screw" to "Phillips Screwdriver",
    )

    // forEach() function:
    toolbox.forEach { entry ->
        println("Use a ${entry.value} on a ${entry.key}")
    }

    // Filtering:

    //value
    val screwdrivers = toolbox.filter { entry ->
        entry.value.contains("Screwdriver")
    }

    //key
    val screwdrivers1 = toolbox.filter { entry ->
        entry.key.contains("Screw")
    }


    //Mapping:
    val newToolbox = toolbox
        .mapKeys { entry -> entry.key.replace("Hex", "Flange") }
        .mapValues { entry -> entry.value.replace("Wrench", "Ratchet") }


    //Setting Default Values using Mapping:
    val tool = toolbox.getOrDefault("Hanger Bolt", "Hand")
    val anotherTool = toolbox.getOrDefault("Dowel Screw", "Hand")
    val oneMoreTool = toolbox.getOrDefault("Eye Bolt", "Hand")


    /*
    Instead default values, you can use an operation called
    withDefault(), which will return a new map based on the original:
     */
    toolbox = toolbox.withDefault { key -> "Hand" }


    //getValue()
    val tool1 = toolbox.getValue("Hanger Bolt")
    val anotherTool1 = toolbox.getValue("Dowel Screw")
    val oneMoreTool1 = toolbox.getValue("Eye Bolt")

}