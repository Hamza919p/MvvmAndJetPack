package com.example.mvvmandjetpack.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmandjetpack.models.banners.Banners
import com.example.mvvmandjetpack.models.wishlist.WishListParent
import com.example.mvvmandjetpack.respository.BannersRepository
import com.example.mvvmandjetpack.respository.WishListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeScreenViewModel : ViewModel() {
    private var mutableLiveData = MutableLiveData<Banners>()
    private var mutableLiveDataForWishList = MutableLiveData<WishListParent>()
    val bannersList: LiveData<Banners>
    get() = mutableLiveData
    val wishlistList: LiveData<WishListParent>
    get() = mutableLiveDataForWishList


    suspend fun getBannersResponse() {
        viewModelScope.launch(Dispatchers.Main){
            mutableLiveData.value = BannersRepository().getBanners()
        }
    }

    suspend fun getWishlistResponse() {
        viewModelScope.launch(Dispatchers.Main) {
            mutableLiveDataForWishList.value = WishListRepository().getWishlist()
        }
    }
}