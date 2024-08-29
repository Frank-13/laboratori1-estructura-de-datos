

interface Numero {
    val valor: Int
    fun esTipo(): Boolean
}

class NumeroPar(override val valor: Int) : Numero {
    override fun esTipo(): Boolean = valor % 2 == 0
}

class NumeroImpar(override val valor: Int) : Numero {
    override fun esTipo(): Boolean = valor % 2 != 0
}

class NumeroPrimo(override val valor: Int) : Numero {
    override fun esTipo(): Boolean {
        if (valor < 2) return false
        for (i in 2 until valor) {
            if (valor % i == 0) return false
        }
        return true
    }
}

fun contarTiposDeNumeros(n: Int) {
    if (n <= 0) {
        println("El valor de N debe ser mayor que 0.")
        return
    }

    var countPar = 0
    var countImpar = 0
    var countPrimo = 0

    for (i in 1..n) {
        val numeroPar = NumeroPar(i)
        val numeroImpar = NumeroImpar(i)
        val numeroPrimo = NumeroPrimo(i)

        if (numeroPar.esTipo()) countPar++
        if (numeroImpar.esTipo()) countImpar++
        if (numeroPrimo.esTipo()) countPrimo++
    }

    println("Total de números pares: $countPar")
    println("Total de números impares: $countImpar")
    println("Total de números primos: $countPrimo")
}

fun main() {
    contarTiposDeNumeros(10)
}
