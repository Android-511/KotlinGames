package com.example.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.newsapp.models.News
import com.example.newsapp.models.newsList
import com.example.newsapp.ui.theme.NewsAppTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable

fun NewsInfo(news: News) {
    Box(
        modifier = Modifier
            .width(180.dp)
            .height(240.dp)
            .padding(10.dp)
    ) {
        GlideImage(
            model = news.image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(24.dp)),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(24.dp))
                .background(Color.LightGray)
                .align(Alignment.BottomCenter)
                .padding(8.dp)
        )

        {
            Text(
                text = news.title,
                fontSize = 12.sp,
            )
        }
    }
}

@Preview
@Composable
fun NewsInfoPreview() {
    NewsAppTheme {
        NewsInfo(news = newsList[0])
    }
}