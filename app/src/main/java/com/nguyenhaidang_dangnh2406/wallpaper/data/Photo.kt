package com.nguyenhaidang_dangnh2406.wallpaper.data

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable


class Photo() : Parcelable {


    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("owner")
    @Expose
    var owner: String? = null

    @SerializedName("secret")
    @Expose
    var secret: String? = null

    @SerializedName("server")
    @Expose
    var server: String? = null

    @SerializedName("farm")
    @Expose
    var farm: Int? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("ispublic")
    @Expose
    var ispublic: Int? = null

    @SerializedName("isfriend")
    @Expose
    var isfriend: Int? = null

    @SerializedName("isfamily")
    @Expose
    var isfamily: Int? = null

    @SerializedName("license")
    @Expose
    var license: String? = null

    @SerializedName("description")
    @Expose
    var description: Description? = null

    @SerializedName("dateupload")
    @Expose
    var dateupload: String? = null

    @SerializedName("lastupdate")
    @Expose
    var lastupdate: String? = null

    @SerializedName("datetaken")
    @Expose
    var datetaken: String? = null

    @SerializedName("datetakengranularity")
    @Expose
    var datetakengranularity: String? = null

    @SerializedName("datetakenunknown")
    @Expose
    var datetakenunknown: String? = null

    @SerializedName("ownername")
    @Expose
    var ownername: String? = null

    @SerializedName("iconserver")
    @Expose
    var iconserver: String? = null

    @SerializedName("iconfarm")
    @Expose
    var iconfarm: Int? = null

    @SerializedName("views")
    @Expose
    var views: String? = null

    @SerializedName("tags")
    @Expose
    var tags: String? = null

    @SerializedName("machine_tags")
    @Expose
    var machineTags: String? = null

    @SerializedName("originalsecret")
    @Expose
    var originalsecret: String? = null

    @SerializedName("originalformat")
    @Expose
    var originalformat: String? = null

    @SerializedName("date_faved")
    @Expose
    var dateFaved: String? = null

    @SerializedName("latitude")
    @Expose
    var latitude: String? = null

    @SerializedName("longitude")
    @Expose
    var longitude: String? = null

    @SerializedName("accuracy")
    @Expose
    var accuracy: Int? = null

    @SerializedName("context")
    @Expose
    var context: Int? = null

    @SerializedName("media")
    @Expose
    var media: String? = null

    @SerializedName("media_status")
    @Expose
    var mediaStatus: String? = null

    @SerializedName("url_sq")
    @Expose
    var urlSq: String? = null

    @SerializedName("height_sq")
    @Expose
    var heightSq: Int? = null

    @SerializedName("width_sq")
    @Expose
    var widthSq: Int? = null

    @SerializedName("url_t")
    @Expose
    var urlT: String? = null

    @SerializedName("height_t")
    @Expose
    var heightT: Int? = null

    @SerializedName("width_t")
    @Expose
    var widthT: Int? = null

    @SerializedName("url_s")
    @Expose
    var urlS: String? = null

    @SerializedName("height_s")
    @Expose
    var heightS: Int? = null

    @SerializedName("width_s")
    @Expose
    var widthS: Int? = null

    @SerializedName("url_q")
    @Expose
    var urlQ: String? = null

    @SerializedName("height_q")
    @Expose
    var heightQ: Int? = null

    @SerializedName("width_q")
    @Expose
    var widthQ: Int? = null

    @SerializedName("url_m")
    @Expose
    var urlM: String? = null

    @SerializedName("height_m")
    @Expose
    var heightM: Int? = null

    @SerializedName("width_m")
    @Expose
    var widthM: Int? = null

    @SerializedName("url_n")
    @Expose
    var urlN: String? = null

    @SerializedName("height_n")
    @Expose
    var heightN: Int? = null

    @SerializedName("width_n")
    @Expose
    var widthN: Int? = null

    @SerializedName("url_z")
    @Expose
    var urlZ: String? = null

    @SerializedName("height_z")
    @Expose
    var heightZ: Int? = null

    @SerializedName("width_z")
    @Expose
    var widthZ: Int? = null

    @SerializedName("url_c")
    @Expose
    var urlC: String? = null

    @SerializedName("height_c")
    @Expose
    var heightC: Int? = null

    @SerializedName("width_c")
    @Expose
    var widthC: Int? = null

    @SerializedName("url_l")
    @Expose
    var urlL: String? = null

    @SerializedName("height_l")
    @Expose
    var heightL: Int? = null

    @SerializedName("width_l")
    @Expose
    var widthL: Int? = null

    @SerializedName("url_o")
    @Expose
    var urlO: String? = null

    @SerializedName("height_o")
    @Expose
    var heightO: Int? = null

    @SerializedName("width_o")
    @Expose
    var widthO: Int? = null

    @SerializedName("pathalias")
    @Expose
    var pathalias: Any? = null

    @SerializedName("o_width")
    @Expose
    private var oWidth: String? = null

    @SerializedName("o_height")
    @Expose
    private var oHeight: String? = null

    @SerializedName("place_id")
    @Expose
    var placeId: String? = null

    @SerializedName("woeid")
    @Expose
    var woeid: String? = null

    @SerializedName("geo_is_public")
    @Expose
    var geoIsPublic: Int? = null

    @SerializedName("geo_is_contact")
    @Expose
    var geoIsContact: Int? = null

    @SerializedName("geo_is_friend")
    @Expose
    var geoIsFriend: Int? = null

    @SerializedName("geo_is_family")
    @Expose
    var geoIsFamily: Int? = null

    constructor(parcel: Parcel) : this() {
        id = parcel.readString()
        owner = parcel.readString()
        secret = parcel.readString()
        server = parcel.readString()
        farm = parcel.readValue(Int::class.java.classLoader) as? Int
        title = parcel.readString()
        ispublic = parcel.readValue(Int::class.java.classLoader) as? Int
        isfriend = parcel.readValue(Int::class.java.classLoader) as? Int
        isfamily = parcel.readValue(Int::class.java.classLoader) as? Int
        license = parcel.readString()
        dateupload = parcel.readString()
        lastupdate = parcel.readString()
        datetaken = parcel.readString()
        datetakengranularity = parcel.readString()
        datetakenunknown = parcel.readString()
        ownername = parcel.readString()
        iconserver = parcel.readString()
        iconfarm = parcel.readValue(Int::class.java.classLoader) as? Int
        views = parcel.readString()
        tags = parcel.readString()
        machineTags = parcel.readString()
        originalsecret = parcel.readString()
        originalformat = parcel.readString()
        dateFaved = parcel.readString()
        latitude = parcel.readString()
        longitude = parcel.readString()
        accuracy = parcel.readValue(Int::class.java.classLoader) as? Int
        context = parcel.readValue(Int::class.java.classLoader) as? Int
        media = parcel.readString()
        mediaStatus = parcel.readString()
        urlSq = parcel.readString()
        heightSq = parcel.readValue(Int::class.java.classLoader) as? Int
        widthSq = parcel.readValue(Int::class.java.classLoader) as? Int
        urlT = parcel.readString()
        heightT = parcel.readValue(Int::class.java.classLoader) as? Int
        widthT = parcel.readValue(Int::class.java.classLoader) as? Int
        urlS = parcel.readString()
        heightS = parcel.readValue(Int::class.java.classLoader) as? Int
        widthS = parcel.readValue(Int::class.java.classLoader) as? Int
        urlQ = parcel.readString()
        heightQ = parcel.readValue(Int::class.java.classLoader) as? Int
        widthQ = parcel.readValue(Int::class.java.classLoader) as? Int
        urlM = parcel.readString()
        heightM = parcel.readValue(Int::class.java.classLoader) as? Int
        widthM = parcel.readValue(Int::class.java.classLoader) as? Int
        urlN = parcel.readString()
        heightN = parcel.readValue(Int::class.java.classLoader) as? Int
        widthN = parcel.readValue(Int::class.java.classLoader) as? Int
        urlZ = parcel.readString()
        heightZ = parcel.readValue(Int::class.java.classLoader) as? Int
        widthZ = parcel.readValue(Int::class.java.classLoader) as? Int
        urlC = parcel.readString()
        heightC = parcel.readValue(Int::class.java.classLoader) as? Int
        widthC = parcel.readValue(Int::class.java.classLoader) as? Int
        urlL = parcel.readString()
        heightL = parcel.readValue(Int::class.java.classLoader) as? Int
        widthL = parcel.readValue(Int::class.java.classLoader) as? Int
        urlO = parcel.readString()
        heightO = parcel.readValue(Int::class.java.classLoader) as? Int
        widthO = parcel.readValue(Int::class.java.classLoader) as? Int
        oWidth = parcel.readString()
        oHeight = parcel.readString()
        placeId = parcel.readString()
        woeid = parcel.readString()
        geoIsPublic = parcel.readValue(Int::class.java.classLoader) as? Int
        geoIsContact = parcel.readValue(Int::class.java.classLoader) as? Int
        geoIsFriend = parcel.readValue(Int::class.java.classLoader) as? Int
        geoIsFamily = parcel.readValue(Int::class.java.classLoader) as? Int
    }

    fun getoWidth(): String? {
        return oWidth
    }

    fun setoWidth(oWidth: String?) {
        this.oWidth = oWidth
    }

    fun getoHeight(): String? {
        return oHeight
    }

    fun setoHeight(oHeight: String?) {
        this.oHeight = oHeight
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(owner)
        parcel.writeString(secret)
        parcel.writeString(server)
        parcel.writeValue(farm)
        parcel.writeString(title)
        parcel.writeValue(ispublic)
        parcel.writeValue(isfriend)
        parcel.writeValue(isfamily)
        parcel.writeString(license)
        parcel.writeString(dateupload)
        parcel.writeString(lastupdate)
        parcel.writeString(datetaken)
        parcel.writeString(datetakengranularity)
        parcel.writeString(datetakenunknown)
        parcel.writeString(ownername)
        parcel.writeString(iconserver)
        parcel.writeValue(iconfarm)
        parcel.writeString(views)
        parcel.writeString(tags)
        parcel.writeString(machineTags)
        parcel.writeString(originalsecret)
        parcel.writeString(originalformat)
        parcel.writeString(dateFaved)
        parcel.writeString(latitude)
        parcel.writeString(longitude)
        parcel.writeValue(accuracy)
        parcel.writeValue(context)
        parcel.writeString(media)
        parcel.writeString(mediaStatus)
        parcel.writeString(urlSq)
        parcel.writeValue(heightSq)
        parcel.writeValue(widthSq)
        parcel.writeString(urlT)
        parcel.writeValue(heightT)
        parcel.writeValue(widthT)
        parcel.writeString(urlS)
        parcel.writeValue(heightS)
        parcel.writeValue(widthS)
        parcel.writeString(urlQ)
        parcel.writeValue(heightQ)
        parcel.writeValue(widthQ)
        parcel.writeString(urlM)
        parcel.writeValue(heightM)
        parcel.writeValue(widthM)
        parcel.writeString(urlN)
        parcel.writeValue(heightN)
        parcel.writeValue(widthN)
        parcel.writeString(urlZ)
        parcel.writeValue(heightZ)
        parcel.writeValue(widthZ)
        parcel.writeString(urlC)
        parcel.writeValue(heightC)
        parcel.writeValue(widthC)
        parcel.writeString(urlL)
        parcel.writeValue(heightL)
        parcel.writeValue(widthL)
        parcel.writeString(urlO)
        parcel.writeValue(heightO)
        parcel.writeValue(widthO)
        parcel.writeString(oWidth)
        parcel.writeString(oHeight)
        parcel.writeString(placeId)
        parcel.writeString(woeid)
        parcel.writeValue(geoIsPublic)
        parcel.writeValue(geoIsContact)
        parcel.writeValue(geoIsFriend)
        parcel.writeValue(geoIsFamily)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Photo> {
        override fun createFromParcel(parcel: Parcel): Photo {
            return Photo(parcel)
        }

        override fun newArray(size: Int): Array<Photo?> {
            return arrayOfNulls(size)
        }
    }


}