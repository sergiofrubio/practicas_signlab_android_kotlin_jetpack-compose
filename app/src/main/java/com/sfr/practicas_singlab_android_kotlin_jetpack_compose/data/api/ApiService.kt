package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.api

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("/users")
    suspend fun getAllUsers(): List<User>
}