package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.dataClass.DataProduct
import com.example.myapplication.presenter.PresenterHomeFragment
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject


class HomeFragment : Fragment() {

    private val presenter: PresenterHomeFragment by inject()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.onCreate()
    }

    fun setDataRecycler(data: List<DataProduct>) {
        new_product_home_fragment.initRecycler(data)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}