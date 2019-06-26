package io.github.aungkothet.coderswag.controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import io.github.aungkothet.coderswag.R
import io.github.aungkothet.coderswag.adapters.ProductRecyclerAdapter
import io.github.aungkothet.coderswag.services.DataService
import io.github.aungkothet.coderswag.utilities.EXTRA_CATEGORY
import io.github.aungkothet.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    private val TAG = javaClass.simpleName
    lateinit var adapter: ProductRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductRecyclerAdapter(this, categoryType, DataService.getProducts(categoryType)) { product, tag ->
            val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT, product)
            productDetailIntent.putExtra(EXTRA_CATEGORY, tag)
            startActivity(productDetailIntent)
        }

        val orientation =  resources.configuration.orientation
        var spanCount = 2
        if(orientation == Configuration.ORIENTATION_LANDSCAPE) spanCount = 3

        val layoutManager = GridLayoutManager(this,spanCount)

        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }
}
