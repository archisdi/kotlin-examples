interface PersonInfo {
    val name: String

    fun info(): Unit

    // default interface implementation
    fun log() {
        println("this is a log")
    }
}

interface Session {
    fun getSessionId(): String
}

// class interface implements
class SpecialPerson() : PersonInfo, Session {
    override val name: String
        get() = "John"

    // overriding method to implement interface
    override fun info() {
        println("i am $name")
    }

    override fun getSessionId(): String {
        return "session:$name"
    }
}

fun main() {
    val person = SpecialPerson()
    person.info()
    person.log()
}