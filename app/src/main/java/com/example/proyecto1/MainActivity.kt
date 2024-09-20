package com.example.proyecto1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable
import androidx.compose.ui.platform.LocalContext
import android.widget.Toast
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Inicio") },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Símbolo Buscar")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Info, contentDescription = "Símbolo Bobux")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notificaciones")
                    }
                }
            )
        },
        bottomBar = {
            BottomNavigationBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(5.dp)
        ) {
            //Mi perfil
            LazyRow(modifier = Modifier.padding(bottom = 5.dp)) {
                items(listOf(
                    Pair("Clartix1", res.drawable.yo),
                )) { friend ->
                    FriendItem(name = friend.first, imageResId = friend.second)
                }
            }
//Parte de Amigos


            // Cantidad de amigos
            Text(
                text = "Amigos(7) →",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 5.dp)
            )

            // Parte de amigos
            LazyRow(modifier = Modifier.padding(bottom = 5.dp)) {
                items(listOf(

                    Pair("Amigo 1", R.drawable.amigo1),
                    Pair("Amigo 2", R.drawable.amigo2),
                    Pair("Amigo 3", res.drawable.amigo3),
                    Pair("Amigo 4", res.drawable.amigo4),
                    Pair("Amigo 5", res.drawable.amigo5),
                    Pair("Amigo 6", res.drawable.amigo6),
                    Pair("Amigo 7", res.drawable.amigo7)
                )) { friend ->
                    FriendItem(name = friend.first, imageResId = friend.second)
                }
            }

            // Sección de recomendaciones
            Text(
                "Recomendaciones para ti",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 1.dp)
            )

            // Juegos en dos columnas
            LazyColumn {
                items(listOf(
                    Triple("Dress to Impress", "91%", ),
                    Triple("Come slimes para s..", "72%", ),
                    Triple("Juntos [Juego de Fie...", "83%", res.drawable.juego31),
                    Triple("La Cabaña [HORROR]", "72%", R.drawable.juego41),
                    Triple("Adopt Me", "91%", res.drawable.juego1),
                    Triple("Bee Sim", "56%", res.drawable.juego2),
                    Triple("Piggy", "72%", res.drawable.juego3),
                    Triple("JailBreaker", "83%", res.drawable.juego4),
                    Triple("BorBux", "75%", res.drawable.juego5),
                    Triple("Tower of Hell", "93%", res.drawable.juego6)
                ).chunked(2)) { rowItems ->
                    Row(modifier = Modifier.fillMaxWidth()) {
                        for (item in rowItems) {
                            GameRecommendationItem(
                                gameName = item.first,
                                rating = item.second,
                                imageResId = item.third,
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun BottomNavigationBar() {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        BottomNavigationItem(
            imageResId = res.drawable.home,
            abajo = "Home",
            onClick = { /*TODO*/ }
        )
        BottomNavigationItem(
            imageResId = res.drawable.dest,
            abajo = "Destacados",
            onClick = { /*TODO*/ }
        )
        BottomNavigationItem(
            imageResId = res.drawable.avatar,
            abajo = "Avatar",
            onClick = { /*TODO*/ }
        )
        BottomNavigationItem(
            imageResId = res.drawable.chat,
            abajo = "Chat",
            onClick = { /*TODO*/ }
        )
        BottomNavigationItem(
            imageResId = res.drawable.more,
            abajo = "More",
            onClick = { /*TODO*/ }
        )
    }
}

@Composable
fun BottomNavigationItem(imageResId: Int, abajo: String, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(5.dp)
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = abajo,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
        )
        Text(
            text = abajo,
            fontSize = 10.sp,
            color = Color.White,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Composable
fun FriendItem(name: String, imageResId: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .border(2.dp, Color.Gray, CircleShape)
                .clip(CircleShape)
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(
            name,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 4.dp),
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun GameRecommendationItem(gameName: String, rating: String, imageResId: Int, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(5.dp)
            .padding(5.dp)
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(RectangleShape)
        )

        Spacer(modifier = Modifier.width(5.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                gameName,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                "Valoración: $rating",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
        /*    multiScreenApp()

            /*Column(
                 modifier = Modifier
                     .fillMaxSize()
                     .verticalScroll(rememberScrollState()),
                 verticalArrangement = Arrangement.Center,
                 horizontalAlignment = Alignment.CenterHorizontally
             ) {
                 CustomText()
                 Picture()
                 Content1()


                 // Text(text ="Simple text")
                 // ModifierExample()
                 //ModifierExample2()
                 //  ModifierExample3()
             }
             //Layouts
             Column {
                  Text(text = "First Row")
                  Text(text = "Second Row")
                  Text(text = "Third Row")

                  Row{
                      Text(text = "Text1")
                      Text(text = "Text2")
                      Text(text = "Text3")
                      Text(text = "Text2")
                  }
                  Box{
                      Text(text = "Larabel 1")
                      Text(text = "Larabel 2")

                  }
                  Greeting(name ="World")
              }*/
        }
    }
}

/*private fun column(function: () -> Unit) {

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


//@Preview(showBackground = true)
@Composable
fun ModifierExample() {
    Column(
        modifier = Modifier
            .padding(24.dp)
    ) {
        Text(text = "Hello world")

    }
}

//@Preview(showBackground = true)
@Composable
fun ModifierExample2() {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
            .clickable(onClick = { clickAction() })
    ) {
        Text(text = "Hello world")

    }
}

//@Preview(showBackground = true)
@Composable
fun ModifierExample3() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
            .background(Color.Red)
            .border(width = 2.dp, color = Color.Green)
            .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Hello Item 1")
        Text(text = "Hello Item 2")
        Text(text = "Hello Item 3")
        Text(text = "Hello Item 4")
        Text(text = "Hello Item 5")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomText() {
    Column {
        Text(
            stringResource(R.string.hello_word_text),
            color = colorResource(R.color.purple_500),
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold
        )
        val gradientColors = listOf(Cyan, Blue, Color.Red)
        Text(
            stringResource(R.string.hello_word_text),
            style = TextStyle(brush = Brush.linearGradient(colors = gradientColors))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Picture() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(R.drawable.Leon),
            contentDescription = "Logo Android",
            contentScale = ContentScale.Crop
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Content1() {
    Card(
        modifier = Modifier
            .background(Cyan)
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Text(
            text = "This is a Title",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            painter = painterResource(id = R.drawable.Leon),
            contentDescription = "Logo Android",
            contentScale = ContentScale.Crop
        )
        Text(
            stringResource(R.string.Text_Card),
            textAlign = TextAlign.Justify,
            lineHeight = 18.sp,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BoxExample1(){
    Box(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Image(painterResource(R.drawable.Leon),
            contentDescription = "Android Logo",
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp,150.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                Icons.Filled.AccountCircle,
                contentDescription = "Icon"
            )
            Text(text = "Text")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxExample2(){
    Box(
        modifier = Modifier
            .background(Color.Magenta)
            .padding(5.dp)
            .size(250.dp)
    ) {
        Text(text = "TopStart", Modifier.align(Alignment.TopStart))
        Text(text = "TopEnd", Modifier.align(Alignment.TopEnd))
        Text(text = "CenterStart", Modifier.align(Alignment.CenterStart))
        Text(text = "Center", Modifier.align(Alignment.Center))
        Text(text = "CenterEnd", Modifier.align(Alignment.CenterEnd))
        Text(text = "BottomStart", Modifier.align(Alignment.BottomStart))
        Text(text = "BottomEnd", Modifier.align(Alignment.BottomEnd))
    }
}

fun clickAction() {
    println("Column Clicked")
*
}*/

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
    }
}*/

