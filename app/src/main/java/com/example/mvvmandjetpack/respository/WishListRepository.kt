package com.example.mvvmandjetpack.respository

import com.example.mvvmandjetpack.models.wishlist.WishListParent
import com.example.mvvmandjetpack.retrofitServices.ApiServices
import com.example.mvvmandjetpack.retrofitServices.RetrofitHelper

class WishListRepository {

    suspend fun getWishlist() : WishListParent? {
        val retrofit = RetrofitHelper.getInstance().create(ApiServices::class.java)
        val response = retrofit.getWishlistItems("A956FFC5-8069-47F3-B1D7-AC6E11A21BFC",
            "bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1laWQiOiIxNDgxNzUiLCJ1bmlxdWVfbmFtZSI6Iis5MjMwMDg0NDEyNjZfMSIsIkFzcE5ldC5JZGVudGl0eS5TZWN1cml0eVN0YW1wIjoiTlZLVlgyQ1ZLNVhRSlEyWlU0VUY1NFVFVFVMMjdXVFciLCJyb2xlIjoiY3VzdG9tZXJfMSIsIkZ1bGxOYW1lIjoiaGFtemEiLCJUZW5hbnRJZCI6IjEiLCJuYmYiOjE2NTQ1Mzc4MjgsImV4cCI6MTY1OTcyMTgyOCwiaWF0IjoxNjU0NTM3ODI4LCJpc3MiOiJodHRwczovL3N0Z2JldGFhcGkucmV0YWlscnkuY29tIiwiYXVkIjoiNDE0ZTE5MjdhMzg4NGY2OGFiYzc5ZjcyODM4MzdmZDEifQ.-g6pDv66fzKPQuCmbmgAXl6JV4fvc0ZLhlaca6pKJsg",
            "148180", 20, 1)
        if(response.isSuccessful) {
            return response.body()
        }else{
            return null
        }
    }
}