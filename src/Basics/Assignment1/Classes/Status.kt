package Basics.Assignment1.Classes

enum class Status(val numericValue: Int){
    STARTED(0),
    PENDING(20),
    ACCEPTED(50),
    INCALCULATION(80),
    FINISHED(100),
    ABORTED(90)
}