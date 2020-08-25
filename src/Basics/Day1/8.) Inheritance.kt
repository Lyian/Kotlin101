package Basics.Day1

open class Deals(var user: String, val isRelevant: Boolean){
    open val marge = 0


    fun replaceUser(KID:String){
        user = KID
    }
}

class StromDeal(user:String, isRelevant: Boolean = false, override val marge: Int) : Deals(user, isRelevant)

class ServiceDeal(user:String, var secondaryUser: String, isRelevant2: Boolean = true ): Deals(user, isRelevant2){

    fun replaceUser(firstKID: String = user, secondKID: String = ""){
        super.replaceUser(firstKID)
        secondaryUser = secondKID
    }

}


fun main() {
    val stromDeal = StromDeal("K27601", true, 20)
    val serviceDeal = ServiceDeal("K27601", "", true)

    stromDeal.replaceUser("H7949")
    serviceDeal.replaceUser("H7949", secondKID = "T27633")
    println(stromDeal.user)
    println("${serviceDeal.user}, ${serviceDeal.secondaryUser}")

}

