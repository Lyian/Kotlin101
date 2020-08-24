package Basics.Day2

import Basics.Assignment1.Classes.User
import java.util.*

/**
 * 1. Klassen: CamelCase/ kein Verb
 * 2. Funktionen: Verb+Konzept
 * 3. Technische Namen und Fachbegriffe aus der Domäne sind erlaub (wenn bekannt)
 * 4. Kontexte
 * 5. Größe der Funktionen
 * 6. Kontrollstrukturen
 * 7. Eine Aufgabe und eine Abstraktionsebene per Funktion
 * 8. Einrückung, maximal 2
 * 9. Stepdownregel
 * 10. Funktionsargumente niemals mehr als 4, eher maximal 3, 2 ist ok, 1 ist gut und 0 ist perfekt (mehr als 2 ist ein Indikator für ein Objekt)
 * 11. Flagargumente vermeiden (Abstraktionsebene)
 * 12. Nebeneffekte vermeiden (Abstraktionsebene)
 * 13. Keine Outputargumente (refaktoren)
 * 14. Try und Catch anweisungen sind eigene Funktionen
 * 15. GOTO, Continue und Break sind ein Grund um gefeuert zu werden.
 * */

//6.7.8.9
fun getPrimes(start:Int,  end: Int): List<Int>{
    val listPrimes = mutableListOf<Int>()
    var prime:Int

    for (i in start..end){
        prime = checkForPrimes(i)

        if(prime != -1){
            listPrimes += prime
        }
    }
    return listPrimes
}

fun checkForPrimes(currentNumber: Int): Int{
    if(currentNumber < 2)
        return -1

    for (i in 2..currentNumber/2)
        if(currentNumber % i == 0){
            return -1
        }

    return currentNumber
}

//11
fun setNewUser(user: User, isExtern: Boolean){
    //user.setExtern(isExtern)
    //

    // if (isExtern){
    //      persistUserExtern(user)
    //      setExternUserPayment()
    // }else{
    //      persistUserIntern(user)
    //      setInternUserPayment()
    // }
}

fun setInternUser(employee: User){
    //persistUserIntern(user)
    //setInternUserPayment()
    //setUserDiscountForFood()
}

fun setExternUser(extern: User){
    //persistUserExtern(extern)
    //setExternUserPayment()
}

//12.13.
fun appendUser(user: User, users: List<User>) : List<User>{
    val newList = users.toMutableList()
    newList.add(user)
    //persistUser(user)
    return newList
}




fun main() {
    //1.
    class VertragsKunde

    //2. setDate, getDate, deleteDate, modifyDate ???

    //3.
    // quicksort(List), aStar(Path),
    // Domänen: Fachbegriffe und NUANCEN der Energiewirtschaft, die das Team kennt.

    //4.
    // Vertrag_Deals, Vertrag_Marge, Vertrag_Name -> Deals, Marge, Vertrag (Package oder Klasse gibt den Kontext bekannt)
    // Suche nach der Klasse Vertrag wird unheimlich

    //5.
    // 150 Zeichen breit
    // 20 Zeilen

    print(getPrimes(0,20))



}

