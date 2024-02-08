 open class Carta {
     protected var palo: String
     protected val numero: String
     protected var color : String

    constructor(){
        this.palo = ""
        this.numero = ""
        this.color = ""
    }
    constructor(palo: String, numero: String){
        this.palo = palo
        this.numero = numero
        this.color = if (palo == "Diamantes" || palo == "Corazones") "Rojo" else "Negro"

    }

    override fun toString(): String {
        return "$numero de $palo"
    }
}

