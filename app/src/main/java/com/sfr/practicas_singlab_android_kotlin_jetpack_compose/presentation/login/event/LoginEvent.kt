package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.login.event

sealed class LoginEvent{
    data class EmailChanged(val email: String): LoginEvent()
    data class passwordChanged(val password: String): LoginEvent()
    data class LoginButton(val email: String, val password: String): LoginEvent()
    object Login: LoginEvent()

}