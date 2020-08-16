package Basics


fun testNumberInBetween(x: Int) = when(x){
    in 0..5 -> 5
    6-> 20
    10 -> 10
    else -> 20
}


fun main() {
    val someText = "text"
    val someNumber = 10

    when(someText){
        "text" -> println("say what?")
        else-> println("Could not process data")
    }

    while(someNumber<10)
        println("Hey")

    do {
        println("Some Number")
    }while(someNumber < 10)

    for(x in 0..10) println(x*10)
}

