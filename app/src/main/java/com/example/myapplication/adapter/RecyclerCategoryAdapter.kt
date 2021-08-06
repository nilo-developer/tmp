package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.item_recycler_category.view.*
import org.jetbrains.anko.toast

class RecyclerCategoryAdapter(
    private val context: Context?,
    private val data: List<String>
) : RecyclerView.Adapter<RecyclerCategoryAdapter.CategoryViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.item_recycler_category,
                    parent,
                    false
                )

        )
    }
    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.setData(data[position])
    }


    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val txtTitle = itemView.txt_title_item_category

        fun setData(data: String) {
            txtTitle.text = data
            txtTitle.setOnClickListener {
                context?.toast(data)
            }
        }
    }


    override fun getItemCount() = data.size

}