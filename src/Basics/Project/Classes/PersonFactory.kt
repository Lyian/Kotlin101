package Basics.Project.Classes

import kotlin.random.Random

class PersonFactory {
    val listOfFirstnames = listOf<String>("Holger", "Tori", "Kevin", "Juljan", "Jürgen", "Roland", "Peter", "Vladimir", "Martin")
    val listOfSurnames = listOf<String>("Leppkes", "Albrecht", "Yu", "Irgendwas", "Zufall", "Mensch", "Bauer", "Müller", "Test", "Raffy", "Bäcker")
    val listOfStatus = listOf<String>("traine", "intern", "extern", "manager", "ceo", "kam")


    fun getListOfPeople(countOfPeople: Int): List<User>{
        val persons = mutableListOf<User>()
        for (i in 0 until countOfPeople){
            val (firstname, lastname, age) = selectRandomNames()
            val status = selectRandomStatus()
            persons.add(User(i, firstname, lastname,  status, age))
        }
        return persons
    }

    private fun selectRandomStatus(): String {
        return listOfStatus[Random.nextInt(0, listOfStatus.size)]
    }

    fun selectRandomNames(): Triple<String, String, Int>{
        val firstname = listOfFirstnames[Random.nextInt(0, listOfFirstnames.size)]
        val surname = listOfSurnames[Random.nextInt(0, listOfSurnames.size)]
        val age = Random.nextInt(20, 60)

        return Triple(firstname, surname, age)
    }
}