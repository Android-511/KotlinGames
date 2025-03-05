package com.example.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.models.News
import com.example.newsapp.models.newsList
import com.example.newsapp.ui.theme.NewsAppTheme
import com.example.newsapp.ui.theme.primaryColor
import com.example.newsapp.utils.formatDate

@Composable
fun NewCard(news: News){
    Box(
        modifier = Modifier.clip(RoundedCornerShape(24.dp)).background(primaryColor).height(200.dp).width(300.dp).padding(15.dp)
    ){

        Text(text = news.title, modifier = Modifier.align(Alignment.Center), fontSize = 25.sp, color = Color.White, fontWeight = FontWeight.Bold)
        Text(text = formatDate(news.date), modifier = Modifier.align(Alignment.BottomStart))
    }

}

@Preview

@Composable
fun NewsCardPreview(){
    NewsAppTheme {
        NewCard(news = newsList[0])
    }
}