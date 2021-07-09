package com.example.myapplication.di

import com.example.myapplication.fragment.AccountFragment
import com.example.myapplication.fragment.HomeFragment
import com.example.myapplication.fragment.ShopFragment
import com.example.myapplication.model.ModelHomeFragment
import com.example.myapplication.model.ModelMainActivity
import com.example.myapplication.presenter.PresenterHomeFragment
import org.koin.dsl.module.module

val fragmentModules = module {
    single { HomeFragment() }
    single { AccountFragment() }
    single { ShopFragment() }
}
val modelModules = module {
    single { ModelMainActivity() }
    single { ModelHomeFragment() }
}
val apiModules = module {  }
val presenterModules = module {
    single { PresenterHomeFragment(get() as HomeFragment,get() as ModelHomeFragment) }
}