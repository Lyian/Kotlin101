package Basics.Day1

import java.lang.ArithmeticException
import java.lang.Exception




fun main() {
    val a: Int =3
    var b = 0
    try {
        b = 0
        val newVal = a / b
    }catch(e: ArithmeticException){
        throw ArithmeticException("Well it's a division by null... $e")
    }
}
