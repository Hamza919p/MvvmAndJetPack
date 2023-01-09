package com.example.mvvmandjetpack.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.mvvmandjetpack.R
import com.example.mvvmandjetpack.databinding.ActivityHomeScreenBinding
import com.example.mvvmandjetpack.viewModels.HomeScreenViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class HomeScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding
    private lateinit var viewModel: HomeScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home_screen)
        viewModel = HomeScreenViewModel()
        binding.apply {
            homeScreenViewModel = viewModel
            lifecycleOwner = this@HomeScreenActivity
        }
        GlobalScope.launch(Dispatchers.IO) {
//            viewModel.getBannersResponse()
            viewModel.getWishlistResponse()
        }

//        viewModel.bannersList.observe(this, Observer {
//            Log.d("Banners: ", it.Data.toString())
//        })

        viewModel.wishlistList.observe(this, Observer {
            Log.d("WishItems: ", it.Data.toString())
        })
    }
}