package com.example.mvvmandjetpack.retrofitServices

import com.example.mvvmandjetpack.models.banners.Banners
import com.example.mvvmandjetpack.models.dummyModel.DummyParent
import com.example.mvvmandjetpack.models.login.LoginResponse
import com.example.mvvmandjetpack.models.wishlist.WishListParent
import com.example.mvvmandjetpack.retrofitServices.WebConfig.Headers.*
import com.example.mvvmandjetpack.utils.Endpoints
import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.*

interface ApiServices {


    @GET("entries")
    suspend fun getEmployees() : Response<DummyParent>
















































    /*   @FormUrlEncoded             http/;nmhn,com?fbgggggggg=ghghg
    @POST(Endpoints.LOGIN)
    suspend fun loginUser(
        @Field(ApiKeys.PHONE_NUMBER) phoneNumber: String,
        @Field(ApiKeys.PASSWORD) password: String
    ): Response<LoginResponse>
*/

    @POST(Endpoints.LOGIN)
    suspend fun loginUser(@Header(API_KEY) key: String, @Body body: JsonObject): Response<LoginResponse>

    @GET(Endpoints.BANNERS)
    suspend fun getBanners(@Header(API_KEY) key: String) : Response<Banners>

    @GET(Endpoints.WISH_LIST)
    suspend fun getWishlistItems(@Header(API_KEY) key: String,
                                 @Header(AUTHORIZATION) auth: String,
                                 @Query("UserId") userId: String,
                                 @Query("PageSize") pageSize: Int,
                                 @Query("PageNumber") pageNumber: Int) : Response<WishListParent>


//    @POST(Endpoints.LOGIN)
//    suspend fun hsj(
//        @Header(API_KEY) key: String,
//        @Query("PhoneNumber") nu:String
//    ): Response<LoginResponse>



}