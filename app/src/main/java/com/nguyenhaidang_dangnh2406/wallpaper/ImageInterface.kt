package com.nguyenhaidang_dangnh2406.wallpaper

import com.nguyenhaidang_dangnh2406.wallpaper.data.Images
import com.nguyenhaidang_dangnh2406.wallpaper.data.Photos
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageInterface {
    @GET("/services/rest/")
    open fun getListFavo(
        @Query("extras") extras: String?,
        @Query("nojsoncallback") nojsoncallback: String?,
        @Query("user_id") user_id: String?,
        @Query("format") format: String?,
        @Query("api_key") api_key: String?,
        @Query("method") method: String?,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): Call<Images>
}