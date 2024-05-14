package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.login.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.useCases.usesLogin
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.login.event.LoginEvent
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.login.state.Login
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.login.state.LoginState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private var usesLogin: usesLogin) : ViewModel() {

    private var _loginState = MutableStateFlow<Login>(Login.Idle)
    val loginState: StateFlow<Login> = _loginState.asStateFlow()

     fun onEvent(event: LoginEvent) {
        when(event) {
            is LoginEvent.EmailChanged -> {
                _loginState.update {
                    it.copy(email = event.email)
                }
                onLoginButton(loginState.value.email, loginState.value.password)

            }

            is LoginEvent.passwordChanged -> {
                _loginState.update { it.copy(password = event.password) }
                onLoginButton(loginState.value.email, loginState.value.password)

            }

            is LoginEvent.LoginButton ->{
                val isValidEmail = usesLogin.emailValidator(email = loginState.value.email)
                val isValidPassword = usesLogin.passwordValidator(pass = loginState.value.password)

                if (isValidPassword && isValidEmail) {
                    _loginState.update { it.copy(isLoginButtonEnabled = true) }
                } else {
                    _loginState.update { it.copy(isLoginButtonEnabled = false) }
                }
            }

            else -> {}
        }
    }

    fun onEmailChanged(email: String) {
        onEvent(LoginEvent.EmailChanged(email))

    }

    fun onPasswordChanged(password: String) {
        onEvent(LoginEvent.passwordChanged(password))
    }

    private fun onLoginButton(email: String, password: String) {
        onEvent(LoginEvent.LoginButton(email, password))
    }

}