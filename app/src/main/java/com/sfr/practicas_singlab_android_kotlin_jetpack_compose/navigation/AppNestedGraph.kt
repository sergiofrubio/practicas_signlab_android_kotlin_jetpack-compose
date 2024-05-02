package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.HomeScreen

fun NavGraphBuilder.appGraph(navController: NavController) {
    navigation(startDestination = RoutesNavigation.HomeRoute.route, route = RoutesNavigation.AppRoute.route) {
        composable(route = RoutesNavigation.HomeRoute.route){
            HomeScreen(navController = navController)
        }
    }

}