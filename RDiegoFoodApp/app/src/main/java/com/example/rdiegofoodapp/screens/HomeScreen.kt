package com.example.rdiegofoodapp.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rdiegofoodapp.components.FoodCategoryList
import com.example.rdiegofoodapp.components.FoodMenuList
import com.example.rdiegofoodapp.components.FoodRestaurantList
import com.example.rdiegofoodapp.models.Category
import com.example.rdiegofoodapp.models.Menu
import com.example.rdiegofoodapp.models.Restaurant
import com.example.rdiegofoodapp.ui.theme.RDiegoFoodAppTheme
import com.example.rdiegofoodapp.ui.theme.redApp
import com.example.rdiegofoodapp.utils.Logout
import com.example.rdiegofoodapp.utils.UserCircle


@Composable
fun HomeScreen(innerPadding: PaddingValues){
Column( modifier = Modifier
    .fillMaxSize()
    .padding(22.dp))
{

    Row(
    ) {
        Icon(
            imageVector = UserCircle,
            contentDescription = "Usuario",
            modifier = Modifier.size(40.dp),
            tint = Color(0xFFFF0000)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = "Hola, Juan",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 1.dp).padding(vertical = 5.dp) ,
        )

        Spacer(modifier = Modifier.width(167.dp))

        Icon(
            imageVector = Logout,
            contentDescription = "Usuario",
            modifier = Modifier.size(35.dp),
            tint = Color(0xFFFF0000)
        )

    }

    Text(
        text = "Nuestras categorias",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 15.dp)
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    )
    {
        items(FoodCategoryList){
                category -> Category(category = category)
        }
    }

    Text(
        text = "Busca los mejores restaurantes",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 15.dp)
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    )
    {
        items(FoodRestaurantList){
                restaurant -> Restaurant(restaurant = restaurant)
        }
    }

    Text(
        text = "Nuestras mejores comidas",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 15.dp)
    )

    LazyVerticalGrid (

        columns = GridCells.Fixed(2))

        {

        items(FoodMenuList){
                menu -> Menu(menu = menu)
        }
    }




}


}



@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_6
)

@Composable
fun HomeScreenPreview(){
    RDiegoFoodAppTheme {
        HomeScreen(innerPadding = PaddingValues(28.dp))
    }
}