package com.example.proyecto1

import android.os.Build
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.proyecto1.ui.theme.screens.HomeScreen
import com.example.proyecto1.ui.theme.screens.MenuScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.google.accompanist.insets.ProvideWindowInsets
import com.example.proyecto1.ui.theme.screens.APisScreen
import com.example.proyecto1.ui.theme.screens.ComponentsScreen
import com.example.proyecto1.ui.theme.screens.LoginScreen
import com.google.accompanist.insets.ProvideWindowInsets
import com.example.proyecto1.ui.theme.biometrics.BiometricsScreen
import com.example.proyecto1.ui.theme.location.MapsSearchView
import com.example.proyecto1.ui.theme.screens.CameraScreen


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Establecer contenido usando Jetpack Compose
        setContent {
            ProvideWindowInsets {

                ComposeMultiScreenApp(this)
            }
        }
    }
}

@Composable
fun ComposeMultiScreenApp(activity: AppCompatActivity) {
    val navController = rememberNavController()
    Surface(color = Color.White) {
        SetupNavGraph(navController = navController, activity = activity)
    }
}

@Composable
fun SetupNavGraph(navController: NavHostController, activity: AppCompatActivity) {
    NavHost(navController = navController, startDestination = "biometrics") {
        composable("menu") { MenuScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("components") { ComponentsScreen(navController) }
        composable("biometrics"){ BiometricsScreen(navController = navController, activity = activity) }

        composable("login") { LoginScreen(navController) }
        composable("apis") { APisScreen(navController) }
        composable("MapsSearchView/{lat}/{long}/{address}") { backStackEntry ->
            val lat = backStackEntry.arguments?.getString("lat")?.toDouble() ?: 0.0
            val long = backStackEntry.arguments?.getString("long")?.toDouble() ?: 0.0  // Convert to Double here
            val address = backStackEntry.arguments?.getString("address") ?: ""
            MapsSearchView(lat, long, address)
        }
        composable("CameraScreen") {
            CameraScreen(context = LocalContext.current)

        }
    }
}
