package com.istts.healthforyou

import android.app.Application
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class App: Application() {
    companion object{
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        val retrofit = Retrofit.Builder().addConverterFactory(
            MoshiConverterFactory.create(moshi)
        ).baseUrl("https://4a79-182-253-50-87.ngrok-free.app/").build()
        val retrofitService = retrofit.create(AppService::class.java)
    }
    override fun onCreate() {
        super.onCreate()
    }
}