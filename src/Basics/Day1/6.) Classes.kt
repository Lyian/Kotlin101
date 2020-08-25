package Basics.Day1

import java.time.LocalDateTime

data class Deal(val id: String, val contractName: String, val contractStatus: Int, val KID: String, val created: LocalDateTime){
    var fullname: String? = null
}

class VeGASDealsList (allDeals: List<Deal>) {
    var aDeal: Deal? = null
    var allDeals: List<Deal>? = allDeals

    init{
        println("Necessary steps")
    }


    fun getCompleted(){
        allDeals?.filter { it.contractStatus == 100 }
    }

    fun getHighestPegasusID(){
        allDeals?.maxBy { it.id }
    }


}


fun main() {
    val singleDeal = Deal("50000010", "TestDeal 1", 20, "k27601", LocalDateTime.now().minusDays(1))
    val anotherDeal = singleDeal.copy(id="50000011", contractName = "")
    println(singleDeal)
    println(anotherDeal)




    val deals = VeGASDealsList(listOf(singleDeal, anotherDeal))
    println(deals)
   // val dealsList = listOf<Deal>(singleDeal, )
}

