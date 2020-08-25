package Basics.Day1

/**
 * In den allermeisten Fällen arbeiten wir nicht mit einem Integer, String oder Double, sondern mit einer Vielzahl von
 * Elementen des gleichen Typs.
 * Klassich hat man dazu Arrays verwendet String test = new Array(1,2,3,4).
 * Wenn wir allerdings mit Objekten arbeiten, wollen wir mit Listen arbeiten, die uns äquivalent wie zum Array auf Elemente
 * der Liste zugreifenlässt. Das hinzufügen/entfernen von Werten ist in einem Array nicht möglich.
 *
 * Es gibt drei Grundtypen von Collections
 *
 * Art:         Long Init                                                                   Short Init mit Werten                       Short Init ohne Werte
 * * Listen     - val/var name:  (Mutabble)List <Typ> = (mutable)listOf()                   val/var name = (mutable)listOf(w1,w2)       val/var name = (mutable)listOf<Typ>()
 * * Sets       - val/var name: (Mutable)Set <Typ> = (mutable)setOf()                       val/var name = (mutable)setOf(w1)           val/var name = (mutable)setOf<Typ>()
 * * Maps       - val/var name: (Mutable)Map <Schlüsseltyp, Werttyp> = (mutable)mapOf()     val/var name = (mutable)mapOf(k1 to w1)     val/var name = (mutable)setOf<Schlüsseltyp, Werttyp>()
 *
 * dabei gibt es zu jedem Typen die Unterscheidung zwischen Mutable oder Immutable.
 *
 *
 */


fun main(){
    //Zusammenhang mutable und variablen typen.
    // Eine Variable test, der man eine ganz neue Liste zuweisen kann (var), und dessen Werte verändern kann (MutableList) REWRITE/WRITE
    var listVarMutable : MutableList<Int> = mutableListOf() // leere Liste

    // Eine Variable test, der man keine neue Liste zuweisen kann (val), aber dessen Werte verändern kann (MutableList) READONLY/WRITE
    val listValMutable : MutableList<Int> = mutableListOf(1,2)

    // Eine Variable test, der man eine ganz neue Liste zuweisen kann (var), aber dessen Werte man nicht verändern kann (ImmutableList) REWRITE/READONLY
    var listVarImmutable : List<Int> = listOf(1,2,3,4,4)

    // Eine Variable test, der man keine neue Liste zuweisen kann (val), und dessen Werte man nicht verändern kann (MutableList) READONLY
    val listValImmutable : List<Int> = listOf(1,2,3,3)


    //Wir sollten vorallem mit 2.) und 3.) arbeiten.

    // Im Gegensatz zu Listen, in denen Werte doppelt vorkommen, können wir in Sets nur einzelne Werte abspeichern.
    val mutableSet = mutableSetOf(1,2,3,3)
    val mutableSetEmpty = mutableSetOf<Int>()
    // Ausgabe: 1,2,3

    //Schlussendlich die Map
    val mutableMap = mutableMapOf(1 to 2)
    val mutableMapEmpty = mutableMapOf<Int,Int>()


    //Mache dich mit Listen vertraut, in dem du eine neue Liste vom Typ Double erstellst, und in dieser Liste einige Werte abspeicherst.
    // In der nächsten Zeile, verwende die Liste indem du varname. (Punkt) drückst, und dir anschaust welche Optionen dir zur Verfügung stehen.


    //Versuche dich mit der Funktionalität von liste.foreach{}, .filter {} und .map{} vertraut zu machen,
    //indem du Beispiele verwendest. Um auf ein Element in .forEach{} oder .filter{} zuzugreifen, verwende das it-Keyword. Googlen ist jederzeit erlaubt... fragen auch.

    // val liste = mutableListOf(1,2)
    // liste.forEach{ println(it) }
}