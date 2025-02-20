package com.example.games

fun main(){
    println("Ingresa tu opcion para jugar \n" +
            "1.- Tijeras \n" +
            "2.- Papel\n" +
            "3.- Roca\n")

    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null && choiceInput in 1..3

//    if (choiceInput != null && choiceInput in 1..3){
//        isValidInput = true
//    }

    while (!isValidInput){
        println("Entrada no valida. Por ingresa una opcion nueva")
        println(
                "1.- Tijeras \n" +
                "2.- Papel\n" +
                "3.- Roca\n")
        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput = choiceInput != null && choiceInput in 1..3

    }

    val computerOption = (1..3).random()

    val compu = when{
        computerOption == 1 -> "Tijeras"
        computerOption == 2 -> "Papel"
        computerOption == 3 -> "Roca"
        else -> "XD"
    }

    val winner = when{
        choiceInput == computerOption -> "Empate"
        choiceInput ==1 && computerOption == 2 -> "Gana tijera"
        choiceInput ==2 && computerOption == 3 -> "Gana papel"
        choiceInput == 3 && computerOption == 1 -> "Gana piedra"
        else -> "Perdiste pa"
    }

    println("$winner, la computadora selecciono $compu")

    val opcion = true





}