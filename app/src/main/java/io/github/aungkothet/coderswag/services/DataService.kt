package io.github.aungkothet.coderswag.services

import io.github.aungkothet.coderswag.model.Category
import io.github.aungkothet.coderswag.model.Product
import kotlin.random.Random

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITALS", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITALS", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITALS", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Deveslopes Graphic Beanie", "$ ${Random.nextInt(50, 100)}", "hat1"),
        Product("Deveslopes Hat Black", "$ ${Random.nextInt(50, 100)}", "hat2"),
        Product("Deveslopes Hat White", "$ ${Random.nextInt(50, 100)}", "hat3"),
        Product("Deveslopes Hat Snapback", "$ ${Random.nextInt(50, 100)}", "hat4"),
        Product("Deveslopes Graphic Beanie", "$ ${Random.nextInt(50, 100)}", "hat1"),
        Product("Deveslopes Hat Black", "$ ${Random.nextInt(50, 100)}", "hat2"),
        Product("Deveslopes Hat White", "$ ${Random.nextInt(50, 100)}", "hat3"),
        Product("Deveslopes Hat Snapback", "$ ${Random.nextInt(50, 100)}", "hat4"),
        Product("Deveslopes Graphic Beanie", "$ ${Random.nextInt(50, 100)}", "hat1"),
        Product("Deveslopes Hat Black", "$ ${Random.nextInt(50, 100)}", "hat2"),
        Product("Deveslopes Hat White", "$ ${Random.nextInt(50, 100)}", "hat3"),
        Product("Deveslopes Hat Snapback", "$ ${Random.nextInt(50, 100)}", "hat4")
    )

    val hoodies = listOf(
        Product("Deveslopes Hoodies Gray", "$ ${Random.nextInt(50, 100)}", "hoodie1"),
        Product("Deveslopes Hoodies Black", "$ ${Random.nextInt(50, 100)}", "hoodie2"),
        Product("Deveslopes Sexy Hoodies", "$ ${Random.nextInt(50, 100)}", "hoodie3"),
        Product("Deveslopes Graphic Hoodies", "$ ${Random.nextInt(50, 100)}", "hoodie4"),
        Product("Deveslopes Hoodies Gray", "$ ${Random.nextInt(50, 100)}", "hoodie1"),
        Product("Deveslopes Hoodies Black", "$ ${Random.nextInt(50, 100)}", "hoodie2"),
        Product("Deveslopes Sexy Hoodies", "$ ${Random.nextInt(50, 100)}", "hoodie3"),
        Product("Deveslopes Graphic Hoodies", "$ ${Random.nextInt(50, 100)}", "hoodie4"),
        Product("Deveslopes Hoodies Gray", "$ ${Random.nextInt(50, 100)}", "hoodie1"),
        Product("Deveslopes Hoodies Black", "$ ${Random.nextInt(50, 100)}", "hoodie2"),
        Product("Deveslopes Sexy Hoodies", "$ ${Random.nextInt(50, 100)}", "hoodie3"),
        Product("Deveslopes Graphic Hoodies", "$ ${Random.nextInt(50, 100)}", "hoodie4")
    )

    val shirts = listOf(
        Product("Deveslopes Shirts White", "$ ${Random.nextInt(50, 100)}", "shirt1"),
        Product("Deveslopes Shirts Black", "$ ${Random.nextInt(50, 100)}", "shirt2"),
        Product("Deveslopes Sexy Shirts", "$ ${Random.nextInt(50, 100)}", "shirt3"),
        Product("Deveslopes Couple Shirts", "$ ${Random.nextInt(50, 100)}", "shirt4"),
        Product("Deveslopes Shirts White", "$ ${Random.nextInt(50, 100)}", "shirt1"),
        Product("Deveslopes Shirts Black", "$ ${Random.nextInt(50, 100)}", "shirt2"),
        Product("Deveslopes Sexy Shirts", "$ ${Random.nextInt(50, 100)}", "shirt3"),
        Product("Deveslopes Couple Shirts", "$ ${Random.nextInt(50, 100)}", "shirt4"),
        Product("Deveslopes Shirts White", "$ ${Random.nextInt(50, 100)}", "shirt1"),
        Product("Deveslopes Shirts Black", "$ ${Random.nextInt(50, 100)}", "shirt2"),
        Product("Deveslopes Sexy Shirts", "$ ${Random.nextInt(50, 100)}", "shirt3"),
        Product("Deveslopes Couple Shirts", "$ ${Random.nextInt(50, 100)}", "shirt4")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category:String): List<Product> {

        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }

    var favouriteProducts = arrayListOf<String>()
}