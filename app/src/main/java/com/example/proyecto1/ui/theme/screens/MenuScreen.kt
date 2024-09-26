package com.example.proyecto1.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {
    Column {
        Text(text = "This is the Menu Screen")
        Button(onClick = { navController.navigate("Component") }) {
            Text(text = "Go to Home")
        }
    }
}