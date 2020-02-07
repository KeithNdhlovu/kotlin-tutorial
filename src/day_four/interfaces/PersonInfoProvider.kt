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

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("is not a SessionInfoProvider")
    } else {
        println("is a SessionInfoProvider")

        // Smart Casting
        infoProvider.getSessionId()

        // Manual Casting
        (infoProvider as SessionInfoProvider).getSessionId()
    }
}