package com.example.myapplication.view.customview

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.activity.ArchiveActivity
import com.example.myapplication.adapter.RecyclerItemProductAdapter
import com.example.myapplication.dataClass.DataProduct
import com.example.myapplication.enumeration.TypeGetProduct
import kotlinx.android.synthetic.main.product_view.view.*
import org.jetbrains.anko.startActivity


class ProductView(context: Context, attributes: AttributeSet) : FrameLayout(context, attributes) {

    private val txttitle: AppCompatTextView
    private val txtall: AppCompatTextView
    private val recycle: RecyclerView

    companion object {
        const val TITLE_KEY = "title"
        const val TYPE_KEY = "type"
    }


    init {
        val mainView = inflate(context, R.layout.product_view, this)

        val typedarray = context.obtainStyledAttributes(attributes, R.styleable.ProductView)
        val text = typedarray.getString(R.styleable.ProductView_titleText)
        typedarray.recycle()


        txttitle = mainView.txt_product_title
        txtall = mainView.txt_product_all
        recycle = mainView.recycler_product

        recycle.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
        txttitle.text = text
    }

    fun initRecycler(data: List<DataProduct>, type: TypeGetProduct) {

        txtall.setOnClickListener {
            context.startActivity<ArchiveActivity>(
                TITLE_KEY to txttitle.text.toString(),
                TYPE_KEY to type

            )
        }
        recycle.adapter = RecyclerItemProductAdapter(context, data)
    }
}