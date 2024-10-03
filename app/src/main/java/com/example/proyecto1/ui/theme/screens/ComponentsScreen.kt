package com.example.proyecto1.ui.theme.screens

import android.icu.util.Calendar
import android.widget.Button
import android.widget.DatePicker
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderPositions
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Switch
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.TextButton
import androidx.compose.material3.Text
import androidx.compose.material3.TimePicker
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
                        component = "FloatingButtons"
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
                //Progress
                NavigationDrawerItem(
                    label = { Text(text = "Progress") },
                    selected = false,
                    onClick = {
                        component = "Progress"
                        scope.launch {
                        }
                    }
                )
                //Sliders
                NavigationDrawerItem(
                    label = { Text(text = "Sliders") },
                    selected = false,
                    onClick = {
                        component = "Sliders"
                        scope.launch {
                        }
                    }
                )

                //Switches
                NavigationDrawerItem(
                    label = { Text(text = "Switches") },
                    selected = false,
                    onClick = {
                        component = "Switches"
                        scope.launch {
                        }
                    }
                )

                //Badges
                NavigationDrawerItem(
                    label = { Text(text = "Badges") },
                    selected = false,
                    onClick = {
                        component = "Badges"
                        scope.launch {
                        }
                    }
                )

                //DatePickers
                NavigationDrawerItem(
                    label = { Text(text = "Date Pickers") },
                    selected = false,
                    onClick = {
                        component = "DatePickers"
                        scope.launch {
                        }
                    }
                )
                //TimePickers
                NavigationDrawerItem(
                    label = { Text(text = "Time Pickers") },
                    selected = false,
                    onClick = {
                        component = "TimePickers"
                        scope.launch {
                        }
                    }
                )
                //SnackBars
                NavigationDrawerItem(
                    label = { Text(text = "Snack Bars") },
                    selected = false,
                    onClick = {
                        component = "SnackBars"
                        scope.launch {
                        }
                    }
                )

                //AlertDialogs
                NavigationDrawerItem(
                    label = { Text(text = "Alert Dialogs") },
                    selected = false,
                    onClick = {
                        component = "AlertDialogs"
                        scope.launch {
                        }
                    }
                )

                //Bars
                NavigationDrawerItem(
                    label = { Text(text = "Bars but not to eat") },
                    selected = false,
                    onClick = {
                        component = "Bars"
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
                "Progress" -> {
                    Progress()
                }
                "Sliders" -> {
                    Sliders()
                }
                "Switches" -> {
                    Switches()
                }
                "Badges" -> {
                    Badges()
                }
                "DatePickers" -> {
                    DatePickers(onDateSelected = {}) {

                    }
                }
                "Time Pickers" -> {
                    TimePickers(onConfirm = {}) {

                    }
                }
                "Snack Bars" -> {
                    SnackBars()
                }
                "Alert Dialogs" -> {
                    AlertDialogs()
                }
                "Bars but not to eat" -> {
                    Bars()
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
            label = { Text("Assist Chip") },
            leadingIcon = {
                Icon(
                    Icons.Filled.AccountBox, "",
                    Modifier.size(AssistChipDefaults.IconSize)
                )
            }
        )
        var selected by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Filter Chip") },
            leadingIcon = if (selected) {
                {
                    Icon(
                        Icons.Filled.AccountBox, "",
                        Modifier.size(AssistChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )
        InputChipExample("Dismiss") {}
    }
}

    @Composable
    fun InputChipExample(
        text: String,
        onDismiss:()-> Unit ) {
        var enabled by remember { mutableStateOf(true) }
        if(!enabled) return
        InputChip(
            label = {Text(text)},
            selected = enabled,
            onClick = {
                onDismiss()
                enabled = !enabled
            },
            avatar = {
                Icon(
                    Icons.Filled.Person, contentDescription = "",
                    Modifier.size(InputChipDefaults.AvatarSize)
                )
            },
            trailingIcon = {
                Icon(
                    Icons.Filled.Close, contentDescription = "",
                    Modifier.size(InputChipDefaults.AvatarSize)
                )
            }
        )
    }



@Composable
fun Progress() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
    ) {
        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth()
        )
        CircularProgressIndicator(
            modifier = Modifier
                .width(64.dp)
        )
    }
}

@Composable
fun Sliders() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
    ) {
        var sliderPosition by remember{ mutableStateOf(50f) }
        Column {
            Slider(
                value = sliderPosition,
                onValueChange = {sliderPosition = it},
                steps = 10,
                valueRange = 0f..100f
            )
            Text(
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth(),
                text = sliderPosition.toString()
            )
        }
    }
}
@Preview(showBackground = true, name="XD")
@Composable
fun Switches() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
    ) {
        var checked by remember { mutableStateOf(true) }
        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
            }

        )
        var checked2 by remember { mutableStateOf(true) }
        Switch(
            checked = checked2,
            onCheckedChange = {
                checked = it
            },
            thumbContent = if(checked2) {
                {
                    Icon(
                        Icons.Filled.Close, contentDescription = "",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                }
            } else {
                null
            }
        )
        var checked3 by remember { mutableStateOf(true) }
        Checkbox(
            checked = checked3,
            onCheckedChange = {checked3 = it})
    }
}

@Composable
fun Badges() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        var itemCount by remember { mutableStateOf(0) }
        BadgedBox(
            badge = {
                if (itemCount > 0) {
                    Badge(
                        containerColor = Color.Red,
                        contentColor = Color.White
                    ) {
                        Text(text = "$itemCount")
                    }
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        contentDescription = ""
                    )
                }
                Button(onClick = { itemCount++ }) {
                    Text(text = "Add item")
                }
            })
        {
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickers(
    onDateSelected: (Long?) -> Unit,
                onDismiss: () -> Unit
) {
    val datePickerState = rememberDatePickerState(initialDisplayMode = DisplayMode.Input)

    DatePickerDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = {
                onDateSelected(datePickerState.selectedDateMillis)
                onDismiss()
            }) {
                Text("OK")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    ) {
        DatePicker(state = datePickerState)
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickers(onConfirm: () -> Unit,
                onDismiss: () -> Unit
){
    val currentTime = Calendar.getInstance()

    val timePickerState = rememberTimePickerState(
        initialHour = currentTime.get(Calendar.HOUR_OF_DAY),
        initialMinute = currentTime.get(Calendar.MINUTE),
        is24Hour = true,
    )

    Column {
        TimePicker(
            state = timePickerState,
        )
        Button(onClick = onDismiss) {
            Text("Dismiss picker")
        }
        Button(onClick = onConfirm) {
            Text("Confirm selection")
        }
    }
}

@Composable
fun SnackBars() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        val snackState = remember{SnackbarHostState()}
        val snackScope = rememberCoroutineScope()

        SnackbarHost(hostState = snackState, Modifier)

        fun launchSnackBar(){
            snackScope.launch { snackState.showSnackbar("The message was sent") }
        }
        Button(::launchSnackBar){
            Text("Show Snackbar")
        }
    }
}

@Composable
fun AlertDialogs() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        var showAlertDialog by remember { mutableStateOf(false) }
        var selectedOption by remember { mutableStateOf("") }

        if (showAlertDialog){
            AlertDialog(
                icon = {Icon(Icons.Filled.Warning, contentDescription = "")},
                title = { Text(text = "Confirm Deletion")},
                text = { Text(text = "Are you sure you want to Delete the file?")},
                onDismissRequest = {},
                confirmButton = {
                    TextButton(
                        onClick = {
                            selectedOption = "Confirm"
                            showAlertDialog = false
                        }) {
                        Text(text = "Confirm")}
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            selectedOption = "Dismiss"
                            showAlertDialog = false
                        }) {
                        Text(text = "Dismiss")}
                }
            )
        }
        Text(selectedOption)
        Button(onClick = {showAlertDialog= true}) {
            Text("Show Alert Dialog")
        }
    }
}

@Composable
fun Bars(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)
    ){
        Row (
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .background(Color.Black)
                .padding(10.dp, 50.dp, 10.dp, 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Icon(Icons.Filled.Menu,
                contentDescription = "",
                tint = Color.White)
            Text(text = "App Title",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
            Icon(Icons.Filled.Settings,
                contentDescription = "",
                tint = Color.White)
        }
    }
}


