package com.example.games

import kotlin.reflect.typeOf

fun main(){
    println("Dame un numero y te dire si es primo")
    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null

    while (!isValidInput){
        println("Opcion invalida, dame otra opcion")
        println("Dame un numero y te dire si es primo")

        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput = choiceInput != null
    }

    var j=0

    for (i in 1..choiceInput!!){
        var x = choiceInput / i
            if (choiceInput % i ==0){
                j = j+1
            }else{
                j=j
            }
    }
    var valorPrimo = false

    if (j==2){
        valorPrimo = true
    }else{
        valorPrimo = false
    }

    var primo = when {
        valorPrimo == true -> "Si es primo"
        valorPrimo == false -> "No es primo"
        else -> "Nadota"
    }
    println(primo)



}