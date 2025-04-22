// Primer consigna: Configuración inicial
// Autor: Lautaro Gómez Salvi
// Fecha: 2025-04-22

fun main() {
    println("¡Hola, Kotlin!")
}

fun alumno() {
    println("Lautaro Gómez Salvi")
    println("2025-04-22")
}

// Segunda consigna: Variables y Tipos de Datos
// Para crear variables, podemos usar dos palabras reservadas: var(variables mutables) y val(variables inmutables). Para escribir la variable, usamos la palabra reservada seguida del nombre de la variable y el tipo de datos.

fun VariablesyTiposDeDatos() {
    val nombre: String = "Lauti"
    var edad: Int = 16
    var altura: Double = 1.70
    val Colegio: Boolean = true

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Colegio: $Colegio")
}

fun AreaRectangulo(Base: Double, Altura: Double) {
    val area = Base * Altura
    println("La área del rectángulo es $area")
}

fun numeros() {
    var Base = 10.5
    var Altura = 5.0

    AeaRectangulo(Base, Altura)
}