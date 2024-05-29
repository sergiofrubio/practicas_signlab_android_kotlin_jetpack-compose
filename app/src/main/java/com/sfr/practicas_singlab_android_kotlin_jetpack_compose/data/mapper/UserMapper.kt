package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.mapper

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.UserDto
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.model.UserDm

fun UserDto.TransformToUserDM() =
   UserDm(
        id=this.id ?: 0,
        firstName=this.firstName ?: "",
        lastName=this.lastName ?: "",
        phone=this.phone ?: "",
        address= this.address?.transformToAddressDm(),
        email=this.email ?: "",
        website=this.website ?: "",
        company = this.company?.transformToCompanyDm()
    )

fun List<UserDto>.TransformToUserDM(): List<UserDm> {
    return this.map {user ->
        user.TransformToUserDM()
    }
}

