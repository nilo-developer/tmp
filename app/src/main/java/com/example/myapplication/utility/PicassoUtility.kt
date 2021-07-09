package com.example.myapplication.utility

import android.widget.ImageView
import com.example.myapplication.R
import com.squareup.picasso.Picasso
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class PicassoUtility : KoinComponent {

    private val picasso: Picasso by inject()


    fun setImage(address: String, img: ImageView) {
        picasso
            .load(address)
            .placeholder(R.drawable.ic__26578_load_loading_spinner_icon)
            .error(R.drawable.ic__99045_sign_error_icon)
            .fit()
            .into(img)
    }
}