package illustrated.scopefunctions

// Statement Scopes:

/*
class Circle1(val radius: Double) {
    fun circumference(): Double {
        val result = pi * diameter()
        fun diameter() = radius * 2
        return result
    }
}
 */

//You can only use something that was declared in a statement scope after the point where it was declared:

class Circle1(val radius: Double) {
    fun circumference(): Double {
        fun diameter() = radius * 2
        val result = pi * diameter()
        return result
    }
}

//A function body is one example of a statement scopes. Other examples include constructor bodies, lambdas, and Kotlin Script files (when your file ends in .kts).


// Declaration Scopes:

class Circle2(val radius: Double) {
    val circumference = pi * diameter()
    fun diameter() = radius * 2
}

//A class body is one example of a declaration scope. The top level of a regular Kotlin file (when it ends in .kt) is another example.

