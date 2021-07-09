package com.example.myapplication.view.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.product_view.view.*


class ProductView(context: Context, attributes: AttributeSet) : FrameLayout(context, attributes) {
    private val txttitle: AppCompatTextView
    private val txtall: AppCompatTextView
    private val recycle: RecyclerView


    init {
        val mainView = View.inflate(context, R.layout.product_view, this)
        txttitle = mainView.txt_product_title
        txtall = mainView.txt_product_all
        recycle = mainView.recycler_product

        recycle.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,true)
    }
}