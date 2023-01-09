package com.example.mvvmandjetpack.retrofitServices

import com.example.mvvmandjetpack.utils.Endpoints
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api.publicapis.org/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

}