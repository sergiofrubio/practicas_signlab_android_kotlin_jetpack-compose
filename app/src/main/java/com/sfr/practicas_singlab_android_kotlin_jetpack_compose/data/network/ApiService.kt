package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.network

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.UserDto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/users")
    suspend fun getAllUsers(): Response<List<UserDto>>
}