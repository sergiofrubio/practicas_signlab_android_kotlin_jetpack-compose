package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val firstName: String?,
    @SerializedName("username")
    val lastName: String?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("address")
    val address: Address?,
    @SerializedName("phone")
    val phone: String?,
    @SerializedName("website")
    val website: String?,
    @SerializedName("company")
    val company: Company?
)