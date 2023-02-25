package illustrated.scopefunctions

// Introduction to Scopes

val pi = 3.14                       // Top-Level File Scope

class Circle(var radius: Double) {  // Constructor = Parameter Scope

    val diameter = radius * 2       // Class Body Scope

    fun circunference(): Double {
        return pi * diameter        // Function Body Scope
    }
}

fun createCircles(radii: List<Double>): List<Circle> {
    return radii.map { radius ->
        Circle(radius)              //Lambda Scope
    }
}

