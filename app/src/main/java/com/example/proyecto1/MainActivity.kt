package com.example.proyecto1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.proyecto1.ui.theme.screens.HomeScreen
import com.example.proyecto1.ui.theme.screens.MenuScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.proyecto1.data.database.AppDatabase
import com.example.proyecto1.data.database.DatabaseProvider
import com.example.proyecto1.ui.theme.screens.ComponentScreen
import com.example.proyecto1.ui.theme.screens.ManageServiceScreen


class MainActivity : ComponentActivity() {
    lateinit var database:AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            database = DatabaseProvider.getDatabase(this)
            Log.d("DB", "Database loaded succesfully")
        } catch(exception:Exception){
            Log.d("DB", "error:$exception")
        }

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
    NavHost(navController = navController, startDestination = "Menu") {
        composable("Menu") {
            MenuScreen(navController)
        }
        composable("Home") {
            HomeScreen(navController)
        }
        composable("Components") {
            ComponentScreen(navController)
        }
        composable("Components") {
            ComponentScreen(navController)
        }
        composable("manage-service/{serviceId}"){backStackEntry ->
            val serviceId = backStackEntry.arguments?.getString("serviceId")
            ManageServiceScreen(navController, serviceId = serviceId)
        }
    }
}