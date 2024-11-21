package com.example.proyecto1


import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.proyecto1.ui.theme.screens.HomeScreen
import com.example.proyecto1.ui.theme.screens.MenuScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.proyecto1.ui.theme.screens.ComponentScreen
import com.example.proyecto1.ui.theme.screens.LoginScreen
import com.example.proyecto1.ui.theme.biometrics.BiometricsScreen
import com.example.proyecto1.ui.theme.location.MapsSearchView
import com.example.proyecto1.ui.theme.screens.APisScreen
import com.example.proyecto1.ui.theme.screens.BackGroundTaskScreen
import com.example.proyecto1.ui.theme.screens.CameraScreen


class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMultiScreenApp()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ComposeMultiScreenApp(){
    val navController = rememberNavController()
    Surface(color = Color.White) {
        SetupNavGraph(navController = navController)
    }
}

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController,startDestination = "menu"){
        composable("menu"){ MenuScreen(navController) }

        composable("home"){ HomeScreen(navController) }

        composable("component"){ ComponentScreen(navController) }

        composable("login"){ LoginScreen(navController) }

        composable("BackTask"){ BackGroundTaskScreen() }

        composable("ApiScreen") { APisScreen(navController) }

        composable("MapsSearchView/{lat}/{long}/{address}") { backStackEntry ->
            val lat = backStackEntry.arguments?.getString("lat")?.toDouble() ?: 0.0
            val long = backStackEntry.arguments?.getString("long")?.toDouble() ?: 0.0
            val address = backStackEntry.arguments?.getString("address") ?: ""
            MapsSearchView(lat, long, address)
        }
        composable("BiometricsScreen") { BiometricsScreen() }

        composable("CameraScreen") {
            CameraScreen(context = LocalContext.current)

        }
    }
}
