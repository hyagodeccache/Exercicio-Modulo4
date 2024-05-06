package com.hyago.exercciomdulo4

fun main() {
    println(calculadora(2, 5) {a, b -> a + b})
    println(calculadora(2, 5) {a, b -> a * b})

}

fun calculadora(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a,b)
}