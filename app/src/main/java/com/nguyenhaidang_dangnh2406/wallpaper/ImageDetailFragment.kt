package com.nguyenhaidang_dangnh2406.wallpaper

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.nguyenhaidang_dangnh2406.wallpaper.download.DownLoader
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_image_detail.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ImageDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ImageDetailFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    var url = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bundle: Bundle? = arguments

        if (bundle != null) {
            Log.d("Tag", "Bundles ${bundle.get("photo")}")
            url = bundle.get("photo").toString()

        }

        Picasso.get().load(url).into(test)

        detail_dowload_floating_action.setOnClickListener(this)

        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ImageDetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String) =
            ImageDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.detail_dowload_floating_action -> {
                var downloadManager = DownLoader()
                downloadManager.showDownLoad(requireContext(),"https://scontent.fhan5-4.fna.fbcdn.net/v/t1.6435-9/153107776_1100606217103088_4646858894205079265_n.jpg?_nc_cat=104&ccb=1-4&_nc_sid=09cbfe&_nc_ohc=vrc7F76DEhkAX9REZkO&_nc_ht=scontent.fhan5-4.fna&oh=18ce1229a76f517f851dc6e0bfbacdb5&oe=6136706A")
                Toast.makeText(requireContext(), "Downloaded", Toast.LENGTH_SHORT).show()
            }
        }
    }
}