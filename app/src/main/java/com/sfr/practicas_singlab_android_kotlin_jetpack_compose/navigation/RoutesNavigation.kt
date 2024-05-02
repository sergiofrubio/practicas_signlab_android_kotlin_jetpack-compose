package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.navigation

sealed class RoutesNavigation (val route: String) {
    object LoginRoute : RoutesNavigation(route = "Login")
    object RegisterRoute : RoutesNavigation(route = "Register")
    object ForgotPassRoute : RoutesNavigation(route = "ForgotPass")
    object HomeRoute : RoutesNavigation(route = "home")
    object AuthRoute: RoutesNavigation(route = "Auth")
    object AppRoute: RoutesNavigation(route = "App")

}