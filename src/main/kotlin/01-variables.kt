
// constant, top level variable
const val city: String = "Makassar"

fun main() {
    // immutable variable
    val name: String = "Archie"

    // mutable variable
    var age = 25 // type inference from statically typed value
    age = 26

    // nullable variable
    val hobby: String? = null

    // print with string template
    println("Hello $name of age $age from $city likes to do $hobby")
}