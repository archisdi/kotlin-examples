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

// inheritance of SpecialPerson
class FancyPerson : SpecialPerson() {
    override val name: String
        get() = "Jane"

    // has to be open to override
    override var age: Int
        get() = super.age
        set(value) {}
}

// class interface implements, and can be inherit
open class SpecialPerson() : PersonInfo, Session {
    // only can be accessed from inheritance
    protected open var age = 20

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

interface IdProvider {
    fun getId(): String
}

// class with companion object, a.k.a static methods
class Entity private constructor(val id: String) {

    companion object Factory: IdProvider { // custom companion naming and implement interface
        const val staticId = "an-id"

        override fun getId(): String {
            return staticId
        }

        fun create() = Entity(getId())
    }

    fun printId() {
        println(id)
    }
}

fun typeChecking(personInfo: PersonInfo) {
    if (personInfo is SpecialPerson) {
        println("its special")

        // auto casting
        (personInfo as SpecialPerson).info()
    }
}

fun main() {
    val person = SpecialPerson()
    person.info()
    person.log()
    typeChecking(person)

    val person2 = FancyPerson()
    person2.info()

    // object expression, anonymous class
    val person3 = object : SpecialPerson() {
        override fun getSessionId(): String {
            return "session-from-object-expression"
        }
    }
    println(person3.getSessionId())

    // instantiation from companion object
    val entity = Entity.create()
    entity.printId()
}