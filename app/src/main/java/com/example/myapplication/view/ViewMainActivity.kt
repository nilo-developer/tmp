package com.example.myapplication.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.PopupMenu
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.etc.SetFragment
import com.example.myapplication.model.ModelMainActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.view.*
import org.jetbrains.anko.toast

@SuppressLint("ViewConstructor")
class ViewMainActivity(
    context: Context,
    private val setFragment: SetFragment,
) : FrameLayout(context), PopupMenu.OnMenuItemClickListener {

    private val bottomnav: BottomNavigationView
    private val menu: AppCompatImageView

    init {
        val view = inflate(context, R.layout.activity_main, this)
        bottomnav = view.findViewById(R.id.bottomNavigationView)
        menu = view.menu_main
    }

    fun setUpView(itemChecked: Int, mainFragment: Fragment) {
        menu_main.setOnClickListener {
           onCreatePopUpMenu()
        }
        bottomnav.menu.getItem(itemChecked).isChecked = true
        addFragment(mainFragment)
    }

    fun bottomNavonClick(fragments: Map<String, Fragment>) {
        bottomnav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.main_profile -> {
                    replaceFragment(
                        fragments[ModelMainActivity.KEY_ACCOUNT_FRAGMENT] ?: Fragment()
                    )
                    true
                }
                R.id.main_home -> {
                    replaceFragment(
                        fragments[ModelMainActivity.KEY_HOME_FRAGMENT] ?: Fragment()
                    )
                    true
                }
                R.id.main_shop -> {
                    replaceFragment(
                        fragments[ModelMainActivity.KEY_SHOP_FRAGMENT] ?: Fragment()
                    )
                    true
                }
                else -> false
            }
        }
    }

//    fun showtoast(text: String) {
//        context.toast(text)
//    }

//    fun showFragment(fragment: Fragment) {
//        setFragment.addFragment(fragment)
//    }

    private fun addFragment(fragment: Fragment) {
        setFragment.addFragment(fragment)
    }

    private fun replaceFragment(fragment: Fragment) {
        setFragment.replaceFragment(fragment)
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.menu_question -> {
                context.toast("پرسش های متداول")
                true
            }
            R.id.menu_about -> {
                context.toast("درباره ما")
                true
            }
            R.id.menu_call -> {
                context.toast("تماس با ما")
                true
            }

            R.id.menu_failor -> {
                context.toast("گزارش خطا")
                true
            }
            else -> false
        }
    }

    private fun onCreatePopUpMenu(){
        val popUp = PopupMenu(context,menu_main)
        popUp.menuInflater
            .inflate(R.menu.menu_main,popUp.menu)
        popUp.setOnMenuItemClickListener(this)
        popUp.show()
    }
}