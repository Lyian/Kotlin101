package Basics

import java.time.LocalDateTime

data class Deal(val id: String, val contractName: String, val contractStatus: Int, val KID: String, val created: LocalDateTime)

class VeGASDealsList{
    var aDeal: Deal? = null
    var allDeals: List<Deal>? = null

    init{
        println("Necessary steps")
    }

    constructor( allDeals: List<Deal>){
        this.allDeals = allDeals
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
    val anotherDeal = singleDeal.copy(id="50000011")
    println(singleDeal)
    println(anotherDeal)

    val deals = VeGASDealsList(listOf(singleDeal,anotherDeal))
    println(deals)
   // val dealsList = listOf<Deal>(singleDeal, )
}

