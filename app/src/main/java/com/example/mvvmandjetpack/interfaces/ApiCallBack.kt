package com.example.mvvmandjetpack.interfaces

interface ApiCallBack {
    fun onSuccess(response: Any)
    fun onFailure(message: String)
}