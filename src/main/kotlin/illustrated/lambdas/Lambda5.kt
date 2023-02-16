package illustrated.lambdas

import illustrated.taxMultiplier

// Lambdas with Multiple Statements:

fun main(){

    fun calculateTotal(
        initialPrice: Double,
        applyDiscount: (Double) -> Double
    ): Double {
        // Apply coupon discount
        val priceAfterDiscount = applyDiscount(initialPrice)
        // Apply tax
        val total = priceAfterDiscount * taxMultiplier

        return total
    }

    val withFiveDollarsOff = calculateTotal(20.0) { price ->
        val discountedPrice = price - 5.0
        println("Initial price: $price")
        println("Discounted price: $discountedPrice")
        discountedPrice
    }

    println(withFiveDollarsOff)

}