package Basics

interface StandardDeal{
    var user : String
    val menge: Float
    val marge: Float

    fun getUserAndContactViaMail()
    fun replaceUser(KID: String){
        this.user = KID
    }
    fun correctData(deal: Deal)
}

class GasDeal(override var user: String, override val menge: Float, override val marge: Float) : StandardDeal{
    override fun getUserAndContactViaMail() {
        TODO("Not yet implemented")
    }

    override fun correctData(deal: Deal) {
        TODO("Not yet implemented")
    }



    override fun toString(): String {
        return "$user, $menge, $marge"
    }

    override fun equals(other: Any?): Boolean {
        if (other !is GasDeal)
            return false

        if(other.hashCode() == this.hashCode())
            return true

        if (other.marge == this.marge && other.user == this.user && other.menge == this.menge)
            return true

        return false
    }

    override fun hashCode(): Int {
        var result = user.hashCode()
        result = 31 * result + menge.hashCode()
        result = 31 * result + marge.hashCode()
        return result
    }

}

fun main() {
    val gasDeal = GasDeal("K27601", 100f, 20f)
    gasDeal.replaceUser("H7949")
    val anotherGasDeal =  GasDeal("H7949", 100f, 20f)


    println(gasDeal)
    println(anotherGasDeal == gasDeal)
}

