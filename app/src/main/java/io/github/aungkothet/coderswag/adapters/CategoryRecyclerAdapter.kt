package io.github.aungkothet.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import io.github.aungkothet.coderswag.model.Category
import io.github.aungkothet.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecyclerAdapter(private val context: Context, private val categories: List<Category>,val itemClick: (Category)-> Unit) :
    RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)

        return  Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(context,categories.get(position))
    }

    inner class Holder(itemView: View,val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage : ImageView = itemView?.categoryImage
        val categoryTitle: TextView = itemView?.categoryName

        fun bindCategory(context: Context,category: Category)
        {
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryTitle?.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}