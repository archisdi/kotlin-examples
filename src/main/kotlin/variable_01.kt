
// constant, top level variable
const val city: String = "Makassar"

fun main() {
    // immutable variable
    val name: String = "Archie"

    // mutable variable
    var age = 25 // static definition require no type definition
    age = 26

    println("Hello $name of age $age from $city")
}