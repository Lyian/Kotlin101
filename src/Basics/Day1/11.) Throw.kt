package Basics.Day1

import java.lang.ArithmeticException


fun main() {
    val a: Int =3
    var b = 3
    try {
        b = 1
        val newVal = a / b
    }catch(e: ArithmeticException){
        throw ArithmeticException("Well it's a division by null...")
    }
}

