package com.example.myapplication.view

import android.annotation.SuppressLint
import android.content.Context
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.RecyclerItemArchiveAdapter
import com.example.myapplication.dataClass.DataProduct
import com.example.myapplication.enumeration.TypeGetProduct
import com.example.myapplication.etc.Utility
import kotlinx.android.synthetic.main.activity_archive.view.*
import org.jetbrains.anko.toast

@SuppressLint("ViewConstructor")
class ViewArchiveActivity(context: Context, private val utility: Utility) : FrameLayout(context) {

    private val txttitle: AppCompatTextView
    private val imgback: AppCompatImageView
    private val recycle: RecyclerView

    init {
        val mainView = inflate(context, R.layout.activity_archive, this)
        txttitle = mainView.txt_title_archive_activity
        imgback = mainView.img_back_archive_activity
        recycle = mainView.recyclerview_archive_activity

        recycle.layoutManager = GridLayoutManager(context,2,LinearLayoutManager.VERTICAL,false)
    }

    fun setDataInRecycler(data : List<DataProduct>){
            recycle.adapter = RecyclerItemArchiveAdapter(context,data)
    }

    fun setText(type : TypeGetProduct){
        when(type){
            TypeGetProduct.NEW_PRODUCT -> context.toast("new")
            TypeGetProduct.DISCOUNT_PRODUCT-> context.toast("discount")
            else -> context.toast("topSelling")
        }
    }

    fun setTitleText(title : String){
        txttitle.text = title
    }

    fun onClickHandler() {
        imgback.setOnClickListener {
            utility.onFinished()
        }
    }
}