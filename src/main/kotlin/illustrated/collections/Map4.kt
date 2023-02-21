package illustrated.collections

// Creating a Map from a List

fun main() {

    val tools = listOf(
        Tool("Hammer", 14, "Nail"),
        Tool("Wrench", 8, "Hex Nut"),
        Tool("Wrench", 8, "Hex Bolt"),
        Tool("Slotted Screwdriver", 5, "Slotted Screw"),
        Tool("Phillips Screwdriver", 5, "Phillips Screw"),
    )


    // Associating Properties from a List of Objects:
    val toolbox = tools.associate { tool ->
        tool.correspondingHardware to tool.name
    }

    // Associating Properties in the Reverse Order
    /*
    in this case, there are fewer entries in the map than elements in the original list,
    The original list has two Tool objects with a name of Wrench, so when associate() encounters
    the first one, it’s added to the map, but when it encounters the second, it replaces the first value.
     */
    val toolbox1 = tools.associate { tool ->
        tool.name to tool.correspondingHardware
    }


    //other variations of the associate() function:

    //keys are the tool names and the value is the Tool object:  associateBy()
    val toolsByName = tools.associateBy { tool -> tool.name }

    val hammer = toolsByName["Hammer"]


    //keys are the Tool object and the value is specified in the lambda:  associateWith()

    val toolWeightInPounds = tools.associateWith { tool ->
        tool.weightInOunces * 0.0625
    }

    val hammerWeightInPounds = toolWeightInPounds[hammer]


    //The associateBy() function also has a version that accepts two arguments:
    val toolbox2 = tools.associateBy({ it.correspondingHardware }, { it.name })


    //Grouping List Elements into a Map of Lists:
    val toolsByWeight = tools.groupBy { tool ->
        tool.weightInOunces
    }


    //Calling the groupBy() function with two arguments instead of one:
    val toolNamesByWeight = tools.groupBy(
        { tool -> tool.weightInOunces },
        { tool -> tool.name }
    )

}