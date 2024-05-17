package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.mapper

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.User
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.model.UserDM

fun User.TransformToUserDM() =
    UserDM(
        id=this.id ?: 0,
        firstName=this.firstName ?: "",
        lastName=this.lastName ?: "",
        phone=this.phone ?: "",
        address= this.address?.street ?: "",
        email=this.email ?: "",
        website=this.website ?: ""
    )

fun List<User>.TransformToUserDM(): List<UserDM> {
    return this.map {user ->
        user.TransformToUserDM()
    }
}

