package com.example.proyecto1.ui.theme.components

import androidx.compose.material.TopAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun TopBar(tittle: String, navController: NavController,
           backButton: Boolean){
    TopAppBar(
        colors = topAppBarColors(
            containerColor = Color.Black,
            tittleContentColor = Color.White
        ),
        tittle = {
            Text(tittle)
        },
        navigationIcon = {if (backButton){
            IconButton(onClick = {navController.navigateUp()}) {
                Icon(
                    imageVector = Icon.AutoMirrored.Filled.KeyBoardArrowLeft,
                    contenctDescription = "Go to previous Screen"
                )

            }
        }
        }

    )
}