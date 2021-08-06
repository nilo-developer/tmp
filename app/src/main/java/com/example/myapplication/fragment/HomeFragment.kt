package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.RecyclerCategoryAdapter
import com.example.myapplication.dataClass.DataProduct
import com.example.myapplication.enumeration.TypeGetProduct
import com.example.myapplication.presenter.PresenterHomeFragment
import com.example.myapplication.view.customview.ProductView
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject


class HomeFragment : Fragment() {

    private val presenter: PresenterHomeFragment by inject()
    private lateinit var recyclerCategory: RecyclerView
    private lateinit var new_product_recyceler: ProductView
    private lateinit var discount_product_recyceler: ProductView
    private lateinit var topSelling_product_recyceler: ProductView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerCategory = recycle_category_home_fragment

        recycle_category_home_fragment.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
        new_product_recyceler = new_product_home_fragment
        discount_product_recyceler = discount_product_home_fragment
        topSelling_product_recyceler = topSelling_product_home_fragment
        recyclerCategory = recycle_category_home_fragment
        presenter.onCreate()
    }

    fun setDataRecycler(data: List<DataProduct>) {
        new_product_recyceler.initRecycler(data,TypeGetProduct.NEW_PRODUCT)
        discount_product_recyceler.initRecycler(data,TypeGetProduct.DISCOUNT_PRODUCT)
        topSelling_product_recyceler.initRecycler(data,TypeGetProduct.TOP_SELLING_PRODUCT)
    }

    fun setUpRecyclerCategory(data: List<String>) {
        recyclerCategory.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
        recyclerCategory.adapter = RecyclerCategoryAdapter(context, data)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}