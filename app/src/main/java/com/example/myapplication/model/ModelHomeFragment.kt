package com.example.myapplication.model

import com.example.myapplication.test.DataTest

class ModelHomeFragment {

    fun getDataRecycler() = DataTest.getDataProduct()
    fun getDataCategory() = DataTest.getCategories()
}