package com.example.proyecto1

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyecto1.ui.theme.Proyecto1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            //Layouts
            Column {
                Text(text = "First Row")
                Text(text = "Second Row")
                Text(text = "Third Row")
                Text(text = "Fourth Row")
                Row{Text(text = "HOLA 1")
                    Text(text = "HOLA 2")
                    Text(text = "HOLA 3")
                    Text(text = "HOLA 4")}
                Box{
                    Text(text = "Label 1")
                    Text(text = "Label 2")
                    Text(text = "Label 3")
                }
                Greeting(name: "Hello World")
                }

            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Proyecto1Theme {
        Greeting("Alo")
    }
}