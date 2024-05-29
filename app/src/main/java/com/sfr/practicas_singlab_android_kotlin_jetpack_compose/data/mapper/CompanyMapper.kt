package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.mapper

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.CompanyDto
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.model.CompanyDm

fun CompanyDto.transformToCompanyDm() =
    CompanyDm(
        name = this.name ?: "",
        catchPhrase = this.catchPhrase ?: "",
        bs = this.bs ?: ""
    )