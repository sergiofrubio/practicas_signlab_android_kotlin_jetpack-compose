package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.model

data class AddressDm(
    val street: String?,
    val suite: String?,
    val city: String?,
    val zipcode: String?,
    val geo: GeoDm?
)