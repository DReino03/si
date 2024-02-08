class BarajaEspanola: Carta() {
    private val palos = listOf("OROS", "COPAS", "ESPADAS", "BASTOS")
    private val numeros = (1..12)
    private val baraja = mutableListOf<Carta>()

    init {
        for (palo in palos) {
            for (numero in numeros) {
                baraja.add(Carta(palo, numero.toString()))
            }
        }
    }

    fun mezclar() {
        baraja.shuffle()
    }

    fun siguienteCarta(): String {
        val carta: Carta?
        carta = if (baraja.isNotEmpty()) {
            baraja.removeAt(0)
        } else {
            println("No hay más cartas.")
            null
        }
        return carta.toString()

    }

    fun cartasDisponibles(): Int {
        val cartasTotales: Int = baraja.size
        return cartasTotales
    }

    fun pedirCartas(numeroCartas: Int): List<Carta>? {
        return if (baraja.size >= numeroCartas) {
            val cartesRepartides = mutableListOf<Carta>()
            repeat(numeroCartas) {
                cartesRepartides.add(baraja.removeAt(0))
            }
            cartesRepartides
        } else {
            println("No hay suficientes cartas disponibles.")
            null
        }
    }

    fun repartirCartas(numeroCartas: Int) {
        if (baraja.size >= numeroCartas) {
            pedirCartas(numeroCartas)
        } else {
            println("No hay suficientes cartas disponibles para repartir.")
        }
    }

    fun verMonton() {
        for (c:Carta in baraja) {
            println(c.toString())
        }
    }

    override fun toString(): String {
        return "$numero de $palo"
    }
}