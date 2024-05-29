package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.model

data class UserDm (
    val id: Int?,
    val firstName: String?,
    val lastName: String?,
    val email: String?,
    val address: AddressDm?,
    val phone: String?,
    val website: String?,
    val company: CompanyDm?

)