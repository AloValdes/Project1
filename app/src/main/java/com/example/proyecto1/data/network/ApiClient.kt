package com.example.proyecto1.data.network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient{
    private const val BASE_URL = "https://fakeapi.rickbit.net/fakeapi/public/api/"
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) //JSON Converter
            .build()
            .create(ApiService::class.java)
    }
}