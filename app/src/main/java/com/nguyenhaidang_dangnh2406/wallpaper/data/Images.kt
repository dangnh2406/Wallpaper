package com.nguyenhaidang_dangnh2406.wallpaper.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Images {
    @SerializedName("photos")
    @Expose
    var photos: Photos? = null

    @SerializedName("stat")
    @Expose
    var stat: String? = null
}