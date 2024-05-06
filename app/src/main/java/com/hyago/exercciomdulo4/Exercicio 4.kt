package com.hyago.exercciomdulo4

fun main() {
    val listaDeInteiros = (1..99).toList()
    val numerosPares = listaDeInteiros.filter { it % 2 == 0}

    println(numerosPares)
}

