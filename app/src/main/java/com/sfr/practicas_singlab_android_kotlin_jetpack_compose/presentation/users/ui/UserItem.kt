// ui/main/UserItem.kt
package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.users.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.User

@Composable
fun UserItem(user: User, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = user.firstName.toString(), style = MaterialTheme.typography.titleMedium)
        Text(text = user.lastName.toString(), style = MaterialTheme.typography.bodyMedium)
        Text(text = user.email.toString(), style = MaterialTheme.typography.bodyMedium)
        Text(text = user.phone.toString(), style = MaterialTheme.typography.bodyMedium)
    }
}
