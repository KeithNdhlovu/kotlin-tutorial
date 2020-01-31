package day_two

fun main() {
    // Using If Statements

    val language: String = "EN"

    when(language) {
        "EN" -> {
            println("Hello World!")
        }
        "ES" -> {
            println("Hola Mundo!")
        }
        "FR" -> {
            println("Cava bein")
        }
        else -> {
            println("We greet you, ha mi pfuxela")
        }
    }
}