package com.example.mvvmandjetpack.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mvvmandjetpack.Launcher
import com.example.mvvmandjetpack.R
import com.example.mvvmandjetpack.databinding.ActivityMainBinding
import com.example.mvvmandjetpack.interfaces.ApiCallBack
import com.example.mvvmandjetpack.models.login.LoginResponse
import com.example.mvvmandjetpack.utils.DataPreference
import com.example.mvvmandjetpack.viewModels.MainActivityViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = MainActivityViewModel()
//        viewModel.apiCallBack=this

        binding.apply {
            mainViewModel = viewModel
            lifecycleOwner = this@MainActivity
        }

        viewModel.employeesList.observe(this, {
            if(it != null)
                Log.d("Response::", it.entries.toString())
        })



































        /**
         * Scoped Functions/ Utility functions
         *          They are used to remove boiler plate code
         *          we are writing        binding.mainViewModel
         *                                binding.lifecycleOwner
         *          Now if we dont want to write binding again and again we will use scoped functions
         *          i.e                   binding.apply{
         *                                      mainViewModel
         *                                      lifeCycleOwner
         *                                              }
         * (1) apply :
         * (2) let
         * (3) with
         *      With come to reduce "let" code as shown below
         * (4) run:
         *      Combination of "let" and "with"
         *
         *  */

//        binding.let {
//            it.mainViewModel = viewModel
//            it.lifecycleOwner = this@MainActivity
//        }
//
//        with(binding) {
//            mainViewModel = viewModel
//            lifecycleOwner = this@MainActivity
//        }
//
//        binding.run {
//            mainViewModel = viewModel
//            lifecycleOwner = this@MainActivity
//        }

    }

//    override fun onSuccess(response: Any) {
//        val loginResponse=response as LoginResponse
//        GlobalScope.launch(Dispatchers.Main){
//            Toast.makeText(this@MainActivity, "Success", Toast.LENGTH_SHORT).show()
//        }
//        DataPreference.getInstance(this).setUser(loginResponse)
//        Launcher.startHomeScreenActivity(this)
//    }
//
//
//    override fun onFailure(message: String) {
//        GlobalScope.launch(Dispatchers.Main){
//            Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
//        }
//
//    }

}