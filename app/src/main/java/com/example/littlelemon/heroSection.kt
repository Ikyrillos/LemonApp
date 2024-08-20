package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun HeroSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Little Lemon Chicago", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
        Text("We are a family-owned Mediterranean restaurant focused on traditional recipes served with a modern twist.")
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = "", onValueChange = {}, placeholder = { Text("Search") })
    }
}
