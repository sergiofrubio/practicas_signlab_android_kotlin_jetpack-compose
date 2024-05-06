package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Users : BottomBarScreen(
        route = "USUARIOS",
        title = "Usuarios",
        icon = Icons.Default.Person
    )

    object Albums : BottomBarScreen(
        route = "ALBUNES",
        title = "Álbunes",
        icon = Icons.Default.Person
    )

    object Portadas : BottomBarScreen(
        route = "PORTADAS",
        title = "Portadas",
        icon = Icons.Default.Settings
    )
}