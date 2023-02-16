package illustrated

//Lambdas and Higher-Order Functions

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

    fun discountFiveDollars(price: Double) = price - 5.0
    fun discountTenPercent(price: Double): Double = price * 0.9
    fun noDiscount(price: Double) = price

    val withFiveDollarsOff = calculateTotal(20.0) { price -> price - 5.0 }
    val withTenPercentOff  = calculateTotal(20.0) { price -> price * 0.9 }
    val fullPrice          = calculateTotal(20.0) { price -> price }


    fun printSubtotal(applyDiscount: (Double) -> Double) {
        val result = applyDiscount(20.0)
        val formatted = "$%.2f".format(result)
        println("A $20.00 haircut will cost you $formatted before tax.")
    }

    printSubtotal { price -> price - 5.0 }
    printSubtotal { price -> price * 0.9 }


}