package day_three.collections

fun sayHello(greet: String, things: List<String>) {

    things.forEachIndexed { index, thing -> println("$greet $thing") }
}

fun main(args: Array<String>) {

    val things: List<String> = listOf("Kotlin", "Java", "Programming", "Comic Books")
    val greeting: String = "Hello"

    sayHello(greeting, things)
}