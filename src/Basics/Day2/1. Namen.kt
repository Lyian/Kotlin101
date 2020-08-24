package Basics.Day2

import java.util.*

/**
 * 0. Sprache
 * 1. Zweckbeschreibende Namen
 * 2. Fehlinformationen vermeiden
 * 2.1 Zweckmäßige bennenung
 * 2.2 Keine Abkürzung
 * 3. Unterschiede deutlich machen
 * 4. Aussprechbare Namen (außer Konventionen util, config, dto, usw.)
 * 5. Suchbare Namen
 * 6. Codierungen vermeiden
 * 7. Mentale Mappings
 * 8. Konsistenz
 */

fun main() {
    //0. Die Sprache des Codes ist english. Das hat mit der Codierung zu tun
    // é,è, ä,ö,ü, ç, etc. können zwar in UTF-8 Systemen verarbeitet werden, allerdings kann dies
    // in anderen Systemen hinein zu problemen führen.
    // Neue Mitarbeiter.
    // Einigung auf Terme, Konzepte und Modellnamen


    //1.
    val d : Int = 31
    val days = 31
    val daysUntilNextMeeting = 31

    //2.
    val numbersOfEmployees = "30"
    val salaryFloat = 20
    val salary = 20
    val O = 1
    val t = Date()

    //3.
    class ActiveAccount
    class ActiveAccounts
    class AccountInfo

    //4.
    val tmp = 3
    val temp = 3
    val activeAccNm = "Schröder"
    val activeAccountName = "Merkel"

    //5.
    val windows = 3
    val drawwindows = 3

    val times = 3
    val countAccessedAccount = 3

    //6.
    val tmp_Account = ""
    val temporaryAccount = ""
    val testAccountAdmin = ""

    //7.
   /* val einVertrag = class Deal

    val Deal = class Deal

   //8.)
    fetchTime()
    getTime()
    retrieveTime()

    setTime()
    replaceTime()
    setNewTime()

    removeTime()
    deleteTime()*/
}