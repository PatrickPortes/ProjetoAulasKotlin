package illustrated.lambdas

import illustrated.taxMultiplier

// How the examples ends up calling them to get the total:

fun main() {

    val taxMultiplier = 1.09

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

    // Using Closure in the nexts two fun:
    
    fun dollarAmountDiscount(dollarsOff: Double): (Double) -> Double =
        { price -> price - dollarsOff }

    fun percentageDiscount(percentageOff: Double): (Double) -> Double {
        val multiplier = 1.0 - percentageOff
        return { price -> price * multiplier }
    }

    fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
        "FIVE_BUCKS" -> dollarAmountDiscount(5.0)
        "NINE_BUCKS" -> dollarAmountDiscount(9.0)
        "TAKE_10"    -> percentageDiscount(0.10)
        "TAKE_15"    -> percentageDiscount(0.15)
        else         -> { price -> price }
    }

    val initialPrice = 20.0
    val couponDiscount = discountForCouponCode("FIVE_BUCKS")
    val total = calculateTotal(initialPrice, couponDiscount)

}