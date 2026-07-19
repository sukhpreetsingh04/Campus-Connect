package com.sukhpreet.campusconect.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sukhpreet.campusconect.screens.SplashScreen
import com.sukhpreet.campusconect.screens.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "SplashScreen"
    ) {
        composable("SplashScreen") {
            SplashScreen(navController = navController)
        }
        composable("WelcomeScreen") {
            WelcomeScreen()
        }
    }
}