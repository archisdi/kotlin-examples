
// no param function
fun getGreeting(): String {
    return "Holaa"
}

// single expression function with type inference
fun greet(greeting: String, name: String) = "$greeting $name"

// void function, 'Unit' can be omitted
fun sayHello(): Unit {
    println("Halo")
}

fun main() {

    println(greet(getGreeting(), "Archie"))
}