package Basics.`Day1-5`

/**
 * Aller Anfang ist schwer.
 *
 * Wir lernen die Grundkonzepte der Programmierung anhand von Objekt orientierter Programmierung.
 * Die wichtigste Faustregel in Kotlin und in Java ist: Alles, ob Variablen oder Klassen, sind Objekte.
 */


fun main(){
    //Datentypen
    /**´
     * Alle Datentypen außer Float und Long können aus dem Kontext abgeleitet werden.
     * Weist man einer Variablen eine ganze Zahl zu, so wird sie als Integer behandelt, weißt man ihr eine Kommazahl x.yyyyyy zu
     * so wird sie als Double behandelt. Jeder andere Datentyp muss entweder explizit deklariert werden mittels
     * var/val name : type = value
     */
    var aByte: Byte = 2
    var aShort: Short = 3
    var aInteger: Int = 3
    var aLong: Long = 3L
    var aFloat: Float  = 3.0F
    var aDouble: Double = 3.0

    var aChar: Char = 'a'
    var aBool: Boolean = true

    // 1.) Multiplieziere, Substrahiere und teile durch Variabeln und gebe diese in der Konsole aus.
    // Was passiert bei int/double? was bei double/int?
    // Wie kann ich angeben, ob sich eine Variable ändern darf, oder nicht?
    // Warum sollten wir einige Daten nicht zur Laufzeit ändern dürfen?
    // Da alles in Kotlin ein Objekt ist, kannst du hinter jedem Datentype einen Punkt setzen und auf den
    // Vervollständigungsvorschlag von IntelliJ warten. Was für Vorschläge gibt es für die einzelnen Datentypen?
    // Versuche einen Integer in einen Double zu konvertieren und umgekehrt. Was fällt auf? Wozu könnte man das verwenden?


    // Der String Datentyp ist ein besonderer Datentyp. In der Theorie, wollen wir niemals mit Strings arbeiten, außer
    // wir wollen etwas Anzeigen, eine Information ausgeben oder eine Nachricht senden.
    // Überprüfungen mittels Text sind ein Taboo. Wir verwenden lieber Enums, als Text, weil Enums eine vorgegebene Anzahl an Optionen
    // sind, ein Text kann alles sein. Von null, bis zum leeren Text "" oder gar etwas "unerwartetes".
    // Das wollen wir vermeiden!
    var aText = "Das ist ein Text"



}