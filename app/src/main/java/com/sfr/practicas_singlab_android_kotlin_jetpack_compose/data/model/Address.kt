package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model

import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("street")
    val street: String,
    @SerializedName("suite")
    val suite: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("zipcode")
    val zipcode: String,
    @SerializedName("geo")
    val geo: Geo
)