package com.example.rdiegofoodapp.components

data class FoodRestaurant(
    val id: Int,
    val title: String,
    val image: String
)

val FoodRestaurantList = listOf(
    FoodRestaurant(
        id = 1,
        title = "McDonal's",
        image = "https://static.vecteezy.com/system/resources/previews/013/948/540/non_2x/mcdonald-s-logo-on-transparent-white-background-free-vector.jpg"
    ),
    FoodRestaurant(
        id = 2,
        title = "Taco Bell",
        image = "https://brandemia.org/sites/default/files/inline/images/logo_taco_bell_antes_0.jpg"
    ),
    FoodRestaurant(
        id = 3,
        title = "Dominos",
        image = "https://media-cdn.tripadvisor.com/media/photo-s/17/85/5a/52/logo-dominos.jpg"
    ),
    FoodRestaurant(
        id = 4,
        title = "China Cuisine",
        image = "https://img.freepik.com/vector-premium/diseno-logotipo-cocina-china-autentica-etiqueta-comida-continental-tradicional-puede-utilizar-vector-menu-restaurante-cafeteria-bar-ilustracion-aislada-sobre-fondo-blanco_178650-13273.jpg"
    ),
    FoodRestaurant(
        id = 5,
        title = "Doner Kebab",
        image = "https://i.pinimg.com/originals/4b/b2/6c/4bb26c022942021721874275327ec145.jpg"
    ),

    )