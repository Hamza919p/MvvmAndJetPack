package com.example.mvvmandjetpack.respository

import com.example.mvvmandjetpack.interfaces.ApiCallBack
import com.example.mvvmandjetpack.retrofitServices.ApiServices
import com.example.mvvmandjetpack.retrofitServices.RetrofitHelper
import com.example.mvvmandjetpack.utils.JsonCreator
import org.json.JSONObject

//Repository class is used where we perform actions for api
class LoginRepository {


    suspend fun getLoginResponse(userNumber: String, userPassword: String, apiCallBack: ApiCallBack){
        val service = RetrofitHelper.getInstance().create(ApiServices::class.java)
        val response = service.loginUser("A956FFC5-8069-47F3-B1D7-AC6E11A21BFC",JsonCreator.createLoginBody(userNumber, userPassword))
        if(response.isSuccessful && response.code()==200){
                response.body()?.let { apiCallBack.onSuccess(it) }
        }
        else
        {
            response.errorBody()?.let {
                val jsonObj = JSONObject(it.string())
                apiCallBack.onFailure(jsonObj.optString("Message"))}
        }
    }
}