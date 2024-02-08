import java.util.Scanner
val scanner = Scanner(System.`in`)

fun mostrarMenu() {
    println("")
    println("""
            -------- Menú --------
            1). Mezclar cartas
            2). Cartas disponibles
            3). Siguiente carta
            4). Pedir Cartas
            5). Repartir Cartas
            6). Ver monton
            7). Salir
    """.trimIndent())
    println("Selecciona una de les siguientes operaciones a ejecutar, por favor: ")
}

fun main() {
    println("Bienvenido al juego de cartas!")
    println("Por favor, seleccione el tipo de baraja que desea utilizar:")
    println("1). Baraja Española")
    println("2). Baraja Francesa")
    println("3). Salir")
    val opcionEscogida = scanner.next()
    when (opcionEscogida) {
        "1" -> barajaEsp()
        "2" -> barajaFr()
        "3" -> println("Gracias por su visita, hasta la proxima!")
        else -> println("Opción no valida. Vuelvelo a intentar por favor.")
    }
}
fun barajaEsp(){
    val baraja = BarajaEspanola()
    do {
        mostrarMenu()
        val opcionEscogida = scanner.next()
        when (opcionEscogida) {
            "1" -> {
                baraja.mezclar()
                println("CARTAS MEZCLADAS")
            }
            "2" -> println("CARTAS DISPONIBLES ACTUALMENTE: ${baraja.cartasDisponibles()}")
            "3" -> println("SIGUIENTE CARTA: ${baraja.siguienteCarta()}")
            "4" -> pedirCartasBarajaEsp(baraja)
            "5" -> repartirCartasBarajaEsp(baraja)
            "6" -> baraja.verMonton()
            "7" -> println("Gracias por su visita, hasta la proxima!")
            else -> println("Opción no valida. Vuelvelo a intentar por favor.")
        }
    } while (opcionEscogida != "7")
}

fun pedirCartasBarajaEsp(baraja: BarajaEspanola){
    println("Cuantas Cartas desea recibir?")
    val cantidadCartas = scanner.nextInt()
    baraja.pedirCartas(cantidadCartas)
    println("Se han repartido $cantidadCartas nuevas cartas y usted ha entregado $cantidadCartas cartas.")

}

fun repartirCartasBarajaEsp(baraja: BarajaEspanola){
    println("Cuantas Cartas desea recibir?")
    val cantidadCartas = scanner.nextInt()
    baraja.repartirCartas(cantidadCartas)
    println("Se han repartido $cantidadCartas cartas.")
}

fun barajaFr(){
    val barajaFrancesa = BarajaFr()
    do {
        mostrarMenu()
        val opcionEscogida = scanner.next()
        when (opcionEscogida) {
            "1" -> {
                barajaFrancesa.mezclar()
                println("CARTAS MEZCLADAS")
            }
            "2" -> println("CARTAS DISPONIBLES ACTUALMENTE: ${barajaFrancesa.cartasDisponibles()}")
            "3" -> println("SIGUIENTE CARTA: ${barajaFrancesa.siguienteCarta()}")
            "4" -> barajaFrancesa.pedirCartasFrancesa(barajaFrancesa.cartasDisponibles())
            "5" -> barajaFrancesa.repartirCartas(barajaFrancesa.cartasDisponibles())
            "6" -> barajaFrancesa.verMonton()
            "7" -> println("Gracias por su visita, hasta la proxima!")
            else -> println("Opción no valida. Vuelvelo a intentar por favor.")
        }
    } while (opcionEscogida != "7")

}

