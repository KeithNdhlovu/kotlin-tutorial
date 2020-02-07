package day_four.interfaces

interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("More Additional Info")
    }

    override fun getSessionId(): String {
        return "Session"
    }
}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
    provider.getSessionId()

}