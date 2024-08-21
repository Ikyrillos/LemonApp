package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, viewModel: UserViewModel) {
    val menuItems by viewModel.menuItems.collectAsState()
    var searchText by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("All") }

    // Filter menu items based on both search text and category
    val filteredMenuItems = menuItems
        .filter {
            (selectedCategory == "All" || it.category == selectedCategory) &&
                    (it.name.contains(searchText, ignoreCase = true) || it.description.contains(searchText, ignoreCase = true))
        }

    // Function to handle category selection and update the selected category
    fun filterCategory(category: String) {
        selectedCategory = category
    }

    // Function to clear both search and category filters
    fun clearFilters() {
        searchText = ""
        selectedCategory = "All"
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Little Lemon") },
                actions = {
                    IconButton(
                        onClick = { navController.navigate("profile_screen") },
                        modifier = Modifier.padding(end = 16.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile Picture"
                        )
                    }
                }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(16.dp)
            ) {
                HeroSection(
                    searchText = searchText,
                    onSearchTextChanged = { searchText = it },
                    onClearSearch = { clearFilters() }
                )
                Spacer(modifier = Modifier.height(16.dp))


                    CategoryButtons(
                        onCategorySelected = { filterCategory(it) },
                        selectedCategory = selectedCategory
                    )
                if (searchText.isNotEmpty() || selectedCategory != "All") {
                    Button(
                        onClick = { clearFilters() },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.error
                        )
                    ) {
                        Text("Clear All")
                    }
                }



                Spacer(modifier = Modifier.height(16.dp))
                FoodMenuList(menuItems = filteredMenuItems)
            }
        }
    )
}

@Composable
fun HeroSection(
    searchText: String,
    onSearchTextChanged: (String) -> Unit,
    onClearSearch: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Column {
                Text(
                    text = "Little Lemon",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
                Text(
                    text = "Chicago",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Light,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "We are a family-owned Mediterranean restaurant, focused on traditional recipes served with a modern twist.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Food Image Placeholder",
                modifier = Modifier
                    .size(100.dp)
                    .clip(MaterialTheme.shapes.medium),
                tint = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Search Bar with Clear IconButton
        OutlinedTextField(
            value = searchText,
            onValueChange = { onSearchTextChanged(it) },
            placeholder = { Text("Enter search phrase") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon"
                )
            },
            trailingIcon = {
                if (searchText.isNotEmpty()) {
                    IconButton(onClick = { onClearSearch() }) {
                        Icon(
                            imageVector = Icons.Default.Clear,
                            contentDescription = "Clear Search"
                        )
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun CategoryButtons(onCategorySelected: (String) -> Unit, selectedCategory: String) {
    val categories = listOf("Starters", "Mains", "Desserts", "Drinks")

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        categories.forEach { category ->
            Button(
                onClick = { onCategorySelected(category) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (selectedCategory == category) MaterialTheme.colorScheme.primary else Color.Gray,
                    contentColor = if (selectedCategory == category) Color.White else Color.Black
                )
            ) {
                Text(category)
            }
        }
    }
}

@Composable
fun FoodMenuList(menuItems: List<MenuItem>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(menuItems) { item ->
            MenuItemCard(item)
        }
    }
}

@Composable
fun MenuItemCard(menuItem: MenuItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(menuItem.imageUrl),
            contentDescription = menuItem.name,
            modifier = Modifier
                .size(80.dp)
                .clip(MaterialTheme.shapes.medium)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = menuItem.name,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = menuItem.description,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 2
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "\$${menuItem.price}",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
