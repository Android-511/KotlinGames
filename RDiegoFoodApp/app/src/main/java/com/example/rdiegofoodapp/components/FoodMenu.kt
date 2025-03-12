package com.example.rdiegofoodapp.components


data class FoodMenu(
    val id: Int,
    val title: String,
    val image: String,
    val stars: String,
    val price: String
)

val FoodMenuList = listOf(
    FoodMenu(
        id = 1,
        title = "Whopper",
        image = "https://i.pinimg.com/736x/30/da/bb/30dabb70456d9b49b0146b4ef430a336.jpg",
        stars = "4.5",
        price =  "$99.8"

    ),
    FoodMenu(
        id = 2,
        title = "Fries",
        image = "https://mcdonalds.com.lb/storage/menu-products/Fries-Large.png",
        stars = "4.3",
        price =  "$59.8"

    ),
    FoodMenu(
        id = 3,
        title = "Big Mac",
        image = "https://www.pngplay.com/wp-content/uploads/15/Mcdonalds-Big-Mac-Free-PNG.png",
        stars = "4.6",
        price =  "$79.8"

    ),
    FoodMenu(
        id = 4,
        title = "McFlurry",
        image = "https://mcdonalds.com.lb/storage/menu-products/McFlurry-KitKat.png",
        stars = "4.7",
        price =  "$49.8"

    ),
    FoodMenu(
        id = 5,
        title = "Fried Chicken",
        image = "https://i.pinimg.com/736x/f8/e0/71/f8e07194f099ea408e87c50ae796cda6.jpg",
        stars = "4.9",
        price =  "$27.4"

    ),

    )