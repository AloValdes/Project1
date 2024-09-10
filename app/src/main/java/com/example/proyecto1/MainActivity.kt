package com.example.proyecto1

import android.graphics.Picture
import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyecto1.ui.theme.Proyecto1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {

            Column(
                modifier= Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
            ){
                CustomText()
                Picture()

                // Text(text ="Simple text")
                // ModifierExample()
                //ModifierExample2()
                //  ModifierExample3()
            }
            //Layouts
            /*Column {
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

private fun column(function: () -> Unit) {

}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/*//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Proyecto1Theme {
        Greeting("Android")
    }
}*/

//@Preview(showBackground = true)
@Composable
fun ModifierExample(){
    Column(
        modifier= Modifier
            .padding(24.dp)
    ){
        Text(text="Hello world")

    }
}
//@Preview(showBackground = true)
@Composable
fun ModifierExample2(){
    Column(
        modifier= Modifier
            .padding(24.dp)
            .fillMaxWidth()
            .clickable(onClick = { clickAction() })
    ){
        Text(text="Hello world")

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
    }}
@Preview(showBackground = true)
@Composable
fun CustomText() {
    Column {
        Text(
            stringResource(R.string.Hello_World_text),
            color = colorResource(R.color.purple_500),
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold
        )
        val gradientColors = listOf(Color.Cyan, Color.Blue, Color.Red)
        Text(
            stringResource(R.string.Hello_World_text),
            style = TextStyle(brush = Brush.linearGradient(colors =gradientColors))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Picture(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ){
        Image(
            modifier= Modifier
                .fillMaxWidth(),
            painter = painterResource(R.drawable.android),
            contentDescription ="Logo Android",
            contentScale = ContentScale.Crop
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Content1(){
    Card( modifier = Modifier
        .background(Color.Cyan)
        .fillMaxWidth()
        .padding(5.dp)
    ){ Text(text = "This is a Title",
        fontSize = 24.sp,
            modifier = Modifier
                .padding(10.dp))

        Image( modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
            painter = painterResource(id = R.drawable.android),
            contentDescription = "Logo Android",
            contentScale = ContentScale.Crop)
        Text(stringResource(R.string.Text_Card),
            textAlign = TextAlign.Justify,
            lineHeight = 18.sp,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun Content2(){
    Row {
        Card(
            modifier = Modifier
                .background(Color.Cyan)
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
                painter = painterResource(id = R.drawable.android),
                contentDescription = "Logo Android",
                contentScale = ContentScale.Crop
            )
            Text(
                stringResource(R.string.Text_Card),
                textAlign = TextAlign.Justify,
                lineHeight = 18.sp,
                modifier = Modifier
                    .padding(10.dp))
        }
    }
}

fun clickAction(){
    println("Column Clicked")

}

