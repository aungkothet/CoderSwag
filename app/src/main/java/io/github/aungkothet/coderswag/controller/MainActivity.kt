package io.github.aungkothet.coderswag.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import io.github.aungkothet.coderswag.adapters.CategoryRecyclerAdapter
import io.github.aungkothet.coderswag.R
import io.github.aungkothet.coderswag.services.DataService
import io.github.aungkothet.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var adapter : CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this,DataService.categories){
            val productIntent = Intent(this,ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,it.title)
            startActivity(productIntent)
        }

        categoryListView.adapter = adapter
        val layoutManager =  LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
