package Basics.Day1


//Why immutable is good?
/**
 * testing complexity
 * more states
 * multithreading
 */

/**
 * Limit Mutability as much as we can
 ** Pref val over var
 ** Copy immutable list to mutable ones, if you need to operate on them!
 */

//Using closest scope possible

fun someArithmetic(integer1: Int, integer2: Int) : Int{
    return integer1.times(integer2)
}

val aProperty: String = "5"
    get() = field + "abc"

//mutable property
var aMutableProperty: String = "34534"
    get() = field + "abc"
    set(value) {
        println("setter used")
        field = value
    }


fun main() {
    var aMutableNumber: Int = 42
    val immutableNumber: Int = aMutableNumber
    val someText = "That's a cool number you got there $aMutableNumber, and even ${immutableNumber} is here!"

    aMutableNumber = 30
    val anotherText = someText
    println(aMutableNumber*immutableNumber)
    println(someText)
    println(anotherText)

    val listOfNumbers = listOf<Int>(0,1,2,3)
    val listOfNumbersMutable = mutableListOf(0,1,2,3,4,5)
    listOfNumbersMutable.add(1)

    val newListOfNumbersFromImmutable = listOfNumbers.toMutableList()
    newListOfNumbersFromImmutable.add(6)

    println(listOfNumbersMutable)
    println(newListOfNumbersFromImmutable)
    println(listOfNumbers)

    val filteredList = listOfNumbersMutable.filter { it>3 }.map{ someArithmetic(it, 3) }
    println(filteredList)
}

