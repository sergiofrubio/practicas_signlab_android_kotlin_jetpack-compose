package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.mapper

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.GeoDto
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.model.GeoDm

fun GeoDto.transformToGeoDm() =
    GeoDm(
        lat = this.lat ?: "0.0",
        lng = this.lng ?: "0.0",
    )