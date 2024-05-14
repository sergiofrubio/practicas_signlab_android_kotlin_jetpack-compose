package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.login.state

sealed class Login{
    object Idle: Login()
    object Loading: Login()
    data class Success(val message: String): Login()
    data class Error (val message: String): Login()

    data class LoginState(
        val email: String = "",
        val password: String = "",
        val isLoginButtonEnabled: Boolean = false
    )

}