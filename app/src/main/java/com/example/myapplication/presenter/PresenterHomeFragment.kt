package com.example.myapplication.presenter

import com.example.myapplication.etc.BaseLifeCycle
import com.example.myapplication.fragment.HomeFragment
import com.example.myapplication.model.ModelHomeFragment

class PresenterHomeFragment(
    private val view: HomeFragment,
    private val model: ModelHomeFragment
) : BaseLifeCycle {
    override fun onCreate() {
        setData()
    }

    private fun setData(){
        view.setDataRecycler(model.getDataRecycler())
    }

    override fun onDestroy() {

    }
}