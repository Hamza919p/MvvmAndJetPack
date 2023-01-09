package com.example.mvvmandjetpack.models.banners

data class WebPlateFormBanner(
    val BannerId: Int,
    val CategoryId: Int,
    val Clickable: Boolean,
    val ImageName: String,
    val ImagePath: String,
    val Name: String,
    val PlateForm: Int,
    val ProductId: Int,
    val SortOrder: Int,
    val Status: Int,
    val TargetURL: Int
)