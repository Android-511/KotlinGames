package com.example.games

fun main(){

    val range = 1..10
    val numerToGuess = range.random()
//    println(numerToGuess)
    println("Adivina el numero del 1 al 10, tienes 3 intentos")

    var attemps = 0

    do {
        var guess = readlnOrNull()?.toIntOrNull()
        attemps ++
        if (attemps >= 3){
            println("Perdiste baboso, el numero era $numerToGuess")
            break
        }
        if (guess != null) {

            when {
                guess < numerToGuess -> println("Ve mas para arriba")
                guess > numerToGuess -> println("Ve mas para abajo")
                else -> println("Felicidades le atinaste pa, en estos intentos: $attemps")
            }

        }

    }

    while (guess != numerToGuess)

}