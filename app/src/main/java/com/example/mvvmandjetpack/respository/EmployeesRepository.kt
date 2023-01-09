package com.example.mvvmandjetpack.respository

import com.example.jetpacksampleproject.models.EmployeesParent
import com.example.mvvmandjetpack.models.dummyModel.DummyParent
import com.example.mvvmandjetpack.retrofitServices.ApiServices
import com.example.mvvmandjetpack.retrofitServices.RetrofitHelper

class EmployeesRepository {

    suspend fun getEmployeesData() : DummyParent? {
        val retrofitHelper = RetrofitHelper.getInstance().create(ApiServices::class.java)
        val response = retrofitHelper.getEmployees()
        if(response.isSuccessful)
            return response.body()!!
        return null
    }
}