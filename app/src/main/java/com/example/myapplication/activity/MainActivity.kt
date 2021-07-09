package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.etc.SetFragment
import com.example.myapplication.etc.Utility
import com.example.myapplication.model.ModelMainActivity
import com.example.myapplication.presenter.PresenterMainActivity
import com.example.myapplication.view.ViewMainActivity
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() , SetFragment {

    private val model : ModelMainActivity by inject()
    private lateinit var presenter : PresenterMainActivity
//    private lateinit var mainview : ViewMainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = ViewMainActivity(this,this)
        setContentView(view)

        presenter = PresenterMainActivity(view,model)
        presenter.onCreate()
    }

//    override fun onCreatePopUpMenu(view : View) {
//        val popUp = PopupMenu(this,view)
//        popUp.menuInflater
//            .inflate(R.menu.menu_main,popUp.menu)
//        popUp.setOnMenuItemClickListener(mainview)
//        popUp.show()
//    }

    override fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().add(R.id.main_frame,fragment).commit()
    }

    override fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.main_frame,fragment).commit()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

}