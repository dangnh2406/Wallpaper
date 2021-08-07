package com.nguyenhaidang_dangnh2406.wallpaper.download

import android.app.DownloadManager
import android.content.Context
import android.content.Context.DOWNLOAD_SERVICE
import android.net.Uri
import androidx.core.content.getSystemService
import java.io.File

class DownLoader {

    fun showDownLoad(context: Context,url:String){
        val file = File(context.getExternalFilesDir(null),"Dummy")

        val request = DownloadManager.Request(Uri.parse(url))
            .setTitle("Dummy file")
            .setDescription("Download")
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
            .setDestinationUri(Uri.fromFile(file))
            .setAllowedOverRoaming(true)

        val downloadManager = context.getSystemService(DOWNLOAD_SERVICE) as DownloadManager?
        var downloadID = downloadManager!!.enqueue(request)// enqueue puts the download request in the queue.
    }

}