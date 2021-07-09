package com.example.myapplication.etc

interface BaseLifeCycle {

    fun onCreate()
    fun onDestroy()
    fun onResume(){}
    fun onStop(){}
}