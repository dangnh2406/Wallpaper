package com.nguyenhaidang_dangnh2406.wallpaper.adapter

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.nguyenhaidang_dangnh2406.wallpaper.DetailImageActivity
import com.nguyenhaidang_dangnh2406.wallpaper.R
import com.nguyenhaidang_dangnh2406.wallpaper.data.Photo
import kotlinx.android.synthetic.main.item_image.view.*
import java.io.Serializable


class ImageHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    val image = itemView.item_avt_img
    val iconFavorite = itemView.item_favorite_img
    val viewNumber = itemView.item_view_txt

    init {
        image.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.item_avt_img -> {
                val position = v.getTag()
                Log.d("tag", "$position}")
                val intent = Intent(itemView.context, DetailImageActivity::class.java)
                Log.d("tag","pos: $position")
                intent.putExtra("pos",position as Int)
                itemView.context.startActivity(intent)
            }
        }
    }


}