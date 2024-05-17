package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.users.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.users.viewModel.UserViewModel
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens.LoadingScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UserScreen(viewModel: UserViewModel = hiltViewModel()) {
    val usersState by viewModel.users.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()

    Scaffold(
        topBar = {
            Text(
                text = "Users",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(16.dp)
            )
        }
    ) {
        when {
            isLoading -> {
                LoadingScreen()
            }
            usersState.isEmpty() -> {
                Text(
                    text = "No users available",
                    modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center)
                )
            }
            else -> {
                LazyColumn(
                    contentPadding = PaddingValues(16.dp)
                ) {
                    items(usersState) { user ->
                        UserItem(user = user)
                    }
                }
            }
        }
    }
}
