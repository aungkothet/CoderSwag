package io.github.aungkothet.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.aungkothet.coderswag.R
import io.github.aungkothet.coderswag.model.Product
import io.github.aungkothet.coderswag.services.DataService
import io.github.aungkothet.coderswag.utilities.EXTRA_CATEGORY
import io.github.aungkothet.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val tag = intent.getStringExtra(EXTRA_CATEGORY)
        val imageResourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        productDetailImage.setImageResource(imageResourceId)
        productTitleTextView.text = product.title
        productPrice.text = product.price
        backButton.setOnClickListener {
            finish()
        }
        if (DataService.favouriteProducts.contains(tag)) {
            favouriteButton.isChecked = true
        }
        favouriteButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                if (!DataService.favouriteProducts.contains(tag))
                    DataService.favouriteProducts.add(tag)
            } else
                DataService.favouriteProducts.remove(tag)
            println(DataService.favouriteProducts)
        }

    }

}
