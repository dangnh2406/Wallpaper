package com.nguyenhaidang_dangnh2406.wallpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentStatePagerAdapter
import com.nguyenhaidang_dangnh2406.wallpaper.adapter.ImageAdapter
import com.nguyenhaidang_dangnh2406.wallpaper.data.Photo
import kotlinx.android.synthetic.main.activity_detail_image.*

class DetailImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_image)
        val pos = intent.getIntExtra("pos",0);
        Log.d("tag","Pos: $pos")
        detail_image_viewpager.adapter = ImageAdapter.listWallpaper?.let {
            ImageViewPagerAdapter(supportFragmentManager,
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, it
            )
        }

        detail_image_viewpager.setCurrentItem(pos)


    }
}