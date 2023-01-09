package com.example.mvvmandjetpack.retrofitServices;

public class WebConfig {
    public static final String BASE_URL = "https://bmlonline-dev-us.uc.r.appspot.com/";
    public static final String UPLOAD_IMAGE_URL = "https://bmlovideo-dev-us.uc.r.appspot.com/v1/api/media/uploadimage?";
    public static final String URL = BASE_URL + "v1/api/";

    public static class Headers {
        public static final String API_KEY = "api-security-key";
        public static final String AUTHORIZATION = "Authorization";
    }
}