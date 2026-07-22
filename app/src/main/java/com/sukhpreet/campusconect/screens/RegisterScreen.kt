package com.sukhpreet.campusconect.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.sukhpreet.campusconect.components.RegistrationCard

@Composable
fun RegisterScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFFE3F2FD),
                    Color(0xFF90CAF9),
                    Color(0xFFE3F2FD),
                    Color(0xFF90CAF9)
                )
            )
        ) ) {
        RegistrationCard()
    }
}