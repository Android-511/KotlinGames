package com.example.rdiegofoodapp.models

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.rdiegofoodapp.components.FoodCategory
import com.example.rdiegofoodapp.components.FoodCategoryList
import com.example.rdiegofoodapp.ui.theme.RDiegoFoodAppTheme
import com.example.rdiegofoodapp.ui.theme.redApp


@OptIn( ExperimentalGlideComposeApi::class)

@Composable
fun Category(category: FoodCategory){

    Column(modifier = Modifier.width(100.dp).height(130.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
             {

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .background(redApp)
                .height(100.dp)
                .width(100.dp)
                .padding(16.dp),
                contentAlignment = Alignment.Center
        ){
            GlideImage(
                model = category.image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )

        }

        Box(
            modifier = Modifier
                .height(50.dp)
                .width(150.dp),
                contentAlignment = Alignment.TopCenter  ) {
            Text(
                text = category.title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Start // Centra el texto horizontalmente
            )
        }


    }




}

@Preview
@Composable
fun CategoryPreview() {
    RDiegoFoodAppTheme {
        Category(category = FoodCategoryList[0])
    }
}

