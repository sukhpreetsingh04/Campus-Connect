package com.sukhpreet.campusconect

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sukhpreet.campusconect.ui.theme.Poppins

@Composable
fun SplashScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFE3F2FD),
                        Color(0xFF90CAF9)
                    )
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Campus",
            fontFamily = Poppins,
            color = Color(0xFF1E245B),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
        )
        Text(
            text = "Connect",
            fontFamily = Poppins,
            style = TextStyle(
                Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF4D6FFF),
                        Color(0xFF6A5BFF),
                        Color(0xFFC64ED8)
                    )
                )
            ),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp
        )
    }
}