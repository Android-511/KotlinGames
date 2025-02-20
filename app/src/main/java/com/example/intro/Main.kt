package com.example.intro
const val constante = "NO"

fun main(){
    println("Hola mundo")

    //Variables mutables

    var age : Int = 27

    println(age)

    val name = "Diego"
    val numero : Int = 43

    val lista = listOf<Int>(1,2,3,4,5,4444,56)

    println(lista)
    println(constante)

    val base: Double = 3.2
    val altura : Int = 4
    val rango : IntRange = 1..2

    val area : Double = base*altura

    println("La area de tu madre esa es $area")

    //Escructuras de control

    //if

    val num = 10
    if (num > 0){
        println("Tu numero es mayor a 0")
    } else{
        println("Tu numero es menor que 0")
    }

    //For

    for (i in rango){
        println(i)
    }

    //While

    var counter = 2

    while (counter<=5){
        println("Contador es $counter")
        counter++
    }

    //when

    val a = 2

    when (a){
        1 -> println("Hola 1")
        2 -> println("hola 2")
        else -> println("no nada")
    }

    //break continue

    for (i in 1..10){
        if (i == 5){
            break
        }
        println(i)
    }

    val day = if (a ==3) "Viernes" else "Otro dia"

    println(day)

    try {
        val division = 4/0
        println("Buena division")
    }
    catch (e:Exception){
        println(e.toString())
        println("No se puedo hacer esa madre")
    }
    finally {
        println("Se realizo la operacion")
    }

    var nombres = mutableListOf("juan4", "pedro juan", "pedrusco", "carlos", "diego", "patricio")

    var nombresFiltro = nombres.filter { it.contains("juan") }

    var numerosFiltro = lista.filter { it.toString().contains ("4") }

    println(nombresFiltro)
    println(numerosFiltro)






}