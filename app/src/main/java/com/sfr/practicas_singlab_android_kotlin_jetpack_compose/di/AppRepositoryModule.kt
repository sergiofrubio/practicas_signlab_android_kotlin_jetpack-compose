package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.di

import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.repository.AppRepositoryImpl
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.repository.AppRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface AppRepositoryModule {

    @Binds
    fun provideAppRepository(
        repo: AppRepositoryImpl
    ): AppRepository
}