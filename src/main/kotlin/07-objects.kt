import java.util.*

// basic enums
enum class Instrument {
    Mic,
    GUITAR,
    PIANO;

    fun getName() = name.toLowerCase()
}

// thread save singleton
object MusicianFactory {
    fun create(instrument: Instrument): Musician {
        val id = UUID.randomUUID().toString()
        return when(instrument){
            Instrument.Mic -> Musician.Vocalist(id, "John")
            Instrument.GUITAR -> Musician.Guitarist(id, "Jane", Instrument.GUITAR.getName())
            Instrument.PIANO -> Musician.Pianist(id, "Doe", Instrument.PIANO.toString())
        }
    }
}

// sealed class
sealed class Musician {
    data class Guitarist(val id: String, val name: String, val instrument: String): Musician()
    data class Pianist(val id: String, val name: String, val instrument: String): Musician()
    data class Vocalist(val id: String, val name: String): Musician() {
        fun sing() {
            println("i wanna hold your hand ~")
        }
    }
}

// extensions method
fun Musician.Guitarist.jam() {
    println("LETS JAM")
}

// extensions property
val Musician.Vocalist.song: String
    get() = "lover is a day"

fun main() {
    val guitarist = MusicianFactory.create(Instrument.GUITAR)
    val guitarist2 = (guitarist as Musician.Guitarist).copy()

    // equals from data class
    println(guitarist == guitarist2)

    // referential equal
    println(guitarist === guitarist)

    guitarist.jam()

    val vocalist  = MusicianFactory.create(Instrument.Mic)
    // smart cast
    if (vocalist is Musician.Vocalist) {
        vocalist.sing()
        println(vocalist.song)
    }

}