package Basics.Assignment1.Classes

import Basics.Day1.Vertrag

class Deals(val id: Int, val contractName: String, val contracts: List<Contract>, val users: List<User>, var status: Status = Status.STARTED, val contractee: String){
    var marge: Float = 0F
    var mengen: MutableMap<ContractType, Float> = mutableMapOf(ContractType.GAS to 0f, ContractType.STROM to 0f, ContractType.CUSTOM to 0f)

    fun calculateMargeFromContracts(){
        for (contract in contracts)
            marge+= contract.marge
    }

    fun calculateMengenFromContracts(){
        for (contract in contracts){
            when(contract.contractType){
                ContractType.GAS -> {
                    mengen[ContractType.GAS] =  mengen[ContractType.GAS]?.plus((contract.menge)) ?: 0F
                }
                ContractType.STROM -> {
                    mengen[ContractType.STROM] =  mengen[ContractType.STROM]?.plus(contract.menge) ?: 0F
                }
                ContractType.CUSTOM -> {
                    mengen[ContractType.CUSTOM] =  mengen[ContractType.CUSTOM]?.plus(contract.menge) ?: 0F
                }
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