package com.example.myapplication.etc

import androidx.fragment.app.Fragment

interface SetFragment {
    fun addFragment(fragment: Fragment)
    fun replaceFragment(fragment: Fragment)
}