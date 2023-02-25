package illustrated.scopefunctions

class Address{

    lateinit var street1: String
    lateinit var street2: String
    lateinit var city: String
    lateinit var state: String
    lateinit var postalCode: String

    fun showInfos(){
       println(" Address: Street $street1, City $city, State $state, PostalCode $postalCode")
    }

}