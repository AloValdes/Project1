package com.example.proyecto1.data.model

import androidx.compose.ui.graphics.vector.ImageVector

data class MenuModel(
    val id: Int,
    var title: String,
    val option: String,
    val icon: ImageVector
    )