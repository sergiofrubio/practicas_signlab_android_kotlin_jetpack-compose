package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model

import com.google.gson.annotations.SerializedName

data class GeoDto(
    @SerializedName("lat")
    val lat: String,
    @SerializedName("lng")
    val lng: String
)