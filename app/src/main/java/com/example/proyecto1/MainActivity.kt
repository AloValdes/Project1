package com.example.proyecto1

import android.graphics.Picture
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.proyecto1.ui.theme.screens.HomeScreen
import com.example.proyecto1.ui.theme.screens.MenuScreen
import java.security.AccessController

import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.proyecto1.ui.theme.screens.ComponentScreen
import com.example.proyecto1.ui.theme.screens.LoginScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            multiScreenApp()
        }
    }
}


@Composable
fun multiScreenApp(){
    val navController=rememberNavController()
    Surface (color = Color.White){
        setupNavGraph(navController=navController)
    }
}

@Composable
fun setupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Login") {
        composable("Menu") {
            MenuScreen(navController)
        }
        composable("Home") {
            HomeScreen(navController)
        }
        composable("Components") {
            ComponentScreen(navController)
        }
        composable("Login") {
            LoginScreen(navController)
        }
    }
}