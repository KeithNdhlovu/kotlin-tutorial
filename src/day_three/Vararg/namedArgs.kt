package day_three.Vararg

fun sayHello(greet: String, vararg things: String) {

    things.forEachIndexed { index, thing -> println("$greet $thing") }
}

fun main(args: Array<String>) {

    val things: Array<String> = arrayOf("Kotlin", "Java", "Programming", "Comic Books")
    val greeting: String = "Hello"

    day_three.named_args.sayHello(greeting, *things)
}