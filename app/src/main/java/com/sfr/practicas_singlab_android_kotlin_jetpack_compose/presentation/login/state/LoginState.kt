package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.login.state

data class LoginState(
    val email: String = "",
    val password: String = "",
    val isLoginButtonEnabled: Boolean = false
)