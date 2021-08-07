package com.nguyenhaidang_dangnh2406.wallpaper.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenhaidang_dangnh2406.wallpaper.ImageInterface
import com.nguyenhaidang_dangnh2406.wallpaper.R
import com.nguyenhaidang_dangnh2406.wallpaper.Test
import com.nguyenhaidang_dangnh2406.wallpaper.data.Photo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_image.view.*

class ImageAdapter(var listImage:List<Photo>):RecyclerView.Adapter<ImageHolder>() {

    companion object{
        var listWallpaper:List<Photo>? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image,parent,false)

        return ImageHolder(view)
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        Picasso.get().load(listImage[position].urlS).into(holder.image)
        holder.viewNumber.text = listImage[position].views
        listWallpaper = listImage
        holder.image.tag = position
        Log.d("Tag","listWallpaper: ${listWallpaper?.size}")

    }

    override fun getItemCount(): Int {
        return listImage.size ?: 0
    }
}