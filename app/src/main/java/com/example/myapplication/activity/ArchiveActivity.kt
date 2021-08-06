package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.etc.Utility
import com.example.myapplication.model.ModelArchiveActivity
import com.example.myapplication.presenter.PresenterArchiveActivity
import com.example.myapplication.view.ViewArchiveActivity

class ArchiveActivity : AppCompatActivity() , Utility{


    private lateinit var presenter: PresenterArchiveActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = ViewArchiveActivity(this,this)
        setContentView(view)

        val model = ModelArchiveActivity(this)

        presenter = PresenterArchiveActivity(view,model)
        presenter.onCreate()
    }

    override fun onFinished() {
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter.onDestroy()
    }
}