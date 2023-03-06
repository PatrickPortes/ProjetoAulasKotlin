package illustrated.delegation

// Delegation:

interface KitchenStaff {
    val specials: List<String>
    fun prepareEntree(name: String): Entree?
    fun prepareAppetizer(name: String): Appetizer?
    fun prepareDessert(name: String): Dessert?
    fun receiveCompliment(message: String)
}

// Multiples Delegates:
interface BarStaff {
    fun prepareBeverage(name: String): Beverage?
    fun receiveCompliment(message: String)
}


class Chef : KitchenStaff {
    override val specials: List<String>
        get() = TODO("Not yet implemented")

    override fun prepareEntree(name: String): Entree? = when (name) {
        "Tossed Salad" -> Entree.TOSSED_SALAD
        "Salmon on Rice" -> Entree.SALMON_ON_RICE
        else -> null
    }

    override fun prepareAppetizer(name: String): Appetizer? {
        TODO("Not yet implemented")
    }

    override fun prepareDessert(name: String): Dessert? {
        TODO("Not yet implemented")
    }

    override fun receiveCompliment(message: String) {
        println("Chef received a compliment: $message")
    }

}

class Bartender : BarStaff {
    override fun prepareBeverage(name: String): Beverage? = when (name) {
        "Water" -> Beverage.WATER
        "Soda" -> Beverage.SODA
        "Peach Tea" -> Beverage.PEACH_ICED_TEA
        "Tea-Lemonade" -> Beverage.TEA_LEMONADE
        else -> null
    }

    override fun receiveCompliment(message: String) =
        println("Bartender received a compliment: $message")
}


class Waiter(
    private val chef: Chef,
    private val bartender: Bartender
) : KitchenStaff by chef, BarStaff by bartender {

    // The waiter can prepare a beverage by himself...
    override fun prepareBeverage(name: String): Beverage? = when (name) {
        "Water" -> Beverage.WATER
        "Soda" -> Beverage.SODA
        else -> null
    }

    override fun prepareEntree(name: String): Entree? =
        if (name == "Tossed Salad") Entree.TOSSED_SALAD else chef.prepareEntree(name)

    override fun receiveCompliment(message: String) = when {
        message.contains("entree")   -> chef.receiveCompliment(message)
        message.contains("beverage") -> bartender.receiveCompliment(message)
        else                         -> println("Waiter received compliment: $message")
    }

    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")


    // Manually delegating to the chef for all of these things: (auto delegating = by)
    /*
    override val specials: List<String> get() = chef.specials
    override fun prepareEntree(name: String) = chef.prepareEntree(name)
    override fun prepareAppetizer(name: String) = chef.prepareAppetizer(name)
    override fun prepareDessert(name: String) = chef.prepareDessert(name)
    override fun receiveCompliment(message: String) = chef.receiveCompliment(message)
    */

}

enum class Entree { TOSSED_SALAD, SALMON_ON_RICE }
enum class Beverage { WATER, SODA, PEACH_ICED_TEA, TEA_LEMONADE  }
enum class Dessert { CAKE, ICE_CREAM }
enum class Appetizer { CHEESE }

fun main() {

    val waiter = Waiter(Chef(), Bartender())

    val beverage = waiter.prepareBeverage("Soda")
    val entree = waiter.prepareEntree("Salmon on Rice")

    waiter.receiveCompliment("The salmon entree was fantastic!")

    val waiter1 = Waiter(Chef(), Bartender())

    waiter1.receiveCompliment("The salmon entree was fantastic!")
    waiter1.receiveCompliment("The peach tea beverage was fantastic!")
    waiter1.receiveCompliment("The service was fantastic!")

}