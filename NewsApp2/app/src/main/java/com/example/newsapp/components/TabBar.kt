package com.example.newsapp.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.primaryColor

@Composable
fun TabBar(){

    var selectedTab by remember {
        mutableStateOf("Noticias")
    }

    Row(

        modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable {
                Log.i("HomeScreenJuan", "Presionando columna noticias")
                selectedTab = "Noticias"
            }
        ){
            Text(text = "Noticias",
                fontSize = 25.sp,
                fontWeight = if(selectedTab == "Noticias") FontWeight.Bold else FontWeight.Normal,
                color =  if(selectedTab == "Noticias") Color.Black else Color.LightGray


            )
            if(selectedTab == "Noticias"){
                Box(modifier = Modifier
                    .height(5.dp)
                    .width(45.dp)
                    .background(primaryColor))
            }

        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable {
                Log.i("HomeScreenJuan", "Presionando columna noticias")
                selectedTab = "Eventos"
            }
        ){
            Text(text = "Eventos",
                fontSize = 25.sp,
                fontWeight = if(selectedTab == "Eventos") FontWeight.Bold else FontWeight.Normal,
                color =  if(selectedTab == "Eventos") Color.Black else Color.LightGray
            )
            if(selectedTab == "Eventos"){
                Box(modifier = Modifier
                    .height(5.dp)
                    .width(45.dp)
                    .background(primaryColor))
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable {
                Log.i("HomeScreenJuan", "Presionando columna noticias")
                selectedTab = "Clima"
            }
        ){
            Text(text = "Clima",
                fontSize = 25.sp,
                fontWeight = if(selectedTab == "Clima") FontWeight.Bold else FontWeight.Normal,
                color =  if(selectedTab == "Clima") Color.Black else Color.LightGray


            )
            if(selectedTab == "Clima"){
                Box(modifier = Modifier
                    .height(5.dp)
                    .width(45.dp)
                    .background(primaryColor))
            }
        }
    }
}