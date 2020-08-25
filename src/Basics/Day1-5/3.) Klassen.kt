package Basics.`Day1-5`


/**
 * Objekt Orientierte Programmierung: kurz OOP
 * Mittels OOP versuchen wir Daten und Abstraktion miteinander zu verbinden. Wir versuchen, mit einer Klasse auf Daten zu operieren,
 * zu speichern und auf diesen zu operieren. Dies führt zu Kapslung von Objekten
 *
 * * Struktur einer Klasse in Kotlin:
 * (data) class name constructor() : Abstraktion {
 *  var variable1 : Typ1
 *  var variable2 : Typ2
 *
 *
 *  fun 1()
 *  fun 2()
 *
 * }
 *
 * Mittels Klassen können wir Beziehungen zwischen Abstraktionen in einem Programm herstellen.
 * Im Gegensatz zur procedualen Programmierung funktioniert ein Programm nicht von Oben nach Unten, sondern ein Programm ruft
 * immer weitere Klassen auf, die gekapselt eigene Aufgaben haben.
 *
 * Eine Klasse enthält also Daten, in Form von Variablen im Konstruktor oder global in der Klasse und Funktionaläten, die
 * entweder auf den übergebenen Daten operieren, oder einen neuen Zustand im Programm anhand der Daten hervorufen.
 * */

class Car (carname: String, color: String, ps: Int,  private var gas: Float, private val owner: String, var currentPosition: String){
    private var tacho: Double = 0.0
    var isStarted : Boolean = false


    fun driveToDestination(destination: String, kilometerToDrive: Double) {
        if(isStarted){
            currentPosition = destination

        }
    }

    private fun changeGasMeter( kilometerDriven: Int){
        gas = (gas - .01*kilometerDriven).toFloat()
    }

    private fun changeTacho(kilometerDriven: Int){
        tacho += kilometerDriven
    }
}


fun main(){
    // Sprechen wir von einem Objekt, reden wir von konkreten Instanzen: newCar ist ein Objekt. Eine Instanz der Klasse Car.
    val newCar = Car("Porsche", "white", 562, 1f, "Kevin", "Washington DC, Main Ave.")

    // Zugriff auf Werten von Car.
    newCar.isStarted = true
    newCar.driveToDestination("New York, 5th Ave.", 275.1223)



}