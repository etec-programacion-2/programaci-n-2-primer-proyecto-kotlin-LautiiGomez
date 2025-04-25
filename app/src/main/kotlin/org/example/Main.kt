// Primer consigna: Configuración inicial
// Autor: Lautaro Gómez Salvi
// Fecha: 2025-04-22

package org.example

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

fun AreaRectangulo(base: Double, altura: Double) {
    val area: Double = base * altura
    println("El área del rectángulo es: $area")
}

fun numeros() {
    val base: Double = 8.5
    val altura: Double = 4.3

    AreaRectangulo(base, altura)
}

// Tercera consigna: Control de flujo

fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}

// Función alternativa con expresión de una línea
fun esParSimple(numero: Int) = numero % 2 == 0

fun ParOImpar() {
    val numero = 42
    
    if (esPar(numero)) {
        println("$numero es un número par")
    } else {
        println("$numero es un número impar")
    }
    
    // También puedes usar la función directamente en una expresión
    println("17 es ${if (esPar(17)) "par" else "impar"}")
}