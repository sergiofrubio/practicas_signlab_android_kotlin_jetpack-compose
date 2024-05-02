package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.ForgotPassScreen
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.HomeScreen
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.LoginScreen
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.RegisterScreen

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = RoutesNavigation.AuthRoute.route) {
        authGraph(navController)
        appGraph(navController)
    }

}