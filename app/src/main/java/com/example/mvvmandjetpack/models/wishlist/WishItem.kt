package com.example.mvvmandjetpack.models.wishlist

data class WishItem(
    val Discount: Double,
    val DiscountType: Int,
    val DiscountedPrice: Double,
    val InStock: Boolean,
    val IsCampaignApplied: Boolean,
    val IsPromotional: Boolean,
    val Price: Double,
    val ProductDetailId: Int,
    val ProductId: Int,
    val ProductImage: String,
    val ProductName: String,
    val ProductVariants: String,
    val Quantity: Int,
    val TotalAmount: Double,
    val UserId: Int,
    val WishListId: Int
)