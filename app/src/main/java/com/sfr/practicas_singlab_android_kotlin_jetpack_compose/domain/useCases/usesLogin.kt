package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.useCases

import android.util.Patterns

class usesLogin {

    fun emailValidator(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun passwordValidator(pass: String):Boolean{
        return pass.length>=6
    }
}