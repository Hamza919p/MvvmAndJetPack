package com.example.mvvmandjetpack.respository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmandjetpack.models.banners.Banners
import com.example.mvvmandjetpack.retrofitServices.ApiServices
import com.example.mvvmandjetpack.retrofitServices.RetrofitHelper

class BannersRepository {

    suspend fun getBanners() : Banners? {
        val retrofit = RetrofitHelper.getInstance().create(ApiServices::class.java)
        val response = retrofit.getBanners("A956FFC5-8069-47F3-B1D7-AC6E11A21BFC")
        if(response.isSuccessful) {
            return response.body()!!
        }
        return null
    }
}