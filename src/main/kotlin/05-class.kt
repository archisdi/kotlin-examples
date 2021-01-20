
private class Person (_firstname: String, _lastname: String) {
    val firstName: String = _firstname
    private val lastName: String

    // constructor like init
    init {
        lastName = _lastname
    }
}

// args constructor
class Person2 (val firstname: String, val lastname: String = "Doe") {
    // field with default value and set get
    var nickname: String? = "Isdiningrat"
        set(value) {
            field = value
            println("new nickname is $value")
        }
        get() {
            println("nickname is $field")
            return field
        }

    fun printInfo() {
        // elvis operator
        println("$firstname ${nickname ?: "blah"} $lastname ")
    }

    // secondary constructor
    constructor(): this("John") {
        // do something
    }
}

fun main() {

    // no explicit 'new' keyword on kotlin
    val person = Person("Archie", "Isdiningrat")

    val person2 = Person2("Angga", "Atrie")
    val person3 = Person2()

    println(person.firstName)
    println(person2.lastname)

    person3.nickname = "JD"
    person3.printInfo()
}