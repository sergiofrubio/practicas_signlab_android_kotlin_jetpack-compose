package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.navigation.RootNavigationGraph
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.ui.theme.Practicas_singlab_android_kotlin_jetpackcomposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
