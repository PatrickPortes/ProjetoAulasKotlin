package illustrated.collections

//  The following code demonstrates the same operations as we did in Map1.kt, but on an immutable map

fun main() {

    var toolbox = mapOf(
        "Nail" to "Hammer",
        "Hex Nut" to "Wrench",
        "Hex Bolt" to "Wrench",
        "Slotted Screw" to "Slotted Screwdriver",
        "Phillips Screw" to "Phillips Screwdriver",
    )

// Add an entry
    toolbox = toolbox + Pair("Lumber", "Saw")

// Update an entry
    toolbox = toolbox + Pair("Hex Bolt", "Nut Driver")

// Remove an entry
    toolbox = toolbox - "Lumber"

// Simulate changing a key
    toolbox = toolbox - "Phillips Screw"
    toolbox = toolbox + Pair("Cross Recess Screw", "Phillips Screwdriver")

}