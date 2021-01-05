package com.hariagus.storesimple_app.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiServices {

    companion object {
        val BASE_URL = "http://192.168.10.11:8000/api"
        val API_BASE_IMAGES = BASE_URL + "products_images"
    }

    fun getInit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getInstance(): ApiServices {
        return getInit().create(ApiServices::class.java)
    }

}