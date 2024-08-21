package com.example.littlelemon

import kotlin.random.Random

data class MenuItem(
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val category: String // New category property
)

val categories = listOf("Starters", "Mains", "Desserts", "Drinks")

fun getRandomCategory(): String {
    return categories[Random.nextInt(categories.size)]
}

val sampleMenuItems = listOf(
    MenuItem(
        name = "Classic Margherita Pizza",
        description = "The famous Margherita pizza with fresh mozzarella, tomato sauce, and basil leaves.",
        price = 10.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/1.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Vegetarian Stir-Fry",
        description = "A medley of fresh vegetables stir-fried with tofu, ginger, garlic, and soy sauce.",
        price = 12.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/2.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Chocolate Chip Cookies",
        description = "Crispy on the edges, soft in the center with plenty of chocolate chips.",
        price = 5.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/3.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Chicken Alfredo Pasta",
        description = "Creamy Alfredo sauce over fettuccine with tender chicken and parmesan cheese.",
        price = 14.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/4.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Mango Salsa Chicken",
        description = "Grilled chicken served with a fresh mango salsa and rice.",
        price = 13.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/5.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Quinoa Salad with Avocado",
        description = "Healthy quinoa salad with avocado, cherry tomatoes, and feta cheese.",
        price = 11.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/6.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Tomato Basil Bruschetta",
        description = "Crispy baguette slices topped with fresh tomatoes, basil, and balsamic glaze.",
        price = 6.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/7.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Beef and Broccoli Stir-Fry",
        description = "Tender beef slices stir-fried with broccoli in a savory soy-oyster sauce.",
        price = 15.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/8.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Caprese Salad",
        description = "A classic Italian salad with tomatoes, fresh mozzarella, and basil.",
        price = 9.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/9.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Shrimp Scampi Pasta",
        description = "Linguine pasta tossed in a garlic-butter sauce with shrimp and lemon.",
        price = 16.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/10.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Chicken Biryani",
        description = "Aromatic basmati rice layered with marinated chicken, spices, and fried onions.",
        price = 18.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/11.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Chicken Karahi",
        description = "Spicy Pakistani-style chicken cooked in a tomato and green chili base.",
        price = 14.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/12.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Aloo Keema",
        description = "Ground beef cooked with diced potatoes in a rich, spiced gravy.",
        price = 13.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/13.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Chapli Kebabs",
        description = "Flat, spiced beef patties shallow fried to perfection, served with naan.",
        price = 11.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/14.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Saag (Spinach) with Makki di Roti",
        description = "Mustard greens cooked with spices, served with cornmeal flatbread.",
        price = 12.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/15.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Japanese Ramen Soup",
        description = "Ramen noodles in a savory chicken broth with vegetables and soft-boiled egg.",
        price = 16.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/16.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Moroccan Chickpea Tagine",
        description = "A hearty stew of chickpeas, vegetables, and spices served with couscous.",
        price = 14.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/17.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Korean Bibimbap",
        description = "A bowl of rice topped with beef bulgogi, vegetables, and a fried egg.",
        price = 17.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/18.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Greek Moussaka",
        description = "Layered eggplant, ground meat, and béchamel sauce baked to perfection.",
        price = 18.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/19.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Butter Chicken (Murgh Makhani)",
        description = "Tender chicken cooked in a creamy tomato sauce with spices and butter.",
        price = 19.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/20.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Thai Green Curry",
        description = "Chicken simmered in coconut milk with green curry paste and vegetables.",
        price = 16.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/21.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Mango Lassi",
        description = "A refreshing yogurt-based drink with ripe mangoes and a hint of cardamom.",
        price = 5.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/22.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Italian Tiramisu",
        description = "Layers of espresso-soaked ladyfingers with mascarpone cheese and cocoa.",
        price = 6.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/23.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Turkish Kebabs",
        description = "Grilled lamb kebabs served on flatbread with tahini sauce and parsley.",
        price = 15.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/24.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Blueberry Banana Smoothie",
        description = "A healthy smoothie made with blueberries, banana, and Greek yogurt.",
        price = 4.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/25.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Mexican Street Corn (Elote)",
        description = "Grilled corn on the cob topped with mayo, Cotija cheese, and chili powder.",
        price = 3.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/26.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Russian Borscht",
        description = "A hearty beet soup with cabbage, potatoes, and sour cream.",
        price = 9.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/27.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "South Indian Masala Dosa",
        description = "Crispy fermented rice crepes filled with spiced potato filling.",
        price = 8.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/28.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Lebanese Falafel Wrap",
        description = "Falafel wrapped with fresh vegetables and tahini sauce in a warm pita.",
        price = 7.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/29.webp",
        category = getRandomCategory()
    ),
    MenuItem(
        name = "Brazilian Caipirinha",
        description = "A refreshing cocktail made with cachaça, lime, and sugar.",
        price = 6.99,
        imageUrl = "https://cdn.dummyjson.com/recipe-images/30.webp",
        category = getRandomCategory()
    )
)
