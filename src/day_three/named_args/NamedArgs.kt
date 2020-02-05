package day_three.named_args

fun sayHello(greet: String = "Hello", vararg things: String = arrayOf("")) {

    things.forEachIndexed { index, thing -> println("$greet $thing") }
}

fun main(args: Array<String>) {

    val things: Array<String> = arrayOf("Kotlin", "Java", "Programming", "Comic Books")
    val greeting: String = "Hello"

    sayHello()
    println("----------")
    sayHello(greet = greeting, things = *things)
}