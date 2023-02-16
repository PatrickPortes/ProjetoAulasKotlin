package illustrated

// Lambdas:

fun main(){

    /*
    fun discountFiveDollars(price: Double) = price - 5.0
    val applyDiscount: (Double) -> Double = ::discountFiveDollars
    */

    // Function Literal Called Lambda:
    //val applyDiscount: (Double) -> Double = { price: Double -> price - 5.0 }

    //Type Inference:
    //val applyDiscount: (Double) -> Double = { price -> price - 5.0 }

    //Implicit it Parameter:
    val applyDiscount: (Double) -> Double = { it - 5.0 }
}