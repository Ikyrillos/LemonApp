package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    // Remember the NavController instance
    val navController = rememberNavController()

    // Create or retrieve the UserViewModel instance
    val userViewModel: UserViewModel = viewModel()

    // Set up the MainNavHost
    MainNavHost(navController = navController, viewModel = userViewModel)
}
