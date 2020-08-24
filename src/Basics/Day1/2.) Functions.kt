package Basics.Day1

/**
 * F is for friends who do stuff together
 * U is for you and me
 * N is for anywhere and anytime at all
 */

//Extensive
fun calculateProductViaSum(x: Int = 2, y: Int = 3, skipSecondIteration: Boolean = false): Int {
    var tmp = 0

    if(skipSecondIteration)
        for(i in 1..x step 2) {tmp += y}
    else
        for(i in 1..x) {tmp += y}

    return tmp
}

//Single Expression
fun square(x: String ): Boolean  = x == "1"

//Generic functions List<Autos>, List<Schiffe>, ...
fun <T> singletonList(ourList: List<T>): List<T> {
    val list = ourList.toMutableList()
    list.removeAt(0)
    return list
}

fun main() {
    println(calculateProductViaSum())
    println(calculateProductViaSum(x= 2, y=3, skipSecondIteration = true))

    println(square("10"))

//Scope
}

