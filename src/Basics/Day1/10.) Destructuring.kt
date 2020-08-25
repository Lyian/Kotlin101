package Basics.Day1

interface Vehicle

data class Car(val owner: String, val model: String, val seats: Int = 4, val price: Float) : Vehicle

fun main() {
    val holgersCar = Car("H7949", "Lamboghini", 2, 149999.99f)
    val torisCar = Car("A1234", "Lamboghini", 4, 149999.99f)


    val (wer, _ , anzahl) = torisCar
    println("$wer, $anzahl")


    val aMapOfDeals = mapOf("Holger Leppkes" to "H7949", "Kevin Yu" to "K27601")
    for ((key, value) in aMapOfDeals) {
        println("$key $value")
    }
}