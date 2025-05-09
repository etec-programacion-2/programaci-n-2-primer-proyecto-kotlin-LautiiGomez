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
// Para usar el control de flujo, usamos las palabras reservadas if, else, when, try, catch, finally.

fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}

fun ParOImpar() {
    val numero = 42
    
    if (esPar(numero)) {
        println("$numero es un número par")
    } else {
        println("$numero es un número impar")
    }
    
    println("17 es ${if (esPar(17)) "par" else "impar"}")
}

// Cuarta consigna: Loops
// Para usar los loops, usamos las palabras reservadas while, do, for, in, break, continue.

fun mostrarNumerosCon_For() {
    println("Números del 1 al 10 usando bucle FOR:")
    for (numero in 1..10) {
        println(numero)
    }
}

fun mostrarNumerosCon_While() {
    println("Números del 1 al 10 usando bucle WHILE:")
    var numero = 1
    while (numero <= 10) {
        println(numero)
        numero++
    }
}

fun mostrarNumerosCon_DoWhile() {
    println("Números del 1 al 10 usando bucle DO-WHILE:")
    var numero = 1
    do {
        println(numero)
        numero++
    } while (numero <= 10)
}

fun paresConFor() {
    for (n_p in 2..20 step 2) {
        println(n_p)
    }
}

fun paresConWhile() {
    var n_p = 2
    while (i <= 20) {
        println(i)
        n_p += 2
    }
}

fun paresConDoWhile() {
    var n_p = 2
    do {
        println(n_p)
        n_p += 2
    } while (n_p <= 20)
}


fun imprimir(){
    main()
    println()

    alumno()
    println()

    VariablesyTiposDeDatos()
    println()

    numeros()
    println()

    ParOImpar()
    println()

    mostrarNumerosCon_For()
    println()

    mostrarNumerosCon_While()
    println()

    mostrarNumerosCon_DoWhile()
    println()

    paresConFor()
    println()

    paresConWhile()
    println()

    paresConDoWhile()
    println()
}

// Quinta consigna: Funciones
// Para crear funciones, usamos la palabra reservada fun, seguida del nombre de la función y los parámetros entre paréntesis. Luego, escribimos el cuerpo de la función entre llaves.

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun potencia(base: Int, exponente: Int): Int {
    return if (exponente == 0) 1 else base * potencia(base, exponente - 1)
}

