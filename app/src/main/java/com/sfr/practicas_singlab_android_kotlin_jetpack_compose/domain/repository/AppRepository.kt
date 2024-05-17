package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.repository

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.User

interface AppRepository {

    suspend fun getAllUsers(): List<User>

}