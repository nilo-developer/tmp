package com.example.myapplication.presenter

import com.example.myapplication.etc.BaseLifeCycle
import com.example.myapplication.model.ModelMainActivity
import com.example.myapplication.view.ViewMainActivity

class PresenterMainActivity(
    private val view : ViewMainActivity ,
    private val model : ModelMainActivity
) : BaseLifeCycle{

    override fun onCreate() {
//        showtoasthandler()
//        setFragment()
        setUpView()
        setbottomNavonClick()
    }

    private fun setUpView(){
        view.setUpView(model.getitemChecked(),model.getMainFragment())
    }

//    private fun showtoasthandler(){
//        view.showtoast(model.gettext())
//    }

//    fun setFragment(){
//        view.showFragment(model.getFragment())
//    }

    private fun setbottomNavonClick(){
        view.bottomNavonClick(model.getAllFragment())
    }

    override fun onDestroy() {
        TODO("Not yet implemented")
    }
}