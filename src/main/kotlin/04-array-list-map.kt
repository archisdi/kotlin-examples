
fun main() {
    // -- ARRAY
    val hobbies = arrayOf("Eat", "Drink", "Game", "Code")

    println("you have ${hobbies.size} hobbies one of them is ${hobbies[0]}")

    // regular for loop
    for (hobby in hobbies) {
        println("Hobby: $hobby")
    }

    // functional loop with array forEach
    // lambda syntax
    hobbies.forEach {
        println("Hobby: $it") // 'it' passed by default
    }

    // indexed loop
    hobbies.forEachIndexed { index, s -> println("hobby $index : $s") }

    // -- LIST
    // mutable list
    val cities = mutableListOf("Makassar", "Bandung", "Denpasar", "Jakarta")

    // add value to list
    cities.add("Yogya")

    // map values and print
    cities.map { "City of $it" }.forEach { println(it) }

    // -- MAP
    // immutable map
    val hash = mapOf(1 to "a", 2 to "b", 3 to "c")

    // loop through map
    hash.forEach { (key, value) -> println("$key => $value") }
}