package Basics.Assignment1.Main

import Basics.Assignment1.Classes.*

/**
 * Assignment 1
 * 1.) Ließ die Klassen Contracts und Deals.
 * 2.) Die Klasse Deals repräsentiert Verträge, in denen verschiedene Unterverträge (Contracts) existieren. Nun soll eine Menge berechnet werden
 * die jedoch nach den Vertragstypen kategorisiert sind. Fasse die Mengen in der Klasse Deal über den Typen des Vertrags zusammen.
 * 3.) Bis jetzt wurden die Firmen, mit denen ein Deal geschlossen wurde in einem String festgehalten. Die Uniper möchte aber,
 * das jeweils ein! KAM (Person) eine persönliche Zuständigkeit zu einer Firma hat. Ändere die Klassen so ab, dass der Vertragspartner (Contractee)
 * eine eigene Klasse ist, und implementiere die Anforderung, dabei hat ein Vertragspartner einen Namen, einen KAM der zuständig für ihr ist,
 * ein dealCount (Anzahl der Deals die mit ihm geschlossen wurden) und eine Telefonnummer, die sich nicht ändern kann.
 * 4.) Die Angestellten die für einen Deal zuständig sind, sind auf für die Contracts zuständig. Ändere die Klassen (Deals und Contracts)
 * nach der Anforderung so, dass Contracts keine User mehr beinhaltet.
 * 5.) Erstelle seperate Klassen für die ENUMS
 * 6.) Die Kosten für den Vertragspartner werden nach fixen Formel berechnet: Für Strom: kwh * 0.10, Für Gas: m3 * 20 und die CUSTOMkosten werden aufaddiert.
 * Passe die Klasse Deals an, dass die Gesamtkosten für den Vertragspartner (Contractee) einsehbar sind, ändere den Status des Deals auf Finished.
 * 7) Wenn ein Vertrag den Status "Finished" erreicht, sende eine Email an die User und an den Vertragspartner, ggf. muss die Mailfunktionalität angepasst werden.
 * 8.) Die Marge pro Contract soll jetzt nach der Menge berechnet werden. Pro Kwh erhält die Uniper eine Marge von 40 Cent und Pro m3 Gas erhält die Uniper eine Marge von 80 Cent,
 * ändere die Klassen so ab, dass die Marge sich nach verkaufter Menge richtet.
 * 9.) Füge der Klasse Deals eine Funktion equals hinzu, sowie eine Funktion to String und gebe die Klasse in der Konsole (println) zurück.
 * Optional.) Commite deinen Branch und erstelle einen Change Request.
 * Optional.) Mache dich mit den ShortCuts des IntelliJ IDEs vertraut.
 *
 * */



fun main(){
    val factory = PersonFactory()
    val persons = factory.getListOfPeople(1)


    val contract1 = Contract(1, ContractType.STROM, 300f, 10f, persons)
    val contract2 = Contract(2, ContractType.STROM, 1000000f, 2000f, persons)
    val contract3 = Contract(3, ContractType.GAS, 1000f, 100f, persons)
    val contract4 = Contract(4, ContractType.GAS, 200000f, 2000f, persons)
    val contract5 = Contract(5, ContractType.CUSTOM, 100f, 100f, persons)
    val contractList = listOf(contract1, contract2,contract3, contract4, contract5)
    val firstDeal = Deals(1, "first Deal of the Day", contractList, persons, Status.STARTED, "Rasenmäher Repairshop GmbH u. CO. KG.")
    
    firstDeal.calculateMengenFromContracts()
}