package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.repository

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.api.ApiService
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.User
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.repository.AppRepository
import javax.inject.Inject

class UserRepository @Inject constructor(private val apiService: ApiService): AppRepository {

    override suspend fun getAllUsers(): List<User> {
        return apiService.getAllUsers()
    }
}