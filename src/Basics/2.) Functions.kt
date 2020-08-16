package Basics

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
fun square(x: Int ): Int  = x*x

//Generic functions
fun <T> singletonList(ourList: List<T>): List<T> {
    val list = ourList.toMutableList()
    list.removeAt(0)
    return list
}

//


fun main() {
    println(calculateProductViaSum())
    println(calculateProductViaSum(10, 20, skipSecondIteration = true))

    println(square(2))

//Scope
}

