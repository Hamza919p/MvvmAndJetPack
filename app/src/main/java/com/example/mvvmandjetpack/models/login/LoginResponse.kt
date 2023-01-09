package com.example.mvvmandjetpack.models.login

data class LoginResponse(
    val IsExternalLoginUserExist: Boolean,
    val LoginTokenResponseModel: LoginTokenResponseModel,
    val PhoneNumber: String,
    val RoleType: String,
)