// Interfaz que define el comportamiento esperado para FizzBuzz
interface FizzBuzzable {
    fun evaluarNumero(numero: Int): String
    fun imprimirResultado(inicio: Int, fin: Int)
}

// Clase que implementa la lógica de FizzBuzz
class FizzBuzz : FizzBuzzable {
    override fun evaluarNumero(numero: Int): String {
        return when {
            numero % 3 == 0 && numero % 5 == 0 -> "FizzBuzz"
            numero % 3 == 0 -> "Fizz"
            numero % 5 == 0 -> "Buzz"
            else -> numero.toString()
        }
    }

    override fun imprimirResultado(inicio: Int, fin: Int) {
        // Validación de rango
        if (inicio <= 0 || fin <= 0 || inicio > fin) {
            println("Rango no válido. Asegúrate de que los números sean positivos y que el inicio sea menor o igual al fin.")
            return
        }

        for (i in inicio..fin) {
            val resultado = evaluarNumero(i)
            print("$resultado ")

            // Imprimir una nueva línea después de cada 10 elementos
            if (i % 10 == 0) println()
        }
    }
}

// Función principal donde se ejecuta el programa
fun main() {
    val fizzBuzz = FizzBuzz()
    fizzBuzz.imprimirResultado(1, 100) // Imprime los resultados de FizzBuzz del 1 al 100
}
