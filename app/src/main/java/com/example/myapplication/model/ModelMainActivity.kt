package com.example.myapplication.model

import androidx.fragment.app.Fragment
import com.example.myapplication.fragment.AccountFragment
import com.example.myapplication.fragment.HomeFragment
import com.example.myapplication.fragment.ShopFragment
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class ModelMainActivity : KoinComponent {
    private val homeFragment: HomeFragment by inject()
    private val accountFragment: AccountFragment by inject()
    private val shopFragment: ShopFragment by inject()

companion object{
    const val KEY_HOME_FRAGMENT = "homeFragment"
    const val KEY_ACCOUNT_FRAGMENT = "accountFragment"
    const val KEY_SHOP_FRAGMENT = "shopFragment"
}

//    fun gettext() = "test"

    //    fun getFragment() = AccountFragment()
    fun getitemChecked() = 1
    fun getMainFragment() = homeFragment

    fun getAllFragment() = mapOf<String, Fragment>(
        KEY_HOME_FRAGMENT to HomeFragment(),
        KEY_ACCOUNT_FRAGMENT to AccountFragment(),
        KEY_SHOP_FRAGMENT to ShopFragment()
    )
}