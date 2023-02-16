package illustrated

// Function Types: (references)

fun main(){

    fun discountFiveDollars(price: Double): Double = price - 5.0

    //val discountedPrice = discountFiveDollars(20.0) // Result is 15.0 (assigning the result of a function call)

    val applyDiscount = ::discountFiveDollars   // Function Reference   (assigning the function itself)

    val discountedPrice = applyDiscount(20.0)

    println(discountedPrice)

}

// A function’s type can be assembled by:
//val applyDiscount: (Double) -> Double = ::discountDollars
