package com.example.proyecto1.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is the Menu Screen")
        Button(onClick = { navController.navigate("home") }) {
            Text("Go to Home")

        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("component") }) {
            Text(text = "Go to Components")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("BackTask") }) {
            Text("Go to Background tasks")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {navController.navigate("BiometricsScreen")}) {
            Text("Go to Biometrics")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {navController.navigate("wifidatos")}) {
            Text("Go to Wifi-Datos")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {navController.navigate("ApiScreen")}) {
            Text("Go to the other API´s")
        }

    }
}