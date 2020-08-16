package Basics


//Complete
val lambdaSum: (Int, Int) -> Int = {a: Int, b: Int -> a+b}

//Shorthand
val lowLambda = {name: String -> println(name)}

val checkIfPrime = {p: Int ->
    val candidates = (2..p/2).filter { p % it == 0 }
    if(candidates.isEmpty()) p else 0
}

val checkIfDivisbleBy3 = {p: Int ->
    if (p%3 ==0 ) p else 0
}

//Higher Order
val highLambda = {p: Int,  test: (Int)-> Int ->
    test(p)
}

val toBoolean = {x: String -> x == "1"}


fun main() {
    println(highLambda(11, checkIfPrime))
    println(highLambda(9, checkIfDivisbleBy3))
    //println(highLambda(highLambda(???, checkIfPrime), checkIfDivisbleBy3))

    println(toBoolean("1"))
    println(toBoolean("0"))
}

