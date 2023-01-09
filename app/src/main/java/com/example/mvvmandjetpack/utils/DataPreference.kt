package com.example.mvvmandjetpack.utils

import android.content.Context
import android.content.SharedPreferences
import com.example.mvvmandjetpack.models.login.LoginResponse
import com.google.gson.Gson

class DataPreference private constructor(applicationContext: Context) {
    private var user = "User"
    private var sharedPreferences: SharedPreferences ?= null
    companion object {
        private var instance: DataPreference ?= null
        @Synchronized
        fun getInstance(applicationContext: Context) : DataPreference {
            if(instance == null) {
                instance = DataPreference(applicationContext)
            }
            return instance!!
        }
    }

    init {
        sharedPreferences = applicationContext.getSharedPreferences("MvvmAndJetPack", Context.MODE_PRIVATE)
    }

    fun setUser(user: LoginResponse) {
        sharedPreferences?.edit()?.putString(this.user, Gson().toJson(user))?.apply()
    }

    fun getUser() : LoginResponse? {
        val data = sharedPreferences!!.getString(this.user, null)
        return if(data != null) {
            Gson().fromJson(data, LoginResponse::class.java)
        } else null
    }
}