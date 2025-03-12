package com.example.rdiegofoodapp.models

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.rdiegofoodapp.components.FoodCategoryList
import com.example.rdiegofoodapp.components.FoodMenu
import com.example.rdiegofoodapp.components.FoodMenuList
import com.example.rdiegofoodapp.components.FoodRestaurantList
import com.example.rdiegofoodapp.ui.theme.RDiegoFoodAppTheme
import com.example.rdiegofoodapp.ui.theme.estrella
import com.example.rdiegofoodapp.ui.theme.redApp
import com.example.rdiegofoodapp.utils.StarFull
import com.example.rdiegofoodapp.utils.UserCircle

@OptIn(ExperimentalGlideComposeApi::class)

@Composable
fun Menu( menu : FoodMenu){
    Column {
        Box(
            modifier = Modifier
                .width(160.dp)
                .height(160.dp)
                .padding(10.dp)
        ){

            GlideImage(
                model = menu.image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(redApp)
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .height(20.dp)
                    .width(50.dp)
                    ,contentAlignment = Alignment.TopCenter
            )

            {
                Text(
                    text = menu.price,
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Start

                )
            }


        }
        Box(
            modifier = Modifier
                .width(160.dp)
                .height(50.dp)
                .padding(4.dp)
        ){
            Row {

                Icon(
                    imageVector = StarFull,
                    contentDescription = "Star",
                    modifier = Modifier.size(20.dp),
                    tint = estrella
                )

                Text(
                    text = menu.stars,
                    fontSize = 15.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )

                Text(
                    text = menu.title,
                    fontSize = 15.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxSize())


            }

        }
    }


}

@Preview
@Composable
fun MenuPreview() {
    RDiegoFoodAppTheme {
        Menu(menu = FoodMenuList[1])
    }
}
