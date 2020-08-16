package Basics

val double = {x:Int -> 2*x}

fun main() {
    var vegasDeals = listOf<String>("Deal1", "Deal2", "Deal3", "Deal4", "Deal5")
    vegasDeals = listOf("Deal1", "Deal2", "Deal3", "Deal4", "Deal5")

    val vegasDeals2 = listOf<String>("Deal1", "Deal2", "Deal2", "Deal4", "Deal5")
    //vegasDeals2 = listOf()

    val vegasDealsMutable = vegasDeals2.toMutableList()
    val vegasDealsSet = vegasDeals2.toSet()
    val vegasDealsMap = mapOf("Deal1" to "A deal in vegas", "Deal2" to "Another cool deal in Vegas")

    println("Inmutable list $vegasDeals")
    println("Mutable list $vegasDealsMutable")
    vegasDealsMutable.removeAt(0)
    println("Removed item $vegasDealsMutable")
    println("A set $vegasDealsSet")
    println(vegasDealsMap)

    println("___________________________________")

    val listOfNumbers = listOf(1,2,3,4,5,6,7,8,9)
    println(listOfNumbers.filter {
        10 <= it*2
    })


    println(listOfNumbers.map { double(it) })
    println(
        listOfNumbers.filter { it< 5 }.map{ double(it)}
    )

    println("Minus operator ${listOfNumbers - 4}")

    //Deal Pegasus ID (PegasusPos1,PegasusPos2, etc...)
}

