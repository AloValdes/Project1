package com.example.proyecto1.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch

@Composable
fun ComponentScreen(navController: NavController) {
    var component by remember{ mutableStateOf("") }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState, //current state of drawer
        drawerContent = {
            ModalDrawerSheet {
                Text("Menu",
                    modifier = Modifier
                        .padding(16.dp))
                HorizontalDivider()
                //Content 1
                NavigationDrawerItem(
                    label = { Text(text = "Content1") },
                    selected = false,
                    onClick = {
                        component = "Content1"
                        scope.launch {
                        }
                    }
                )
                //Content 2
                NavigationDrawerItem(
                    label = { Text(text = "Content2") },
                    selected = false,
                    onClick = {
                        component = "Content2"
                        scope.launch {
                        }
                    }
                )
                //Chips
                NavigationDrawerItem(
                    label = { Text(text = "Chips Buttons") },
                    selected = false,
                    onClick = {
                        component = "Chips"
                        scope.launch {
                        }
                    }
                )
                //Floating Buttons
                NavigationDrawerItem(
                    label = { Text(text = "Floating Buttons") },
                    selected = false,
                    onClick = {
                        component = "Content2"
                        scope.launch {
                        }
                    }
                )
                //Buttons
                NavigationDrawerItem(
                    label = { Text(text = "Buttons") },
                    selected = false,
                    onClick = {
                        component = "Buttons"
                        scope.launch {
                        }
                    }
                )
            }
        }
    ) {
        //Screen Content
        Column {
            when(component){
                "Content1" -> {
                    Content1()
                }
                "Content2" -> {
                    Content2()
                }
                "Buttons" -> {
                    Buttons()
                }
                "Floating Buttons" -> {
                    FloatingButtons()
                }
                "Chips" -> {
                    Chips()
                }
            }
        }
    }
}



@Composable
fun Content2() {
    Text(text = "Content2")
}

@Composable
fun Content1() {
    Text(text = "Content1")
}


@Composable
fun Buttons() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
    ){
        Button(onClick = {}){
            Text("Filled")
        }
        FilledTonalButton(onClick = {}){
            Text("Tonal")
        }
        OutlinedButton(onClick = {}){
            Text("Outline")
        }
        ElevatedButton(onClick = {}){
            Text("Elevated")
        }
        TextButton(onClick = {}){
            Text("Text")
        }
    }
}


@Composable
fun FloatingButtons() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
    ) {
        FloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add, "")
        }
        SmallFloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Face, "")
        }
        LargeFloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.ArrowDropDown, "")
        }
        ExtendedFloatingActionButton(
            onClick = {},
            icon = {Icon(Icons.Filled.Menu, "")},
            text = {Text(text = "Extended FAB")}
        )
    }
}

@Preview
@Composable
fun Chips() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
    ) {
        AssistChip(
            onClick = {},
            label = { Text( "Assist Chip")},
            leadingIcon = (
                    Icon(Icons.Filled.AccountBox,"",
                        Modifier.size(AssistChipDefaults.IconSize))
                    )
        )
        var selected by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected,
            onClick = { },
            label = { Text("Filter Chip")},
            leadingIcon = {if (selected){
                {
                    Icon(
                        Icons.Filled.AccountBox,"",
                        Modifier.size(AssistChipDefaults.IconSize)
                    )
                }
            }
            } else {
            null
        }
    }

    }
}
