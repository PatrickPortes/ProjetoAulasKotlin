package illustrated

fun main(){

    val total = calculateTotalWithFiveDollarDiscount(25.0)
    println("$%.2f".format(total))
}


//First Example:

// Tax is 9%, so we'll multiply by 109% to get the total with tax included.
val taxMultiplier = 1.09

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    val total = priceAfterDiscount * taxMultiplier

    return total
}

fun calculateTotalWithTenPercentDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice * 0.9
    val total = priceAfterDiscount * taxMultiplier

    return total
}