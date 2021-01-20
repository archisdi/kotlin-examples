
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
    when(greeting) {
        // one liner
        "Hola" -> println("!!!")

        // default with brackets
        else -> {
            println("!")
        }
    }

    println("$greeting $name")
}