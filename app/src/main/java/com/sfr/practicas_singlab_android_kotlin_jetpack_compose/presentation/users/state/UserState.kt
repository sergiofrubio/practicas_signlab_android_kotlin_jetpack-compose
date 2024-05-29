package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.users.state

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.model.UserDm

sealed class UserState{

    object Idle: UserState()
    object Loading: UserState()
    data class Success(
        val data: List<UserDm
                >,
        val message: String? = null
    ): UserState()
    data class Failure(val message: String): UserState()
}