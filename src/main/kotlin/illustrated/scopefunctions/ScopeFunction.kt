package illustrated.scopefunctions

fun main() {

    val address = Address()

    with(address) {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
        showInfos()
    }

    val address1 = Address()

    address.run {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 200"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
    }




    println(address)
}