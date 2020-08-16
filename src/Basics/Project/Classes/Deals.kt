package Basics.Project.Classes

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
    var mengen: Map<ContractType, Float> = mapOf()

    fun calculateMargeFromContracts(){
        for (contract in contracts)
            marge+= contract.marge
    }

    fun calculateMengenFromContracts(){
        return TODO()
    }

    fun changeStatus(status: Status){
        this.status = status
    }

    fun sendEmail(){
        println("An Email to $users was sent.")
    }
}