class BarajaFr: Carta() {
    private val palos = listOf("Corazones", "Diamantes", "Tréboles", "Picas")
    private val numeros = (1..13)
    private val baraja = mutableListOf<Carta>()

    init {

        for (palo in palos) {
            for (numero in numeros) {
                when (numero) {
                    1 -> baraja.add(Carta(palo, "A"))
                    11 -> baraja.add(Carta(palo, "J"))
                    12 -> baraja.add(Carta(palo, "Q"))
                    13 -> baraja.add(Carta(palo, "K"))
                    else -> baraja.add(Carta(palo, numero.toString()))
                }
            }
        }
    }

    fun mezclar() {
        baraja.shuffle()
    }

    fun siguienteCarta(): Carta? {
        var carta: Carta?
        carta = if (baraja.isNotEmpty()) {
            baraja.removeAt(0)
        } else {
            println("No hay más cartas.")
            null
        }
        return carta

    }

    fun cartasDisponibles(): Int {
        var cartasTotales: Int
        cartasTotales = baraja.size
        return cartasTotales
    }

    fun pedirCartasFrancesa(numeroCartas: Int): List<Carta>? {
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
            pedirCartasFrancesa(numeroCartas)
        } else {
            println("No hay suficientes cartas disponibles para repartir.")
        }
    }

    fun verMonton() {
        for (c:Carta in baraja) {
            println(c.toString())
        }
    }

    fun cartasMonton(): List<Carta> {
        return baraja
    }
}