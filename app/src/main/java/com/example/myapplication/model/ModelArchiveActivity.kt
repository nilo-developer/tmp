package com.example.myapplication.model

import android.app.Activity
import com.example.myapplication.enumeration.TypeGetProduct
import com.example.myapplication.test.DataTest
import com.example.myapplication.view.customview.ProductView

class ModelArchiveActivity(private val activity: Activity) {
    fun getDataInRecycler() = DataTest.getDataProduct()

    fun getTitleAzIntent() = activity.intent.getStringExtra(ProductView.TITLE_KEY) ?: ""

    fun getTypeProduct() =
        activity.intent.getSerializableExtra(ProductView.TYPE_KEY) as TypeGetProduct
}