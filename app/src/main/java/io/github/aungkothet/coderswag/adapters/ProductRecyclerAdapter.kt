package io.github.aungkothet.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.aungkothet.coderswag.R
import io.github.aungkothet.coderswag.model.Product
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductRecyclerAdapter(
    val context: Context, val category: String, val producsts: List<Product>,
    val itemClick: (Product, String) -> Unit
) :
    RecyclerView.Adapter<ProductRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ViewHolder(view, category, itemClick)
    }

    override fun getItemCount(): Int {
        return producsts.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindProduct(producsts.get(position), context, position)
    }


    inner class ViewHolder(itemView: View, val category: String, val itemClick: (Product, String) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        private val productImage = itemView.productImage
        private val productTitle = itemView.productTitle
        private val productPrice = itemView.productPrice

        fun bindProduct(product: Product, context: Context, position: Int) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(resourceId)
            productPrice.text = product.price
            productTitle.text = product.title
            itemView.setOnClickListener { itemClick(product, "$category$position") }
        }

    }
}