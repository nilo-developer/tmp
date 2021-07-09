package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.dataClass.DataProduct
import com.example.myapplication.utility.PicassoUtility
import kotlinx.android.synthetic.main.item_recycler_product_view.view.*
import org.jetbrains.anko.toast
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class RecyclerItemProductAdapter(private val context : Context , private val data: List<DataProduct>) :
    RecyclerView.Adapter<RecyclerItemProductAdapter.ItemProductViewHolder>() {

    inner class ItemProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),KoinComponent {
        private val  picasso : PicassoUtility by inject()
        private val rootView = itemView.const_recycle_product_view
        private val img = itemView.img_recycle_product_view
        private val title = itemView.txt_title_recycle_product_view
        private val price = itemView.txt_price_recycle_product_view
        private val discount = itemView.customTextView_discount


        fun setData(data : DataProduct) {
            title.text = data.title
            picasso.setImage(data.imgAddress , img)

            if(data.discount){
                discount.visibility = View.VISIBLE
                discount.setCustomText(data.price)
                price.text = data.pricediscount
            }else{
                discount.visibility = View.INVISIBLE
                price.text = data.price
            }

            rootView.setOnClickListener {
                context.toast("onClick")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ItemProductViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_recycler_product_view,
                parent,
                false
            )
        )

    override fun getItemCount() = data.size


    override fun onBindViewHolder(holder: ItemProductViewHolder, position: Int) {
        holder.setData(data[position])
    }
}