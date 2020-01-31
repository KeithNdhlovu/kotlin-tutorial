package day_two

fun main() {

    val items: MutableCollection<String> = mutableListOf()

    items.add("Item 1")
    items.add("Item 2")
    items.add("Item 3")

    val nList = asList(items)

    for (item in nList) {
        println(item)
    }
}

fun asList(items: MutableCollection<String>): List<String> {
    return items.toList()
}