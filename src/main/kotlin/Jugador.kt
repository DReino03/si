class Jugador {
    var puntaje: Int = 0
    var cartas: MutableList<Carta> = mutableListOf()
    var nacionalidad : String = ""

    constructor(){
        this.puntaje = 0
        this.cartas = mutableListOf()
        this.nacionalidad = ""
    }
    constructor(nacionalidad: String){
        this.puntaje = 0
        this.cartas = mutableListOf()
        this.nacionalidad = nacionalidad
    }
    constructor(puntaje: Int, cartas: MutableList<Carta>, nacionalidad: String){
        this.puntaje = puntaje
        this.cartas = cartas
        this.nacionalidad = nacionalidad
    }

    fun puntuaCarta(cartas: MutableList<Carta>, nacionalidad: String) {
        for (c:Carta in cartas){
            if (this.nacionalidad = "española") {
                when (c.numero) {
                    "1" -> puntaje += 11
                    "3" -> puntaje += 10
                    "12" -> puntaje += 4
                    "11" -> puntaje += 3
                    "10" -> puntaje += 2
                    else -> puntaje += 0
                }
            } else {
                when (c.numero) {
                    "1" -> puntaje += 11
                    "3" -> puntaje += 10
                    "12" -> puntaje += 4
                    "11" -> puntaje += 3
                    "10" -> puntaje += 2
                    else -> puntaje += 0
                }
            }
        }
    }

    override fun toString(): String {
        return "Puntaje: $puntaje, Cartas: $cartas"
    }
}