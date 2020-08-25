package Basics.Day1

enum class Vertrag(val typeID: Int) {
    Gas(1 ),
    Strom(2),
    Service(3)
}

enum class VertragsArt {
    Strom, Gas, Service
}

fun zweig(int: Int, flag: VertragsArt){

}

fun main() {
    println(Vertrag.Gas.typeID)
    println(VertragsArt.Gas)
}


