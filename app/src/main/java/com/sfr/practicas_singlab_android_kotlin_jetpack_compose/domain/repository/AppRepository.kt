package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.repository

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.UserDto
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.repository.Resource

interface AppRepository {

    suspend fun getAllUsers(): Resource<List<UserDto>>

}