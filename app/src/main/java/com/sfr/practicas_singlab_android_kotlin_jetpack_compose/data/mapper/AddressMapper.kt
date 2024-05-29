package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.mapper

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.AddressDto
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.model.AddressDm

fun AddressDto.transformToAddressDm() =
    AddressDm(
        street = this.street ?: "",
        city = this.city ?: "",
        suite = this.suite ?: "",
        zipcode = this.zipcode ?: "",
        geo = this.geo?.transformToGeoDm()
    )