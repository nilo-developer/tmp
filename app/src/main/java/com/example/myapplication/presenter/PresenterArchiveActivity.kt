package com.example.myapplication.presenter

import com.example.myapplication.etc.BaseLifeCycle
import com.example.myapplication.model.ModelArchiveActivity
import com.example.myapplication.view.ViewArchiveActivity

class PresenterArchiveActivity(
    private val view: ViewArchiveActivity,
    private val model: ModelArchiveActivity
) : BaseLifeCycle {
    override fun onCreate() {
        onClickListener()
        setDataInRecycler()
    }

    private fun setDataInRecycler(){
        view.setDataInRecycler(model.getDataInRecycler())
    }

    private fun onClickListener(){
        view.onClickHandler()
    }

    override fun onDestroy() {}
}