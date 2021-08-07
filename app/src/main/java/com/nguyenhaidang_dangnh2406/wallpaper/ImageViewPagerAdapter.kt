package com.nguyenhaidang_dangnh2406.wallpaper

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.nguyenhaidang_dangnh2406.wallpaper.data.Photo

class ImageViewPagerAdapter(fm: FragmentManager, behavior: Int, var listImage:List<Photo>) :
    FragmentStatePagerAdapter(fm, behavior) {


    override fun getCount(): Int {
       return listImage.size ?: 0
    }

    override fun getItem(position: Int): Fragment {
        var imagePos = listImage[position]
        var imageDetailFragment = ImageDetailFragment()
        var bundle = Bundle()
        bundle.putSerializable("photo",imagePos.urlS)
        imageDetailFragment.arguments = bundle
        return imageDetailFragment
    }
}