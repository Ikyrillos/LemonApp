package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, viewModel: UserViewModel) {
    val menuItems by viewModel.menuItems.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Little Lemon") }

            )
        },
        content = { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                HeroSection()
                FoodMenuList(menuItems = menuItems)
            }
        }
    )
}

@Composable
fun FoodMenuList(menuItems: List<MenuItem>) {
    LazyColumn {
        items(menuItems) { item ->
            MenuItemCard(item)
        }
    }
}

@Composable
fun MenuItemCard(menuItem: MenuItem) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = rememberAsyncImagePainter(menuItem.imageUrl),
            contentDescription = null,
            modifier = Modifier.size(64.dp) // Adjust the size as needed
        )
        Column(modifier = Modifier.padding(start = 8.dp)) {
            Text(menuItem.name, fontWeight = FontWeight.Bold)
            Text(menuItem.description)
            Text("\$${menuItem.price}")
        }
    }
}
