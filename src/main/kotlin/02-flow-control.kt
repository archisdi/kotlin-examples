
fun main() {
    val name = "Archie"
    val age = 26
    var greeting: String? = null

    // simple flow control
    if (age > 20) {
        greeting = "Hai"
    } else {
        greeting = "Hola"
    }

    // switch case
    val hometown: String
    when(greeting) {
        // one liner
        "Hola" -> hometown = "Makassar"

        // default with brackets
        else -> {
            hometown = "Bandung"
        }
    }

    // conditional assignment
    val hobby = if (age > 20) "Eat" else "Drink"

    println("$greeting $name from $hometown that loves $hobby")
}