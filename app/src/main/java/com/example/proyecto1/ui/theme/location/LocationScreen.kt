package com.example.proyecto1.ui.theme.location

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.proyecto1.ui.theme.Proyecto1Theme
import com.example.proyecto1.ui.theme.location.HomeView
import com.example.proyecto1.ui.theme.location.SearchViewModel

@Composable
fun LocationScreen(viewModel: SearchViewModel) {
    Proyecto1Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            SearchViewModel(viewModel)
        }
    }
}