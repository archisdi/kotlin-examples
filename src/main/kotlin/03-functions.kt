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

// parameterized function
fun printFilteredStrings(list: List<String>, filters: (String) -> Boolean){
    list.filter(filters).forEach { println(it) }
}

// store function as variable
val below4: (s: String) -> Boolean = {
    it.length >= 4
}

fun main() {
    // named parameter with default value on greeting
    println(greet(name = "Archie"))

    val names = arrayOf("Archie", "Angga", "Zizu")

    // persons being spread over vararg
    saySomethingNice(getGreeting(), *names)

    // HIGHER ORDER FUNCTION BELOW
    val languages = listOf("Kotlin", "Java", "Go", "Js")

    // direct statement if last param is function
    printFilteredStrings(languages) {
        s: String -> s.length > 2
    }

    // pass var function
    printFilteredStrings(languages, below4)
}