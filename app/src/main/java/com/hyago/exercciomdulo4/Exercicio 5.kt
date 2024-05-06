package com.hyago.exercciomdulo4

fun main() {
    val listaDeNomes = listOf("Pedro", "Rafael", "Bruna", "Natália")
    val listaModificada = listaDeNomes.map{"Olá $it"}

    listaModificada.forEach{
        println(it)
    }
}