package com.example.mvvmandjetpack.utils

import com.google.gson.JsonObject

//Repository class is used where we perform actions for api
class JsonCreator {

    companion object{
        fun createLoginBody(userNumber: String, userPassword: String):JsonObject{
            val jsonObject = JsonObject()
            jsonObject.addProperty("PhoneNumber", userNumber)
            jsonObject.addProperty("Password", userPassword)
            return jsonObject
        }
    }


}