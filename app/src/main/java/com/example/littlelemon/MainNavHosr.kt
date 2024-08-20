package com.example.littlelemon

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MainNavHost(navController: NavHostController, viewModel: UserViewModel) {
    NavHost(navController = navController, startDestination = "onboarding_screen") {

        composable("onboarding_screen") { RegisterScreen(navController, viewModel) }
        composable("home_screen") { HomeScreen(navController, viewModel) }
        composable("profile_screen") { ProfileScreen(navController, viewModel) }
    }
}
