package com.example.mvvmandjetpack.models.login

data class LoginTokenResponseModel(
    val Message: Any,
    val UserId: Int,
    val access_token: String,
    val error: Any,
    val error_description: Any,
    val expires_in: Int,
    val token_type: String
)