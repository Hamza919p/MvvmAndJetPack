package com.example.mvvmandjetpack

import android.content.Context
import android.content.Intent
import com.example.mvvmandjetpack.activities.HomeScreenActivity

class Launcher {
    companion object {
        fun startHomeScreenActivity(context: Context) {
            context.startActivity(Intent(context, HomeScreenActivity::class.java))
        }
    }
}