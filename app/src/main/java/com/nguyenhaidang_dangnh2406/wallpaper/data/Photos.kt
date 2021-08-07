package com.nguyenhaidang_dangnh2406.wallpaper.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Photos {
    @SerializedName("page")
    @Expose
    var page: Int? = null

    @SerializedName("pages")
    @Expose
    var pages: Int? = null

    @SerializedName("perpage")
    @Expose
    var perpage: Int? = null

    @SerializedName("total")
    @Expose
    var total: String? = null

    @SerializedName("photo")
    @Expose
    var photo: List<Photo>? = null
}