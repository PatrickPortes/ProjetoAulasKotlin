package illustrated

//Passing Functions to Functions:

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

    fun discountFiveDollars(price: Double): Double = price - 5.0
    fun discountTenPercent(price: Double): Double = price * 0.9
    fun noDiscount(price: Double): Double = price


    /*
    val withFiveDollarsOff = calculateTotal(20.0, ::discountFiveDollars) // $16.35
    val withTenPercentOff  = calculateTotal(20.0, ::discountTenPercent)  // $19.62
    val fullPrice          = calculateTotal(20.0, ::noDiscount)          // $21.80
     */


    fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
        "FIVE_BUCKS" -> ::discountFiveDollars
        "TAKE_10"    -> ::discountTenPercent
        else         -> ::noDiscount
    }

    val withFiveDollarsOff = calculateTotal(20.0, discountForCouponCode("FIVE_BUCKS")) // $16.35
    val withTenPercentOff  = calculateTotal(20.0, discountForCouponCode("TAKE_10"))    // $19.62
    val fullPrice          = calculateTotal(20.0, discountForCouponCode("NONE"))       // $21.80

    println(withFiveDollarsOff)
    println(withTenPercentOff)
    println(fullPrice)

}