package com.example.newsapp.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun formatDate(date: Date): String {
    val formatter = SimpleDateFormat("MMMM dd - yyyy", Locale("es", "ES"))
    return formatter.format(date)
}