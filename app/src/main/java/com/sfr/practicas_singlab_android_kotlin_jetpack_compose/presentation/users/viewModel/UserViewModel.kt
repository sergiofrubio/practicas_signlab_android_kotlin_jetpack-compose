package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.users.viewModel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.data.model.UserDto
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val repository: AppRepository) : ViewModel() {

    private val _users = MutableStateFlow<List<UserDto>>(emptyList())
    val users: StateFlow<List<UserDto>> get() = _users

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> get() = _isLoading

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _isLoading.value = true
            val users = repository.getAllUsers()
            _users.value = users
            _isLoading.value = false
        }
    }
}