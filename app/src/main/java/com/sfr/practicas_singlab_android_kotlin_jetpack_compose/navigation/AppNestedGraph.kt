package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.users.ui.UserScreen
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.ScreenContent

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.Users.route
    ) {
        composable(route = BottomBarScreen.Users.route) {
            UserScreen()
        }
        composable(route = BottomBarScreen.Albums.route) {
            ScreenContent(
                name = BottomBarScreen.Albums.route,
                onClick = { }
            )
        }
        composable(route = BottomBarScreen.Portadas.route) {
            ScreenContent(
                name = BottomBarScreen.Portadas.route,
                onClick = { }
            )
        }
    }
}