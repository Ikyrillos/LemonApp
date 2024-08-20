package com.example.littlelemon

data class MenuItem(
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String
)


val sampleMenuItems = listOf(
    MenuItem(
        name = "Greek Salad",
        description = "The famous Greek salad of crispy lettuce, peppers, olives, and our Chicago sauce.",
        price = 12.99,
        imageUrl = "https://example.com/greek_salad.jpg"
    ),
    MenuItem(
        name = "Bruschetta",
        description = "Our Bruschetta is made from grilled bread smeared with garlic and topped with olive oil.",
        price = 8.99,
        imageUrl = "https://example.com/bruschetta.jpg"
    ),
    MenuItem(
        name = "Pasta Carbonara",
        description = "Creamy pasta carbonara made with eggs, cheese, pancetta, and pepper.",
        price = 15.99,
        imageUrl = "https://example.com/pasta_carbonara.jpg"
    )
)
