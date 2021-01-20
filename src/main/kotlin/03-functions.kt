
// no param function
fun getGreeting(): String {
    return "Holaa"
}

// single expression function with type inference
fun greet(greeting: String = "Hai", name: String) = "$greeting $name"

// void function, 'Unit' can be omitted
fun sayHello(): Unit {
    println("Halo")
}

// vararg
fun saySomethingNice(greeting: String, vararg persons: String) {
    persons.forEach { println("$greeting $it") }
}

fun main() {
    // named parameter with default value on greeting
    println(greet(name = "Archie"))

    val names = arrayOf("Archie", "Angga", "Zizu")

    // persons being spread over vararg
    saySomethingNice(getGreeting(), *names)
}