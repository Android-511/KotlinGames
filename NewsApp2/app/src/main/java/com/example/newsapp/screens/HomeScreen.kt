package com.example.newsapp.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.components.NewCard
import com.example.newsapp.components.NewsInfo
import com.example.newsapp.components.TabBar
import com.example.newsapp.models.newsList
import com.example.newsapp.ui.theme.NewsAppTheme
import com.example.newsapp.ui.theme.primaryColor
import com.example.newsapp.utils.Icon10mp


@Composable
fun HomeScreen( innerPadding:PaddingValues){
    var counter by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)

    ){
        OutlinedTextField(
            value = " ",
            onValueChange = { },
            placeholder = { Text("Buscar...")},
            leadingIcon = { Image(imageVector = Icon10mp, contentDescription = null )},
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier.fillMaxWidth()
        )

        //Tab var
        TabBar()

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Ultimas noticias",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(20.dp))


        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(newsList){
                news -> NewCard(news = news)
            }
        }

        Text(text = "Alrededor del mundo",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 20.dp)
            )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            items(newsList){
                news -> NewsInfo(news = news)
            }
        }
    }


}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL
)

@Composable
fun HomeScreenPreview(){
    NewsAppTheme {
        HomeScreen(innerPadding = PaddingValues(28.dp))
    }
}