package Basics.Project.Classes

enum class ContractType{
    GAS, STROM, CUSTOM
}

// Menge für Strom in kwh
// Menge für Gas ist m3
// Die Mengen für Custom Verträge sind variabel
data class Contract(val id: Int, val contractType: ContractType, val menge: Float, val marge: Float, val users: List<User>)
