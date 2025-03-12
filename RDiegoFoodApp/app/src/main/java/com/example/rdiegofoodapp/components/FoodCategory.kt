package com.example.rdiegofoodapp.components


data class FoodCategory(
    val id: Int,
    val title: String,
    val image: String
)

val FoodCategoryList = listOf(
    FoodCategory(
        id = 1,
        title = "Comida rapida",
        image = "https://www.pngmart.com/files/5/Hamburger-PNG-File.png"

    ),
    FoodCategory(
        id = 2,
        title = "Mexicana",
        image = "https://www.pngmart.com/files/22/Taco-Bell-PNG.png"
    ),
    FoodCategory(
        id = 3,
        title = "Italiana",
        image = "https://www.pngmart.com/files/1/Pizza-Slice.png"
    ),
    FoodCategory(
        id = 4,
        title = "China",
        image = "https://www.pngmart.com/files/5/Avocado-Roll-PNG-Image.png"
    ),
    FoodCategory(
        id = 5,
        title = "Arabe",
        image = "https://www.pngmart.com/files/22/Doner-PNG-HD-Isolated.png"
    ),

)