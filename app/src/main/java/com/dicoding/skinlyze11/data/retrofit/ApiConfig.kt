package com.dicoding.skinlyze11.data.retrofit

//import com.example.skinlyze11.BuildConfig
//import com.example.skinlyze11.data.local.datastore.AuthPreference
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {

    private var AUTH_URL : String = "https://skinlyze-backend-249825855363.asia-southeast2.run.app/api-docs/"


}