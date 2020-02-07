package day_four.interfaces

class Person(var name: String = "James", var lastname: String = "Bond", var age: Int = 47) {

    fun printInfo() {
        println("Name: $name , Lastname: $lastname, Age: $age ")
    }
}