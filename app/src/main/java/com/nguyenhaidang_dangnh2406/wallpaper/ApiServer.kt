package com.nguyenhaidang_dangnh2406.wallpaper

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiServer {
    val BASE_URL = "https://www.flickr.com/"
    val getApi: ImageInterface
        get() {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(ImageInterface::class.java)
        }
}