package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.ForgotPassScreen
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.LoginScreen
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.RegisterScreen

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation(startDestination = RoutesNavigation.LoginRoute.route , route = RoutesNavigation.AuthRoute.route){
        composable(route = RoutesNavigation.LoginRoute.route){
            LoginScreen(navController = navController)
        }

        composable(route = RoutesNavigation.RegisterRoute.route){
            RegisterScreen(navController = navController)
        }

        composable(route = RoutesNavigation.ForgotPassRoute.route){
            ForgotPassScreen(navController = navController)
        }
    }
}