package com.example.myapplication.androidWrapper

import android.app.Application
import com.example.myapplication.di.apiModules
import com.example.myapplication.di.fragmentModules
import com.example.myapplication.di.modelModules
import com.example.myapplication.di.presenterModules
import org.koin.android.ext.android.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(applicationContext, listOf(
            fragmentModules,
            modelModules,
            apiModules,
            presenterModules
        ))
    }
}