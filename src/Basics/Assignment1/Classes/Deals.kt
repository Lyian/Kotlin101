package Basics.Assignment1.Classes

import Basics.Day1.Vertrag

enum class Status(val numericValue: Int){
    STARTED(0),
    PENDING(20),
    ACCEPTED(50),
    INCALCULATION(80),
    FINISHED(100),
    ABORTED(90)
}

class Deals(val id: Int, val contractName: String, val contracts: List<Contract>, val users: List<User>, var status: Status = Status.STARTED, val contractee: String){
    var marge: Float = 0F
    var mengen: MutableMap<ContractType, Float> = mutableMapOf()

    fun calculateMargeFromContracts(){
        for (contract in contracts)
            marge+= contract.marge
    }

    fun calculateMengenFromContracts(){
        mengen = mutableMapOf(ContractType.GAS to 0f, ContractType.STROM to 0f, ContractType.CUSTOM to 0f)

        for (contract in contracts){
            when(contract.contractType){
                ContractType.CUSTOM -> mengen[ContractType.GAS] += mengen[ContractType.GAS]?.plus((contract.menge))
            }
        }

        println(mengen)
    }

    fun changeStatus(status: Status){
        this.status = status
    }

    fun sendEmail(){
        println("An Email to $users was sent.")
    }
}