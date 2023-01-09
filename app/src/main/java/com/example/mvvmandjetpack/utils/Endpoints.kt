package com.example.mvvmandjetpack.utils

class Endpoints {

    companion object{
        const val BASE_URL = "https://stgbetaapi.retailry.com/api/"
        const val PRODUCT = BASE_URL + "Product/"
        const val ACCOUNT = BASE_URL +  "Account/"
        const val LANDING_PAGE = BASE_URL + "LandingPage/"
        const val SETTING_SERVICE = BASE_URL + "SettingService/"
        const val CATEGORY = BASE_URL + "Category/"
        const val CART = BASE_URL + "Cart/"
        const val CUSTOMER = BASE_URL + "Customer"
        const val ORDER = BASE_URL + "Order/"

        //Account
        const val SIGN_UP = ACCOUNT + "signup"
        const val LOGIN   = ACCOUNT + "login"
        const val FORGET  = ACCOUNT + "password/forget"
        const val VERIFY  = ACCOUNT + "verifyotp"
        const val RESET  = ACCOUNT + "password/reset"
        const val CHANGE_PASSWORD = ACCOUNT + "password/change"
        const val RESEND_OTP  = ACCOUNT + "resendotp"
        const val EXTERNAL_LOGIN_CALLBACK  = ACCOUNT + "externallogincallback"
        const val EXTERNAL_LOGIN_CONFIRMATION  = ACCOUNT + "externalloginconfirmation"
        const val SIGN_UP_VERIFICATION = ACCOUNT + "signupverification"

        //Order
        const val CANCEL_ORDER = ORDER + "cancel"

        //Setting service
        const val THIRD_PARTY_CONTENT = SETTING_SERVICE + "thirdpartycontent"
        const val DELIVERY_TIME = SETTING_SERVICE + "deliverytime"

        //Product
        const val LANDING_PAGE_PRODUCT_LIST = PRODUCT + "landingpageproductlist"
        const val PRODUCT_DETAIL = PRODUCT + "detail"
        const val LIST = PRODUCT + "list"
        const val GET_REVIEWS = PRODUCT + "reviews"
        const val SUBMIT_REVIEW = PRODUCT + "rating/save"

        const val BANNERS = LANDING_PAGE + "banners"

        //Category
        const val ALL_CATEGORIES = CATEGORY + "allcategories"

        //Cart
        const val ADD_TO_CART = CART + "add"
        const val MY_CART = CART + "mycart"
        const val DELETE_CART_ITEM = CART + "delete"
        const val UPDATE_CART_ITEM = CART + "update"

        //Customer
        const val ORDERS = CUSTOMER + "/orders"
        const val PROFILE = CUSTOMER + "/profile"
        const val UPDATE_PROFILE = PROFILE + "/update"
        const val ORDER_DETAIL = CUSTOMER + "/order-detail"
        const val WISH_LIST = CUSTOMER + "/wishlist"
        const val ADD_WISH_LIST = CUSTOMER + "/wishlist/add"
        const val DELETE_WISH_LIST_ITEM = CUSTOMER + "/wishlist/deletebyproduct"
        const val CUSTOMER_REVIEWS = CUSTOMER + "/reviews"

    }
}