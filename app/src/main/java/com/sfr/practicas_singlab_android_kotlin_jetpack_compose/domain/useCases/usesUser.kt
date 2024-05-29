package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.domain.useCases

//class userCases @Inject constructor(
//    private val repo: AppRepository
//) {
//
//    suspend fun getAllUsers(): UserState {
//        return when (val response = repo.getAllUsers()){
//            Resource.Loading -> {
//                UserState.Loading
//            }
//
//            is Resource.Success -> {
//                UserState.Success(response.value.tansformToListOfUserDm())
//            }
//            is Resource.Failure -> {
//                if (response.isNetworkError){
//                    UserState.Failure("Error de red: ${response.errorMessage}")
//                }else{
//                    UserState.Failure("Error: ${response.errorCode} / ${response.errorMessage}")
//                }
//            }
//        }
//    }
//}