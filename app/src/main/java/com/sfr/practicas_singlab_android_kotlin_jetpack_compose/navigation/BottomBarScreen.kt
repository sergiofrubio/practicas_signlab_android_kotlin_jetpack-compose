package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.navigation

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Users : BottomBarScreen(
        route = "USUARIOS",
        title = "Usuarios",
        icon = R.drawable.baseline_person_24
    )

    object Albums : BottomBarScreen(
        route = "ALBUNES",
        title = "Álbunes",
        icon = R.drawable.album
    )

    object Portadas : BottomBarScreen(
        route = "PORTADAS",
        title = "Portadas",
        icon = R.drawable.photo
    )
}