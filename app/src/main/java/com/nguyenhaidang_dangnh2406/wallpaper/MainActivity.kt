package com.nguyenhaidang_dangnh2406.wallpaper

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager.widget.ViewPager
import com.nguyenhaidang_dangnh2406.wallpaper.adapter.ImageAdapter
import com.nguyenhaidang_dangnh2406.wallpaper.data.Images
import com.nguyenhaidang_dangnh2406.wallpaper.data.Photo
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), NestedScrollView.OnScrollChangeListener{
    val extras =
        "description, license, date_upload, date_taken, owner_name, icon_server, original_format, last_update, geo, tags, machine_tags, o_dims, views, media, path_alias, url_sq, url_t, url_s, url_q, url_m, url_n, url_z, url_c, url_l, url_o"
    var page = 1;
    var listPhoto:MutableList<Photo> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData(page)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            main_nested_scroll_view.setOnScrollChangeListener(this)
        }
    }


    private fun getData(page:Int) {
        val call: Call<Images> = ApiServer.getApi.getListFavo(
            extras,
            "1",
            "191849290@N03",
            "json",
            "c578c97b8cf8ffbea90fbd7264b3b7c0",
            "flickr.favorites.getList",
            page = page,
            10
        )
        call.enqueue(object : Callback<Images> {
            override fun onResponse(call: Call<Images>, response: Response<Images>) {

                Log.d("tag", "${response.body()?.photos?.photo?.size}")
                response.body()?.photos?.photo?.let { listPhoto.addAll(it) }
                main_recycler_view.layoutManager =
                    StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
                main_recycler_view.adapter =  ImageAdapter(listPhoto)
                main_recycler_view.setHasFixedSize(true)
                main_progress_bar.setVisibility(View.INVISIBLE)
            }

            override fun onFailure(call: Call<Images>, t: Throwable) {
                Log.d("tag", "ssss ${t.message.toString()}")
            }
        })
    }

    override fun onScrollChange(
        v: NestedScrollView?,
        scrollX: Int,
        scrollY: Int,
        oldScrollX: Int,
        oldScrollY: Int
    ) {
        if (scrollY == v!!.getChildAt(0).measuredHeight - v.measuredHeight) {
            getData(++page)
            main_progress_bar.visibility = View.VISIBLE
        }
    }


}