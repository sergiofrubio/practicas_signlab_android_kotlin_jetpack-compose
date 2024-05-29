package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.repository

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.network.ApiService
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.network.SafeApiCall
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.repository.AppRepository
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(private val apiService: ApiService): AppRepository, SafeApiCall{
    override suspend fun getAllUsers() = safeApiCall {
        apiService.getAllUsers()
    }
}