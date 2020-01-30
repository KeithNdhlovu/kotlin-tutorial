var global: String = "I AM GLOBAL!"

class Person {
    var age: Int? = null
    var gender: Char = ' '
    var lastName: String = ""
    var firstName: String = ""

    constructor(age: Int?, gender: Char, lastName: String, firstName: String) {
        this.age = age
        this.gender = gender
        this.lastName = lastName
        this.firstName = firstName
    }
}